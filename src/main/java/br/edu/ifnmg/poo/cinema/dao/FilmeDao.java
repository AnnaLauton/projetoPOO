/* 
 * Material destinado ao projeto da disciplina
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.cinema.dao;

import br.edu.ifnmg.poo.cinema.entity.Filme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Operações utilizadas pela classe Filme
 *
 * @author Anna Júlia, Matteus Felippe, Talita Rodrigues
 * @version 1.0, 15/12/2020
 */
public class FilmeDao {//Responsável a adicionar um filme no cinema

    public void adicionar(Filme f) {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        PreparedStatement pst2 = null;
        ResultSet rs = null;
        try {
            pst = conexao.prepareStatement("SELECT Max(idfilme)+1 FROM filme"); //Responsável por pegar o maior número do ID + 1
            rs = pst.executeQuery();
            while (rs.next()) {
                try {
                    pst2 = conexao.prepareStatement("INSERT INTO filme(idfilme,nome,classificacao,sinopse,genero) VALUES (?,?,?,?,?)"); //Prepara a inserção dos valores de um filme
                    if (rs.getString("Max(idfilme)+1") == null) { //Se ainda não tiver registro em filme, o id será 1 (pois será o primeiro)
                        pst2.setInt(1, 1);
                    } else { //Caso tenha registro, o id será o maior número do id +1
                        pst2.setInt(1, rs.getInt("Max(idfilme)+1"));
                    }
                    pst2.setString(2, f.getNome());//coloca no insert as informações do nome
                    pst2.setString(3, f.getClassificacao());//coloca no insert as informações da classificação
                    pst2.setString(4, f.getSinopse());//coloca no insert as informações da sinopse
                    pst2.setString(5, f.getGenero());//coloca no insert as informações do gênero
                    int adicionado = pst2.executeUpdate();//realiza o update
                    if (adicionado > 0) {
                        JOptionPane.showMessageDialog(null, "Filme adicionado com sucesso");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public List<Filme> read() { //Responsável por ler as informações de um filme.
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Filme> filmes = new ArrayList<>(); //Cria uma lista de filmes
        try {
            pst = conexao.prepareStatement("SELECT * FROM filme"); //Prepara a seleção de todos os filmes
            rs = pst.executeQuery();//executa a seleção
            while (rs.next()) {
                Filme filme = new Filme();//cria um novo filme
                filme.setIdfilme(rs.getInt("idfilme")); //pega as informações retornadas pelo select relacionadas ao id do filme e coloca em filme
                filme.setNome(rs.getString("nome"));//pega as informações retornadas pelo select relacionadas ao nome e coloca em filme
                filme.setClassificacao(rs.getString("classificacao"));//pega as informações retornadas pelo select relacionadas a classificação e e coloca em filme
                filme.setGenero(rs.getString("genero"));//pega as informações retornadas pelo select relacionadas ao gênero e coloca em filme
                filme.setSinopse(rs.getString("sinopse"));  //pega as informações retornadas pelo select relacionadas a sinopse e coloca em filme
                filmes.add(filme); //Adiciona filme na lista de filmes
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return filmes;
    }
}
