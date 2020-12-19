/* 
 * Material destinado ao projeto da disciplina
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.cinema.dao;

import br.edu.ifnmg.poo.cinema.entity.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Operações utilizadas pela classe Funcionario
 *
 * @author Anna Júlia, Matteus Felippe, Talita Rodrigues
 * @version 1.0, 15/12/2020
 */
public class FuncionarioDao {

    public Boolean logar(Funcionario f) { //Responsável por logar um usuário no sistema
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conexao.prepareStatement("SELECT * FROM funcionario WHERE email=? AND senha=?"); //Prepara o SELECT para encontrar as informações referentes ao email e senha que foram inseridos
            pst.setString(1, f.getEmail()); //Coloca no select a informação do email
            pst.setString(2, f.getSenha()); //Coloca no select a informação da senha
            rs = pst.executeQuery(); //Executa o select
            if (rs.next()) {
                f.setCpf(rs.getString(1)); //Coloca em CPF as informações de quem realizou o login
                f.setTipofuncionario(rs.getString(6)); //Coloca o tipo de quem realizou o login
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "usuário e/ou senha inválido(s)");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        return false;
    }

    public void adicionar(Funcionario f) { //Adiciona um funcionário no sistema
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        String sql = "INSERT INTO funcionario(cpf,email,senha,nome,endereco,tipofuncionario) VALUES (?,?,?,?,?,?)"; //Prepara o insert com os valores de funcionário
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, f.getCpf());//coloca no insert os valores do cpf
            pst.setString(2, f.getEmail());//coloca no insert os valores do email
            pst.setString(3, f.getSenha());//coloca no insert os valores de senha
            pst.setString(4, f.getNome());//coloca no insert os valores dos nomes
            pst.setString(5, f.getEndereco());//coloca no insert os valores do endereço
            pst.setString(6, f.getTipofuncionario());//coloca no insert os valores do tipo do funcionário
            int adicionado = pst.executeUpdate();//executa o update
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario adicionado com sucesso");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public List<Funcionario> read() { //Responsável por ler os dados de um funcionário
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Funcionario> funcionarios = new ArrayList<>(); //Cria uma nova lista de funcionários
        try {
            pst = conexao.prepareStatement("SELECT * FROM funcionario"); //Prepara o select para pegar todas as informações de um funcionário
            rs = pst.executeQuery();//executa o select
            while (rs.next()) {
                Funcionario funcionario = new Funcionario(); //Cria um novo funcionário para salvar as informações da tabela
                funcionario.setCpf(rs.getString("cpf"));//coloca o resultado do cpf em funcionário
                funcionario.setEmail(rs.getString("email"));//coloca o resultado do email em funcionário
                funcionario.setEndereco(rs.getString("endereco"));//coloca o resultado do endereco em funcionário
                funcionario.setNome(rs.getString("nome"));//coloca o resultado do nome em funcionário
                funcionario.setSenha(rs.getString("senha"));//coloca o resultado da senha em funcionário
                funcionario.setTipofuncionario(rs.getString("tipofuncionario"));//coloca o resultado do ripofuncionario em funcionário
                funcionarios.add(funcionario);// adiciona os valores de funcionário na lista
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return funcionarios;
    }

    public void excluir(Funcionario f) {//Exclui os valores dos funcionários
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        try {
            pst = conexao.prepareStatement("delete from funcionario where cpf=?"); //Prepara para excluir uma linha da tabela de funcionário
            pst.setString(1, f.getCpf()); //coloca o valor do cpf no delete
            int apagado = pst.executeUpdate(); //executa o delete
            if (apagado > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario removido com sucesso");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void atualizar(Funcionario f) { //Responsável por atualizar as informações referentes ao funcionário.
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        try {
            pst = conexao.prepareStatement("UPDATE funcionario set email=?,tipofuncionario=?,senha=?,nome=?,endereco=? where cpf=?"); //Prepara o update
            pst.setString(1, f.getEmail()); //coloca no update a informação do email pra ser inserido
            pst.setString(2, f.getTipofuncionario());//coloca no update a informação do tipofuncionario pra ser inserido
            pst.setString(3, f.getSenha());//coloca no update a informação da senha pra ser inserida
            pst.setString(4, f.getNome());//coloca no update a informação do nome pra ser inserido
            pst.setString(5, f.getEndereco());//coloca no update a informação do endereço pra ser inserido
            pst.setString(6, f.getCpf());//coloca no update a informação do cpf pra ser inserido
            int adicionado = pst.executeUpdate();
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
