/* 
 * Material destinado ao projeto da disciplina
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.cinema.dao;

import br.edu.ifnmg.poo.cinema.entity.Ingresso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Operações utilizadas pela classe Ingresso
 *
 * @author Anna Júlia, Matteus Felippe, Talita Rodrigues
 * @version 1.0, 15/12/2020
 */
public class IngressoDao {

    public void cadastrar(Ingresso i) { //Cadastra um ingresso no cinema
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        PreparedStatement pst2 = null;
        ResultSet rs = null;
        try {
            pst = conexao.prepareStatement("SELECT Max(idingresso)+1 FROM ingresso"); //Seleciona o maior número + 1 do idingresso para ser o novo id
            rs = pst.executeQuery(); //Executa o select
            while (rs.next()) {
                try {
                    pst2 = conexao.prepareStatement("INSERT INTO ingresso(idingresso,idsessaopertence) VALUES (?,?)"); //Faz o insert para receber os valores
                    if (rs.getString("Max(idingresso)+1") == null) { //Se não tiver nenhum registro em idingresso, não houve cadastro ainda, então o ID é 1
                        pst2.setInt(1, 1);
                    } else { //Caso já tenha registro, o id será o maior+1
                        pst2.setInt(1, rs.getInt("Max(idingresso)+1"));
                    }
                    pst2.setInt(2, i.getIdSessaoPertence()); //Coloca o valor referente ao id da sessão que pertence
                    int adicionado = pst2.executeUpdate(); //Executa o Update
                    if (adicionado > 0) { //Se tive ocorrido o update, mostra que foi cadastrado
                        JOptionPane.showMessageDialog(null, "Ingresso cadastrado com sucesso");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public List<Ingresso> read() { //Lê as informações referentes a um ingresso.
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Ingresso> ingressos = new ArrayList<>();//Cria uma lista de ingressos
        try {
            pst = conexao.prepareStatement("SELECT * FROM ingresso"); //Prepara o Select para pegar todas as informações do ingresso.
            rs = pst.executeQuery(); //executa o select.
            while (rs.next()) {
                Ingresso ingresso = new Ingresso(); //Cria um novo ingresso
                ingresso.setIdIngresso(rs.getInt("idingresso")); //ingresso recebe as informações sobre o id do ingresso
                ingresso.setCpfClienteCompra(rs.getString("cpfclientecompra")); //pega o cpf do cliente que compra
                ingresso.setCpfFuncionarioVenda(rs.getString("cpffuncionariovenda")); //pega o cpf do funcionário que vende
                ingresso.setIdSessaoPertence(rs.getInt("idsessaopertence")); //pega o id de uma sessão que o ingresso pertence
                ingressos.add(ingresso); //adiciona na lista de ingressos.
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ingressos;
    }

    public void vender(Ingresso i) { //Responsável pela venda de um ingresso.
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        PreparedStatement pst2 = null;
        ResultSet rs = null;
        try {
            pst = conexao.prepareStatement("SELECT * FROM ingresso where idingresso=?"); //Prepara o select para pegar as informações do ingresso
            pst.setInt(1, i.getIdIngresso()); //coloca o id do ingresso no select
            rs = pst.executeQuery(); //executa o select
            while (rs.next()) {
                if (rs.getString("cpfclientecompra") == null || rs.getString("cpfclientecompra").isEmpty()) { //Se nenhum cliente comprou o ingresso, ele estará disponível para a compra.
                    try {
                        pst2 = conexao.prepareStatement("UPDATE ingresso set cpfclientecompra=?,cpffuncionariovenda=? where idingresso=?"); //prepara o update, pra colocar as informações do comprador do ingresso e de quem vendeu.
                        pst2.setString(1, i.getCpfClienteCompra()); //Coloca o cpf do cliente que comprou
                        pst2.setString(2, i.getCpfFuncionarioVenda()); //Coloca o cpf do funcionário que vendeu.
                        pst2.setInt(3, i.getIdIngresso()); //coloca o id do ingresso que foi vendido
                        int adicionado = pst2.executeUpdate(); //executa o update
                        if (adicionado > 0) {
                            JOptionPane.showMessageDialog(null, "Ingresso vendido com sucesso");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingresso já foi vendido");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
