/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author nicol
 */
public class ConfiguracoesDeCanaisUsuarioSenha extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public ConfiguracoesDeCanaisUsuarioSenha() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InformaSenha = new javax.swing.JPasswordField();
        VoltarButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        InformaUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CadastroIdConta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CadastroCanal = new javax.swing.JTextField();
        SalvarConta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configurações de Canais");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(InformaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 260, 50));

        VoltarButton.setBackground(new java.awt.Color(45, 18, 75));
        VoltarButton.setFont(new java.awt.Font("Inter", 1, 25)); // NOI18N
        VoltarButton.setForeground(new java.awt.Color(255, 255, 255));
        VoltarButton.setText("VOLTAR");
        VoltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VoltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 150, 50));

        jLabel5.setFont(new java.awt.Font("Inter", 1, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Configurações de Canais");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 400, 50));

        jLabel11.setFont(new java.awt.Font("Inter", 1, 19)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Senha:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 180, -1));

        jLabel10.setFont(new java.awt.Font("Inter", 1, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Usuário:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 180, -1));

        InformaUsuario.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        InformaUsuario.setForeground(new java.awt.Color(0, 0, 0));
        InformaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformaUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(InformaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 260, 50));

        jLabel8.setFont(new java.awt.Font("Inter", 1, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ID da conta:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 180, -1));

        CadastroIdConta.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        CadastroIdConta.setForeground(new java.awt.Color(0, 0, 0));
        CadastroIdConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroIdContaActionPerformed(evt);
            }
        });
        getContentPane().add(CadastroIdConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 260, 50));

        jLabel7.setFont(new java.awt.Font("Inter", 1, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Canal:");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 60, 20));

        CadastroCanal.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        CadastroCanal.setForeground(new java.awt.Color(0, 0, 0));
        CadastroCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroCanalActionPerformed(evt);
            }
        });
        getContentPane().add(CadastroCanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 260, 50));

        SalvarConta.setBackground(new java.awt.Color(252, 121, 0));
        SalvarConta.setFont(new java.awt.Font("Inter", 1, 25)); // NOI18N
        SalvarConta.setForeground(new java.awt.Color(255, 255, 255));
        SalvarConta.setText("SALVAR");
        SalvarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarContaActionPerformed(evt);
            }
        });
        getContentPane().add(SalvarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 150, 50));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/logo.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setName(""); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 280, 80));

        jLabel3.setBackground(new java.awt.Color(45, 18, 75));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 950, 30));

        jLabel2.setBackground(new java.awt.Color(255, 62, 21));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 90));

        jLabel1.setBackground(new java.awt.Color(245, 245, 245));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 590));

        jLabel9.setFont(new java.awt.Font("Inter", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nome Completo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 180, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalvarContaActionPerformed

    private void CadastroCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroCanalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroCanalActionPerformed

    private void CadastroIdContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroIdContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroIdContaActionPerformed

    private void InformaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InformaUsuarioActionPerformed

    private void VoltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VoltarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ConfiguracoesDeCanaisUsuarioSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesDeCanaisUsuarioSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesDeCanaisUsuarioSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesDeCanaisUsuarioSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiguracoesDeCanaisUsuarioSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CadastroCanal;
    private javax.swing.JTextField CadastroIdConta;
    private javax.swing.JPasswordField InformaSenha;
    private javax.swing.JTextField InformaUsuario;
    private javax.swing.JButton SalvarConta;
    private javax.swing.JButton VoltarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}