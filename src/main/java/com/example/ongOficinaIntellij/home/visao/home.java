/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.ongOficinaIntellij.home.visao;

import com.example.ongOficinaIntellij.funcionario.visao.CadastroVoluntario;
import com.example.ongOficinaIntellij.funcionario.visao.ListarVoluntarios;

/**
 *
 * @author Thalita
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuCadAnimal = new javax.swing.JMenuItem();
        jMenuCadVoluntario = new javax.swing.JMenuItem();
        jMenuCadAdotante = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuListaAnimais = new javax.swing.JMenuItem();
        jMenuListaAdotante = new javax.swing.JMenuItem();
        jMenuListaVoluntario = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled.png"))); // NOI18N

        jButton1.setText("Sair");

        jMenuBar1.setAutoscrolls(true);

        jMenu1.setText("Cadastrar");

        jMenuCadAnimal.setText("Animal");
        jMenuCadAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadAnimalActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadAnimal);

        jMenuCadVoluntario.setText("Voluntário");
        jMenuCadVoluntario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadVoluntarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadVoluntario);

        jMenuCadAdotante.setText("Adotante");
        jMenuCadAdotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadAdotanteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadAdotante);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultar");

        jMenuListaAnimais.setText("Animais Disponíveis");
        jMenuListaAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListaAnimaisActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuListaAnimais);

        jMenuListaAdotante.setText("Relatório de Adotantes");
        jMenuListaAdotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListaAdotanteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuListaAdotante);

        jMenuListaVoluntario.setText("Relatório de Voluntários");
        jMenuListaVoluntario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListaVoluntarioActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuListaVoluntario);

        jMenuBar1.add(jMenu2);

        jMenu7.setText("Aprovar");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadVoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadVoluntarioActionPerformed
//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        CadastroVoluntario tela = new CadastroVoluntario(null);
        tela.show();
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadVoluntarioActionPerformed

    private void jMenuCadAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadAnimalActionPerformed

    private void jMenuCadAdotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadAdotanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadAdotanteActionPerformed

    private void jMenuListaAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListaAnimaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuListaAnimaisActionPerformed

    private void jMenuListaAdotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListaAdotanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuListaAdotanteActionPerformed

    private void jMenuListaVoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListaVoluntarioActionPerformed
//bbbbbbbbbbbbbbbbbbbbbbbbbb
        ListarVoluntarios tela = new ListarVoluntarios();
        tela.show();
        this.dispose();


    }//GEN-LAST:event_jMenuListaVoluntarioActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadAdotante;
    private javax.swing.JMenuItem jMenuCadAnimal;
    private javax.swing.JMenuItem jMenuCadVoluntario;
    private javax.swing.JMenuItem jMenuListaAdotante;
    private javax.swing.JMenuItem jMenuListaAnimais;
    private javax.swing.JMenuItem jMenuListaVoluntario;
    // End of variables declaration//GEN-END:variables
}
