/* 
 * Material destinado ao projeto da disciplina
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.cinema.dao;

import br.edu.ifnmg.poo.cinema.entity.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Operações utilizadas pela classe Cliente
 *
 * @author Anna Júlia, Matteus Felippe, Talita Rodrigues
 * @version 1.0, 15/12/2020
 */
public class ClienteDao {

    public void adicionar(Cliente c) { //Responsável por adicionar as informações sobre um cliente
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        String sql = "INSERT INTO cliente(cpfcliente,nomecliente,telefonecliente,emailcliente) VALUES (?,?,?,?)"; //Prepata o insert que irá acontecer na tabela do cliente
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, c.getCpfCliente());//coloca no insert as informações do cpf do cliente
            pst.setString(2, c.getNomeCliente());//coloca no insert as informações do nome do cliente
            pst.setString(3, c.getTelefoneCliente());//coloca no insert as informações do telefone do cliente
            pst.setString(4, c.getEmailCliente());//coloca no insert as informações do email do cliente
            int adicionado = pst.executeUpdate();
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public List<Cliente> read() { //Responsável por ler as informações referentes a um cliente
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>(); //Cria uma lista de clientes
        try {
            pst = conexao.prepareStatement("SELECT * FROM cliente"); //Prepara o select para pegar todas as informações de cliente 
            rs = pst.executeQuery();//executa o select
            while (rs.next()) {
                Cliente cliente = new Cliente();//cria um cliente
                cliente.setCpfCliente(rs.getString("cpfcliente")); //coloca no cliente as informações retornadas no select sobre o cpf do cliente
                cliente.setEmailCliente(rs.getString("emailcliente"));//coloca no cliente as informações retornadas no select sobre o email do cliente
                cliente.setNomeCliente(rs.getString("nomecliente"));//coloca no cliente as informações retornadas no select sobre o nome do cliente
                cliente.setTelefoneCliente(rs.getString("telefonecliente"));//coloca no cliente as informações retornadas no select sobre o telefoe do cliente
                clientes.add(cliente);//Adiciona na lista os valores do cliente
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return clientes;
    }

    public void atualizar(Cliente c) {//Responsável por atualizar as informações referentes ao cliente
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        try {
            pst = conexao.prepareStatement("UPDATE cliente set nomecliente=?,telefonecliente=?,emailcliente=? where cpfcliente=?");//Prepara o update
            pst.setString(1, c.getNomeCliente()); //coloca no update a informação do nome do cliente
            pst.setString(2, c.getTelefoneCliente());//coloca no update a informação do telefone do cliente
            pst.setString(3, c.getEmailCliente());//coloca no update a informação do email do cliente
            pst.setString(4, c.getCpfCliente());//coloca no update a informação do cpf do cliente

            int adicionado = pst.executeUpdate(); //executa o update
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
