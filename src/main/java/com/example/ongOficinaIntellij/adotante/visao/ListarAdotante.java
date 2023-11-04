/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.ongOficinaIntellij.adotante.visao;

import com.example.ongOficinaIntellij.adotante.controller.AdotanteController;
import com.example.ongOficinaIntellij.adotante.entidade.AdotanteModelo;
import com.example.ongOficinaIntellij.funcionario.controller.FuncionarioController;
import com.example.ongOficinaIntellij.funcionario.entidade.FuncionarioModelo;
import com.example.ongOficinaIntellij.home.visao.home;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 *
 * @author Thalita
 */
public class ListarAdotante extends javax.swing.JFrame {

    /**
     * Creates new form ListarAdotante
     */
    public ListarAdotante() {

        initComponents();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPesqNome = new javax.swing.JTextField();
        txtPesqCpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Consulta de Adotantes");

        txtPesqNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqNomeActionPerformed(evt);
            }
        });

        txtPesqCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqCpfActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone", "Endereço", "Email", "Renda", "Tipo de Moradia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesqNome, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesqCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnVoltar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesqNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPesqCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        AdotanteController adotanteController = new AdotanteController();
           this.atualizaTabela(adotanteController.getByCPFOrName(txtPesqCpf.getText(), txtPesqNome.getText()));
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtPesqNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesqNomeActionPerformed

    private void txtPesqCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesqCpfActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        JButton botaoExcluir = new JButton("Excluir Registro");
        int resposta = 1;

        if (selectedRow != -1) {
            //botaoExcluir.addActionListener(e -> {
             resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Tem certeza de que deseja excluir cadastro de: " +
                            (String) jTable1.getValueAt(selectedRow, 1)
                            +"?",
                    "Confirmação de Exclusão",
                    JOptionPane.YES_NO_OPTION
            );
        }

            if (resposta == JOptionPane.YES_OPTION) {
                if (selectedRow != -1) {
                    Long idAdotante = (Long) jTable1.getValueAt(selectedRow, 0);
                    AdotanteController adotanteController = new AdotanteController();
                    adotanteController.delete(idAdotante);
                    preencherTabela();

                    // Código para excluir o registro
                    JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um adotante para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            //}
        //);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        home tela = new home();
        tela.show();
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            Long idAdotante = (Long) jTable1.getValueAt(selectedRow, 0);

            CadastroAdotante tela = new CadastroAdotante(idAdotante);
                tela.show();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um adotante para editar.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarAdotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarAdotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarAdotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarAdotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarAdotante().setVisible(true);
            }
        });
    }

    private void atualizaTabela(List<AdotanteModelo> adotantes) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Limpa a tabela

        for (AdotanteModelo adotante : adotantes) {
            Object[] rowData = {
                    adotante.getId(),
                    adotante.getNome(),
                    adotante.getCpf(),
                    adotante.getTelefone(),
                    adotante.getEndereco(),
                    adotante.getEmail(),
                    adotante.getRenda(),
                    adotante.getTpMoradia()
            };
            model.addRow(rowData);
        }
    }


    private void preencherTabela() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Limpa a tabela

        AdotanteController adotanteController = new AdotanteController();
        List<AdotanteModelo> adotantes = AdotanteController.getList();

        for (AdotanteModelo adotante : adotantes) {
            Object[] rowData = {
                    adotante.getId(),
                    adotante.getNome(),
                    adotante.getCpf(),
                    adotante.getTelefone(),
                    adotante.getEndereco(),
                    adotante.getEmail(),
                    adotante.getRenda(),
                    adotante.getTpMoradia()
            };
            model.addRow(rowData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtPesqCpf;
    private javax.swing.JTextField txtPesqNome;
    // End of variables declaration//GEN-END:variables
}
