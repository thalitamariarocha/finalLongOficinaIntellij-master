/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.ongOficinaIntellij.home.visao;

import com.example.ongOficinaIntellij.Animal.visao.CadastroAnimal;
import com.example.ongOficinaIntellij.Animal.visao.ListarAnimal;
import com.example.ongOficinaIntellij.Utils.UserCache;
import com.example.ongOficinaIntellij.adocao.visao.AprovaAdocao;
import com.example.ongOficinaIntellij.adocao.visao.ConsultaAdocao;
import com.example.ongOficinaIntellij.adotante.visao.CadastroAdotante;
import com.example.ongOficinaIntellij.adotante.visao.ListarAdotante;
import com.example.ongOficinaIntellij.funcionario.controller.FuncionarioController;
import com.example.ongOficinaIntellij.funcionario.entidade.FuncionarioModelo;
import com.example.ongOficinaIntellij.funcionario.visao.CadastroVoluntario;
import com.example.ongOficinaIntellij.funcionario.visao.ListarVoluntario;
import com.example.ongOficinaIntellij.ong.visao.CadastroOng;
import com.example.ongOficinaIntellij.ong.visao.ListarONG;

import javax.swing.*;

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
        jMenuCadOng = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuListaAnimais = new javax.swing.JMenuItem();
        jMenuListaAdotante = new javax.swing.JMenuItem();
        jMenuListaVoluntario = new javax.swing.JMenuItem();
        jMenuListaOng = new javax.swing.JMenuItem();
        jMenuStatusAdocao = new javax.swing.JMenuItem();
        jMenuaprovar = new javax.swing.JMenu();
        jMenuAprovarAdocao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled.png"))); // NOI18N

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jMenuCadOng.setText("ONG");
        jMenuCadOng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadOngActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadOng);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultar");

        jMenuListaAnimais.setText("Relatório de Animais");
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

        jMenuListaOng.setText("Relatório de ONG");
        jMenuListaOng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListaOngActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuListaOng);

        jMenuStatusAdocao.setText("Status das Adoções");
        jMenuStatusAdocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuStatusAdocaoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuStatusAdocao);

        jMenuBar1.add(jMenu2);

        jMenuaprovar.setText("Aprovar");
        jMenuaprovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuaprovarActionPerformed(evt);
            }
        });

        jMenuAprovarAdocao.setText("Aprovar Adoção");
        jMenuAprovarAdocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAprovarAdocaoActionPerformed(evt);
            }
        });
        jMenuaprovar.add(jMenuAprovarAdocao);

        jMenuBar1.add(jMenuaprovar);

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
        CadastroVoluntario tela = new CadastroVoluntario(null);
        tela.show();
       // this.dispose();

    }//GEN-LAST:event_jMenuCadVoluntarioActionPerformed

    private void jMenuCadAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadAnimalActionPerformed
        CadastroAnimal tela = new CadastroAnimal(null);
        tela.show();
       // this.dispose();
    }//GEN-LAST:event_jMenuCadAnimalActionPerformed

    private void jMenuCadAdotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadAdotanteActionPerformed
        CadastroAdotante tela = new CadastroAdotante(null);
        tela.show();
       // this.dispose();
    }//GEN-LAST:event_jMenuCadAdotanteActionPerformed

    private void jMenuListaAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListaAnimaisActionPerformed
        // TODO add your handling code here:
        ListarAnimal tela = new ListarAnimal();
        tela.show();
    }//GEN-LAST:event_jMenuListaAnimaisActionPerformed

    private void jMenuListaAdotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListaAdotanteActionPerformed
        ListarAdotante tela = new ListarAdotante();
        tela.show();
        this.dispose();
    }//GEN-LAST:event_jMenuListaAdotanteActionPerformed

    private void jMenuListaVoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListaVoluntarioActionPerformed
        ListarVoluntario tela = new ListarVoluntario();
        tela.show();
        this.dispose();


    }//GEN-LAST:event_jMenuListaVoluntarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuCadOngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadOngActionPerformed
        CadastroOng tela = new CadastroOng(null);
        tela.show();
        //this.dispose();
    }//GEN-LAST:event_jMenuCadOngActionPerformed

    private void jMenuListaOngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListaOngActionPerformed
        ListarONG tela = new ListarONG();
        tela.show();
        this.dispose();
    }//GEN-LAST:event_jMenuListaOngActionPerformed

    private void jMenuaprovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuaprovarActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jMenuaprovarActionPerformed

    private void jMenuAprovarAdocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAprovarAdocaoActionPerformed
        // TODO add your handling code here:
        if(UserCache.getLoggedInUserId() != null){
            FuncionarioController funcionarioController = new FuncionarioController();
            FuncionarioModelo funcionario = funcionarioController.getFuncionarioById(UserCache.getLoggedInUserId());

            // Verificar se o tipo de usuário é administrador
            if (funcionario.getTpUsuario().equals("A")) {
                AprovaAdocao tela = new AprovaAdocao();
                tela.show();
            } else {
                JOptionPane.showMessageDialog(this, "Você não possui perfil de Administrador para acessar essa tela.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_jMenuAprovarAdocaoActionPerformed

    private void jMenuStatusAdocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuStatusAdocaoActionPerformed
            // TODO add your handling code here:
            ConsultaAdocao tela = new ConsultaAdocao();
            tela.show();
            
    }//GEN-LAST:event_jMenuStatusAdocaoActionPerformed

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
    private javax.swing.JMenuItem jMenuAprovarAdocao;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadAdotante;
    private javax.swing.JMenuItem jMenuCadAnimal;
    private javax.swing.JMenuItem jMenuCadOng;
    private javax.swing.JMenuItem jMenuCadVoluntario;
    private javax.swing.JMenuItem jMenuListaAdotante;
    private javax.swing.JMenuItem jMenuListaAnimais;
    private javax.swing.JMenuItem jMenuListaOng;
    private javax.swing.JMenuItem jMenuListaVoluntario;
    private javax.swing.JMenuItem jMenuStatusAdocao;
    private javax.swing.JMenu jMenuaprovar;
    // End of variables declaration//GEN-END:variables
}
