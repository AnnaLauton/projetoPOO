/* 
 * Material destinado ao projeto da disciplina
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.cinema.gui;

import br.edu.ifnmg.poo.cinema.dao.FuncionarioDao;
import br.edu.ifnmg.poo.cinema.entity.Funcionario;
import javax.swing.JOptionPane;

/**
 * Janela responsável por alterar funcionários
 *
 * @author Anna Júlia, Matteus Felippe, Talita Rodrigues
 * @version 1.0, 15/12/2020
 */
public class TelaAlterarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaAlterarFuncionario
     */
    public TelaAlterarFuncionario() {
        initComponents();
        FuncionarioDao dao = new FuncionarioDao();
        for (Funcionario f : dao.read()) { //Lê todos os cadastros de funcionário
            cbCpfAlterar.addItem(f);//Adiciona no comboBox as informações do funcionário
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtAlterarEmail = new javax.swing.JTextField();
        txtAlterarNome = new javax.swing.JTextField();
        txtAlterarEndereco = new javax.swing.JTextField();
        cbAlterarTipoFuncionario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbCpfAlterar = new javax.swing.JComboBox<>();
        btnAlterar = new javax.swing.JButton();
        txtAlterarSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setText("Tipo Funcionario");

        cbAlterarTipoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "adm", "vnd" }));

        jLabel1.setText("CPF *");

        jLabel2.setText("Email *");

        jLabel3.setText("Senha");

        jLabel4.setText("Nome");

        jLabel5.setText("Endereco");

        cbCpfAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCpfAlterarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAlterarEmail)
                            .addComponent(txtAlterarEndereco)
                            .addComponent(cbAlterarTipoFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAlterarNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(cbCpfAlterar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAlterarSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btnAlterar)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbCpfAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAlterarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAlterarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbAlterarTipoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAlterarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnAlterar)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(486, 375));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbCpfAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCpfAlterarActionPerformed
        Funcionario f = (Funcionario) cbCpfAlterar.getSelectedItem(); //Pega o item selecionado no ComboBox
        txtAlterarEmail.setText(f.getEmail());//Mostra na tela as informações do email do item selecionado
        txtAlterarSenha.setText(f.getSenha());//Mostra na tela as informações da senha do item selecionado
        txtAlterarEndereco.setText(f.getEndereco());//Mostra na tela as informações do endereco do item selecionado
        cbAlterarTipoFuncionario.setSelectedItem(f.getTipofuncionario());//Mostra na tela as informações do tipo do funcionario do item selecionado
        txtAlterarNome.setText(f.getNome());//Mostra na tela as informações do nome do item selecionado
    }//GEN-LAST:event_cbCpfAlterarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        if (txtAlterarEmail.getText().isEmpty()) {//Se não estiver preenchido todos os campos obrigatorios, pede para preencher
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios");
        } else {
            Funcionario f = (Funcionario) cbCpfAlterar.getSelectedItem(); //Pega o item selecionado em funcionário
            Funcionario ff = new Funcionario();
            ff.setCpf(f.getCpf());//pega o cpf do funcionário
            ff.setEmail(txtAlterarEmail.getText());//Pega o texto digitado no campo de email
            ff.setSenha(txtAlterarSenha.getText());//Pega o texto digitado no campo de senha
            ff.setNome(txtAlterarNome.getText());//Pega o texto digitado no campo de nome
            ff.setEndereco(txtAlterarEndereco.getText());//Pega o texto digitado no campo de endereço
            ff.setTipofuncionario(cbAlterarTipoFuncionario.getSelectedItem().toString());//Pega o texto digitado no campo de tipo do funcionário
            new FuncionarioDao().atualizar(ff);//Chama o método para atualizar
        }


    }//GEN-LAST:event_btnAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JComboBox<String> cbAlterarTipoFuncionario;
    public static javax.swing.JComboBox<Object> cbCpfAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAlterarEmail;
    private javax.swing.JTextField txtAlterarEndereco;
    private javax.swing.JTextField txtAlterarNome;
    private javax.swing.JTextField txtAlterarSenha;
    // End of variables declaration//GEN-END:variables
}
