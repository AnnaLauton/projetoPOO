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
 * Janela responsável por excluir funcionario
 *
 * @author Anna Júlia, Matteus Felippe, Talita Rodrigues
 * @version 1.0, 15/12/2020
 */
public class TelaExcluirFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaExcluirFuncionario
     */
    public TelaExcluirFuncionario() {
        initComponents();
        FuncionarioDao dao = new FuncionarioDao();
        for (Funcionario f : dao.read()) { //Lê todos os funcionários cadastrados
            cbExcluirFuncionario.addItem(f);//adiciona no comboBox as informações do funcionário
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

        jLabel1 = new javax.swing.JLabel();
        cbExcluirFuncionario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtExcluirCpf = new javax.swing.JLabel();
        txtExcluirEmail = new javax.swing.JLabel();
        txtExcluirNome = new javax.swing.JLabel();
        txtExcluirEndereco = new javax.swing.JLabel();
        txtExcluirTipo = new javax.swing.JLabel();
        btnExcluirFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Selecione:");

        cbExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbExcluirFuncionarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Cpf");

        jLabel3.setText("Email");

        jLabel4.setText("Nome");

        jLabel5.setText("Endereco");

        jLabel6.setText("Tipo Funcionario");

        txtExcluirCpf.setText("cpf");

        txtExcluirEmail.setText("email");

        txtExcluirNome.setText("nome");

        txtExcluirEndereco.setText("endereco");

        txtExcluirTipo.setText("tipo");

        btnExcluirFuncionario.setText("Excluir");
        btnExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbExcluirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExcluirCpf)
                            .addComponent(txtExcluirEmail)
                            .addComponent(txtExcluirNome)
                            .addComponent(txtExcluirEndereco)
                            .addComponent(txtExcluirTipo))))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExcluirFuncionario)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbExcluirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtExcluirCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtExcluirEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtExcluirNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtExcluirEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtExcluirTipo))
                .addGap(18, 18, 18)
                .addComponent(btnExcluirFuncionario)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(495, 346));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbExcluirFuncionarioActionPerformed
        // TODO add your handling code here:
        Funcionario funcionario = (Funcionario) cbExcluirFuncionario.getSelectedItem(); //Pega os itens de funcionário que estão selecionados no ComboBox
        txtExcluirCpf.setText(funcionario.getCpf()); //Coloca na tela o valor do cpf que possuia no comboBox
        txtExcluirEmail.setText(funcionario.getEmail());//Coloca na tela o valor do email que possuia no comboBox
        txtExcluirEndereco.setText(funcionario.getEndereco());//Coloca na tela o valor do endereco que possuia no comboBox
        txtExcluirNome.setText(funcionario.getNome());//Coloca na tela o valor do nome que possuia no comboBox
        txtExcluirTipo.setText(funcionario.getTipofuncionario());//Coloca na tela o valor do tipo que possuia no comboBox
    }//GEN-LAST:event_cbExcluirFuncionarioActionPerformed

    private void btnExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFuncionarioActionPerformed
        // TODO add your handling code here:
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover?", "Atenção", JOptionPane.YES_NO_OPTION); //Pergunta se realmente quer excluir um funcionário
        if (confirma == JOptionPane.YES_OPTION) {
            Funcionario f = (Funcionario) cbExcluirFuncionario.getSelectedItem(); //Pega o funcionário selecionado no ComboBox
            new FuncionarioDao().excluir(f); //Chama o método de excluir passa esse funcionário
            cbExcluirFuncionario.removeItem(f); //Remove do comboBox o método excluído
        }
    }//GEN-LAST:event_btnExcluirFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaExcluirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExcluirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExcluirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExcluirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExcluirFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirFuncionario;
    public static javax.swing.JComboBox<Object> cbExcluirFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel txtExcluirCpf;
    private javax.swing.JLabel txtExcluirEmail;
    private javax.swing.JLabel txtExcluirEndereco;
    private javax.swing.JLabel txtExcluirNome;
    private javax.swing.JLabel txtExcluirTipo;
    // End of variables declaration//GEN-END:variables
}