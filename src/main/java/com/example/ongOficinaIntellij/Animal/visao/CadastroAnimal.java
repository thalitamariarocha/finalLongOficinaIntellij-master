/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.ongOficinaIntellij.Animal.visao;

import com.example.ongOficinaIntellij.Animal.controller.AnimalController;
import com.example.ongOficinaIntellij.Animal.entidade.AnimalModelo;
import com.example.ongOficinaIntellij.Utils.UserCache;
import com.example.ongOficinaIntellij.funcionario.controller.FuncionarioController;
import com.example.ongOficinaIntellij.funcionario.entidade.FuncionarioModelo;
import com.example.ongOficinaIntellij.funcionario.visao.CadastroVoluntario;
import com.example.ongOficinaIntellij.home.visao.home;
import com.example.ongOficinaIntellij.ong.controller.OngController;
import com.example.ongOficinaIntellij.ong.entidade.OngModelo;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Thalita
 */
public class CadastroAnimal extends javax.swing.JFrame {


    private Long idAnimal;
    Long userId = UserCache.getLoggedInUserId();
    private DefaultComboBoxModel<ChaveValor> model = new DefaultComboBoxModel<>();

    /**
     * Creates new form CadastroAnimal
     */
    public CadastroAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
        initComponents();
        preencherComboBox();
        carregarDados();
    }



    private char _escolha(){
        if (JcomboStatus.getSelectedItem().toString() == "D - Disponível"){
            return 'D';
        }else if (JcomboStatus.getSelectedItem().toString() == "P - Pendente"){
            return 'P';
        }else{
            return 'I';
        }
    }


    private void preencherComboBox() {
        try {

            OngController ongController = new OngController();
            List<OngModelo> ongs = ongController.getList();

            for (OngModelo ong : ongs) {
                ChaveValor item = new ChaveValor(ong.getId(), ong.getNome());
                model.addElement(item);
            }

            jComboBox1.setModel(model);

        } catch (Exception e) {
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

        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btncadastrar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        RadioCao = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RadioGato = new javax.swing.JRadioButton();
        RadioSexoF = new javax.swing.JRadioButton();
        RadioSexoM = new javax.swing.JRadioButton();
        JcomboPorte = new javax.swing.JComboBox<>();
        JcomboCastrado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaVacina = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaObservacao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        JcomboStatus = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtendereco = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("Vacinas");

        jLabel4.setText("Data de Nascimento");

        jLabel6.setText("Especie");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Cadastrar Animal");

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        jLabel7.setText("Nome");

        btncadastrar.setText("Salvar");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        RadioCao.setText("Cão");
        RadioCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioCaoActionPerformed(evt);
            }
        });

        jLabel5.setText("Sexo");

        jLabel1.setText("Porte");

        jLabel2.setText("Castrado");

        RadioGato.setText("Gato");
        RadioGato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioGatoActionPerformed(evt);
            }
        });

        RadioSexoF.setText("F");
        RadioSexoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioSexoFActionPerformed(evt);
            }
        });

        RadioSexoM.setText("M");
        RadioSexoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioSexoMActionPerformed(evt);
            }
        });

        JcomboPorte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeno", "Medio", "Grande" }));

        JcomboCastrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        jTextAreaVacina.setColumns(20);
        jTextAreaVacina.setRows(5);
        jScrollPane1.setViewportView(jTextAreaVacina);

        jLabel10.setText("Observações");

        jTextAreaObservacao.setColumns(20);
        jTextAreaObservacao.setRows(5);
        jScrollPane2.setViewportView(jTextAreaObservacao);

        jLabel3.setText("Status");

        JcomboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D - Disponível", "P - Pendente", "I - Indisponível" }));

        jLabel11.setText("ONG");

        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        txtendereco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtendereco.setText("use dd/mm/aaaa");
        txtendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenderecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JcomboPorte, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RadioCao)
                                    .addComponent(RadioSexoM))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RadioSexoF)
                                    .addComponent(RadioGato))
                                .addGap(44, 44, 44))
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JcomboCastrado, 0, 192, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btncadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JcomboStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RadioCao)
                    .addComponent(RadioGato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(RadioSexoM)
                    .addComponent(RadioSexoF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JcomboPorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JcomboCastrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JcomboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed

                AnimalModelo animal = new AnimalModelo();

        Date date = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = dateFormat.parse(txtendereco.getText());

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        if(idAnimal != null){
                    animal.setId(idAnimal);
                    }
                animal.setDt_nascimento(date);
                animal.setNome(txtnome.getText());
                animal.setSexo(RadioSexoM.isSelected() ? "M" : "F");
                animal.setEspecie(RadioCao.isSelected() ? "C" : "G");
                animal.setCastrado(JcomboCastrado.getSelectedItem().toString());
                animal.setPorte(JcomboPorte.getSelectedItem().toString());
                animal.setVacina(jTextAreaVacina.getText());
                animal.setObservacao(jTextAreaObservacao.getText());

        // Obtém o item selecionado no JComboBox
        String statusSelecionado = (String) JcomboStatus.getSelectedItem();

// Chama a função _escolha() para obter o status desejado
        String statusEscolhido = String.valueOf(_escolha());

// Define o status do animal com base na escolha do usuário
        //animal.setStatus(statusSelecionado);

// Ou, se você deseja definir o status com base na função _escolha():
        animal.setStatus(statusEscolhido);
                //animal.setStatus(JcomboStatus.getSelectedItem(_escolha()));


        animal.setIdFuncionario(userId);

                ChaveValor item = (ChaveValor) jComboBox1.getSelectedItem();

                animal.setIdOng(item.id);



                AnimalController animalController = new AnimalController();
                animalController.createOrUpdate(animal);
                this.dispose();
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed


        this.dispose();
        
        home tela = new home();
        tela.show();

        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelarActionPerformed

    private void RadioCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioCaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioCaoActionPerformed

    private void RadioGatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioGatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioGatoActionPerformed

    private void RadioSexoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioSexoFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioSexoFActionPerformed

    private void RadioSexoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioSexoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioSexoMActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtenderecoActionPerformed


    public void carregarDados() {
        if (idAnimal != null) {
            jLabel9.setText("Editar Animal");
            AnimalController animalController = new AnimalController();
            AnimalModelo animal = animalController.getAnimalById(idAnimal);

            txtendereco.setValue(animal.getDt_nascimento());
            txtnome.setText(animal.getNome());
            RadioSexoM.setSelected(animal.getSexo().equals("M"));
            RadioSexoF.setSelected(animal.getSexo().equals("F"));
            RadioCao.setSelected(animal.getEspecie().equals("C"));
            RadioGato.setSelected(animal.getEspecie().equals("G"));
            JcomboCastrado.setSelectedItem(animal.getCastrado());
            JcomboPorte.setSelectedItem(animal.getPorte());
            jTextAreaVacina.setText(animal.getVacina());
            jTextAreaObservacao.setText(animal.getObservacao());
            JcomboStatus.setSelectedItem(animal.getStatus());


            for (int i = 0; i < model.getSize(); i++) {
                ChaveValor item = model.getElementAt(i);
                if (item.id == animal.getIdOng()) {
                    jComboBox1.setSelectedItem(item);
                    break;
                }
            }


        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CadastroAnimal(null).setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcomboCastrado;
    private javax.swing.JComboBox<String> JcomboPorte;
    private javax.swing.JComboBox<String> JcomboStatus;
    private javax.swing.JRadioButton RadioCao;
    private javax.swing.JRadioButton RadioGato;
    private javax.swing.JRadioButton RadioSexoF;
    private javax.swing.JRadioButton RadioSexoM;
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JComboBox<ChaveValor> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaObservacao;
    private javax.swing.JTextArea jTextAreaVacina;
    private javax.swing.JFormattedTextField txtendereco;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables

    private class ChaveValor {
        private Long id;
        private String nomeOng;

        public ChaveValor(Long id, String nomeOng) {
            this.id = id;
            this.nomeOng = nomeOng;
        }

        @Override
        public String toString() {
            return nomeOng;
        }




    }
}
