/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author u08774796151
 */
public class JFrmPrincipalPage extends javax.swing.JFrame {

    /**
     * Creates new form JFrmPrincipalPage
     */
    public JFrmPrincipalPage() {
        initComponents();
        setTitle("Cafeteria");
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMnUsuarios = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMnProdutos = new javax.swing.JMenuItem();
        jMnFornecedores = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuAgendamento = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu.setMnemonic('C');
        jMenu.setText("Cadastro");

        jMnUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnUsuarios.setText("Usuarios");
        jMnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnUsuariosActionPerformed(evt);
            }
        });
        jMenu.add(jMnUsuarios);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Funcionarios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItem4);

        jMnProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        jMnProdutos.setText("Produtos");
        jMnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnProdutosActionPerformed(evt);
            }
        });
        jMenu.add(jMnProdutos);

        jMnFornecedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK));
        jMnFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        jMnFornecedores.setText("Fornecedores");
        jMnFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnFornecedoresActionPerformed(evt);
            }
        });
        jMenu.add(jMnFornecedores);
        jMenu.add(jSeparator1);

        jMnSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jMnSair.setText("Sair");
        jMnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnSairActionPerformed(evt);
            }
        });
        jMenu.add(jMnSair);

        jMenuBar1.add(jMenu);

        jMenu2.setMnemonic('M');
        jMenu2.setText("Movimento");

        jMenuAgendamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aluguel.png"))); // NOI18N
        jMenuAgendamento.setText("Compras");
        jMenuAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgendamentoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuAgendamento);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Compras Produto");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMnSairActionPerformed

    private void jMnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnUsuariosActionPerformed
        // TODO add your handling code here:
        JDlgUsuarios jdlgUsuarios = new JDlgUsuarios(null,true);
        jdlgUsuarios.setVisible(true);
    }//GEN-LAST:event_jMnUsuariosActionPerformed

    private void jMnFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnFornecedoresActionPerformed
       
    }//GEN-LAST:event_jMnFornecedoresActionPerformed

    private void jMnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnProdutosActionPerformed
       
    }//GEN-LAST:event_jMnProdutosActionPerformed

    private void jMenuAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgendamentoActionPerformed
        
    }//GEN-LAST:event_jMenuAgendamentoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipalPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuAgendamento;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMnFornecedores;
    private javax.swing.JMenuItem jMnProdutos;
    private javax.swing.JMenuItem jMnSair;
    private javax.swing.JMenuItem jMnUsuarios;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
