/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ConfiguracoesAtivasTokenController;
import DAO.ConfiguracaoCanalDAO;
import Model.ConfiguracaoCanais;
import Helper.ConfiguracoesCanaisTokenHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nicol
 */
public class ConfiguracoesAtivasToken extends javax.swing.JFrame {

    private final ConfiguracoesAtivasTokenController controller;

    /**
     * Creates new form MainLogin
     */
    public ConfiguracoesAtivasToken() {
        initComponents();
        listarValores();
        controller = new ConfiguracoesAtivasTokenController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        minhaConta = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCanaisDaConta = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        usuariobutton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        excluirButtonToken = new javax.swing.JButton();
        selectPesquisaToken = new javax.swing.JComboBox<>();
        campoPesquisaToken = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configurações Ativas");
        setMinimumSize(new java.awt.Dimension(750, 700));
        setPreferredSize(new java.awt.Dimension(1513, 752));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                listar(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 62, 21));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(45, 18, 75));
        jPanel2.setPreferredSize(new java.awt.Dimension(920, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/logo.png"))); // NOI18N
        jPanel5.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(260, 30));

        minhaConta.setBackground(new java.awt.Color(255, 255, 255));
        minhaConta.setFont(new java.awt.Font("Inter", 1, 22)); // NOI18N
        minhaConta.setText("USER");
        minhaConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minhaContaMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/logged.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(minhaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minhaConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.add(jPanel12, java.awt.BorderLayout.LINE_END);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setToolTipText("");
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(850, 530));
        jPanel7.setPreferredSize(new java.awt.Dimension(920, 40));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel2.setText("Configurações Ativas");
        jPanel7.add(jLabel2, new java.awt.GridBagConstraints());

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        TabelaCanaisDaConta.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        TabelaCanaisDaConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "REGISTRO", "CANAL", "ID DA CONTA", "TOKEN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaCanaisDaConta.setRowHeight(22);
        jScrollPane1.setViewportView(TabelaCanaisDaConta);

        jPanel9.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(1207, 100));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel3.setText("Pesquise:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 44, 0, 0);
        jPanel8.add(jLabel3, gridBagConstraints);

        voltarButton.setBackground(new java.awt.Color(45, 18, 75));
        voltarButton.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        voltarButton.setForeground(new java.awt.Color(255, 255, 255));
        voltarButton.setText("NOVO CANAL");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 20, 0, 0);
        jPanel8.add(voltarButton, gridBagConstraints);

        usuariobutton.setBackground(new java.awt.Color(45, 18, 75));
        usuariobutton.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        usuariobutton.setForeground(new java.awt.Color(255, 255, 255));
        usuariobutton.setText("CANAIS COM USUÁRIO");
        usuariobutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariobuttonMouseClicked(evt);
            }
        });
        usuariobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariobuttonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 52;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 20, 0, 0);
        jPanel8.add(usuariobutton, gridBagConstraints);

        editarButton.setBackground(new java.awt.Color(45, 18, 75));
        editarButton.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        editarButton.setForeground(new java.awt.Color(255, 255, 255));
        editarButton.setText("EDITAR");
        editarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarButtonMouseClicked(evt);
            }
        });
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 20, 0, 0);
        jPanel8.add(editarButton, gridBagConstraints);

        excluirButtonToken.setBackground(new java.awt.Color(45, 18, 75));
        excluirButtonToken.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        excluirButtonToken.setForeground(new java.awt.Color(255, 255, 255));
        excluirButtonToken.setText("EXCLUIR");
        excluirButtonToken.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirButtonTokenMouseClicked(evt);
            }
        });
        excluirButtonToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonTokenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 280, 0, 0);
        jPanel8.add(excluirButtonToken, gridBagConstraints);

        selectPesquisaToken.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        selectPesquisaToken.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registro", "Canal", "Token" }));
        selectPesquisaToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPesquisaTokenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 44, 8, 0);
        jPanel8.add(selectPesquisaToken, gridBagConstraints);

        campoPesquisaToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaTokenActionPerformed(evt);
            }
        });
        campoPesquisaToken.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaTokenKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 190;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 12, 8, 0);
        jPanel8.add(campoPesquisaToken, gridBagConstraints);

        jPanel10.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel6.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        this.controller.voltarCanais();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void usuariobuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariobuttonMouseClicked
        this.controller.acessarConfigUsuario();
    }//GEN-LAST:event_usuariobuttonMouseClicked

    private void usuariobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariobuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariobuttonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarButtonActionPerformed

    private void editarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarButtonMouseClicked
        setarCampos();
        
    }//GEN-LAST:event_editarButtonMouseClicked

    private void listar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_listar
        listarValores();
    }//GEN-LAST:event_listar

    private void excluirButtonTokenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirButtonTokenMouseClicked
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir este canal?", "Aviso", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION){
            if (TabelaCanaisDaConta.getSelectedRow() != -1){
                ConfiguracaoCanais configCanal = new ConfiguracaoCanais();
                ConfiguracaoCanalDAO dao = new ConfiguracaoCanalDAO();

                configCanal.setIdCanal((int) TabelaCanaisDaConta.getValueAt(TabelaCanaisDaConta.getSelectedRow(), 0));
                dao.deletar_configToken(configCanal);

                listarValores();
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um canal da tabela");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Exclusao cancelada");
        }
    }//GEN-LAST:event_excluirButtonTokenMouseClicked

    private void excluirButtonTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonTokenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirButtonTokenActionPerformed

    private void campoPesquisaTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaTokenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaTokenActionPerformed

    private void campoPesquisaTokenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaTokenKeyReleased
        filtrarPesquisaToken();
    }//GEN-LAST:event_campoPesquisaTokenKeyReleased

    private void selectPesquisaTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPesquisaTokenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectPesquisaTokenActionPerformed

    private void minhaContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minhaContaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_minhaContaMouseClicked

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
            java.util.logging.Logger.getLogger(ConfiguracoesAtivasToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesAtivasToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesAtivasToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesAtivasToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiguracoesAtivasToken().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaCanaisDaConta;
    private javax.swing.JTextField campoPesquisaToken;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton excluirButtonToken;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minhaConta;
    private javax.swing.JComboBox<String> selectPesquisaToken;
    private javax.swing.JButton usuariobutton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables

    public JTable getTabelaCanaisContaAções() {
        return TabelaCanaisDaConta;
    }

    public void setTabelaCanaisContaAções(JTable TabelaCanaisContaAções) {
        this.TabelaCanaisDaConta = TabelaCanaisContaAções;
    }
    
    public void exportar(ConfiguracoesCanaisTokenHelper configuracoesCanaisTokenHelper) {
        minhaConta.setText(configuracoesCanaisTokenHelper.getUser());
    }
    
    public JLabel getMinhaConta() {
        return minhaConta;
    }

    public void setMinhaConta(JLabel minhaConta) {
        this.minhaConta = minhaConta;
    }
    
    //Função para listar os valores do banco em uma lista para usar na tabela
    public void listarValores() {
        try {
            
            ConfiguracaoCanalDAO configuracaoCanalDAO = new ConfiguracaoCanalDAO();
            
            DefaultTableModel model = (DefaultTableModel) TabelaCanaisDaConta.getModel();
            model.setNumRows(0);
            
            ArrayList<ConfiguracaoCanais> lista = configuracaoCanalDAO.pesquisarCanais();
            
            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[] { 
                    lista.get(num).getIdToken(),
                    lista.get(num).getNomeCanal(),
                    lista.get(num).getIdConta(),
                    lista.get(num).getToken()
                });
            }
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void setarCampos() {
        if (TabelaCanaisDaConta.getSelectedRow() != -1){
            EditarToken editarTokens = new EditarToken();
            int setar = TabelaCanaisDaConta.getSelectedRow();

            editarTokens.setVisible(true);
            editarTokens.getEditRegistro().setText(TabelaCanaisDaConta.getModel().getValueAt(setar,0).toString());
            editarTokens.getEditCanal().setText(TabelaCanaisDaConta.getModel().getValueAt(setar,1).toString());
            editarTokens.getEditIDConta().setText(TabelaCanaisDaConta.getModel().getValueAt(setar,2).toString());
            editarTokens.getEditToken().setText(TabelaCanaisDaConta.getModel().getValueAt(setar,3).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um canal da tabela");
        }
        

    }
    
    public JTextField getCampoPesquisa() {
            return campoPesquisaToken;
    }

    public void setCampoPesquisaToken(JTextField campoPesquisaToken) {
        this.campoPesquisaToken = campoPesquisaToken;
    }

    public JComboBox<String> getSelectPesquisaToken() {
        return selectPesquisaToken;
    }

    public void setSelectPesquisaToken(JComboBox<String> selectPesquisa) {
        this.selectPesquisaToken = selectPesquisaToken;
    }
    
    public void filtrarPesquisaToken() {
        String tipo = "";
        String escolha = selectPesquisaToken.getSelectedItem().toString().trim();

        if (escolha.equals("Registro")) {
            tipo = " " + "id_canal_token";
        }

        if (escolha.equals("Canal")) {
            tipo = " " + "nome_canal_token";
        }

        if (escolha.equals("Token")) {
            tipo = " " + "token_canal";
        }

        String arg = campoPesquisaToken.getText();

        DefaultTableModel mp1 = (DefaultTableModel) TabelaCanaisDaConta.getModel();
        int l = mp1.getRowCount();

        if (l > 0) {
            while (l > 0) {
                ((DefaultTableModel) TabelaCanaisDaConta.getModel()).removeRow(1-1);
                l--;
            }
        }

        try {
            ResultSet rs = ConfiguracaoCanalDAO.carregaTabelaToken(tipo, arg);

            DefaultTableModel mp = (DefaultTableModel) TabelaCanaisDaConta.getModel();

            while(rs.next()){
                String coluna0 = rs.getString("id_canal_token").toString().trim();
                String coluna1 = rs.getString("nome_canal_token").toString().trim();
                String coluna2 = rs.getString("id_conta_token").toString().trim();
                String coluna3 = rs.getString("token_canal").toString().trim();

                mp.addRow(new String[] {coluna0, coluna1, coluna2, coluna3});
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

