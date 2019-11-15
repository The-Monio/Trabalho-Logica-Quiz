/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Joao Emanuel
 */
public class Telafilme02 extends javax.swing.JFrame {

    int pontos,erros;
    
    public Telafilme02() {
            initComponents();
            
            this.setLocationRelativeTo(null);
        
         pontos = 0;
         erros = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txts = new javax.swing.JFormattedTextField();
        txth = new javax.swing.JFormattedTextField();
        txtr = new javax.swing.JFormattedTextField();
        txte = new javax.swing.JFormattedTextField();
        txtk = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblvida1 = new javax.swing.JLabel();
        lblvida2 = new javax.swing.JLabel();
        lblvida3 = new javax.swing.JLabel();
        lblpontos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Qual o Nome do Filme ??");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Shrek1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        try {
            txts.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsActionPerformed(evt);
            }
        });
        txts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsKeyReleased(evt);
            }
        });

        try {
            txth.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthKeyReleased(evt);
            }
        });

        try {
            txtr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtrKeyReleased(evt);
            }
        });

        try {
            txte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteActionPerformed(evt);
            }
        });
        txte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txteKeyReleased(evt);
            }
        });

        try {
            txtk.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PONTOS:");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VIDAS : ");

        lblvida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VIDAS.png"))); // NOI18N

        lblvida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VIDAS.png"))); // NOI18N

        lblvida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VIDAS.png"))); // NOI18N

        lblpontos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        lblpontos.setForeground(new java.awt.Color(255, 255, 255));
        lblpontos.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblvida1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblvida2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblvida3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txth, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(lblpontos)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblvida1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblvida3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblvida2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblpontos, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txth, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtk, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsActionPerformed

    private void txtsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsKeyReleased
        // Verificar se ousuario digitou a letra S
        if(txts.getText().equals("S")){

            //muda a cor de fun do da caixa
            txts.setBackground(Color.GREEN);
            //exibe o segundo  campo de texto
            txth.setVisible(true);
            txth.requestFocus();
            
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));

        }else{
            txts.setBackground(Color.RED);
            txts.setText(null);
            txts.requestFocus();
        }

    }//GEN-LAST:event_txtsKeyReleased

    private void txthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthKeyReleased
        // Verificar se ousuario digitou a letra H
        if(txth.getText().equals("H")){

            //muda a cor de fun do da caixa
            txth.setBackground(Color.GREEN);
            //exibe o segundo  campo de texto
            txtr.setVisible(true);
            txtr.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));

        }else{
            txth.setBackground(Color.RED);
            txth.setText(null);
            txth.requestFocus();
        }
    }//GEN-LAST:event_txthKeyReleased

    private void txtrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrKeyReleased
        // Verificar se ousuario digitou a letra R
        if(txtr.getText().equals("R")){

            //muda a cor de fun do da caixa
            txtr.setBackground(Color.GREEN);
            //exibe o segundo  campo de texto
            txte.setVisible(true);
            txte.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));

        }else{
            txtr.setBackground(Color.RED);
            txtr.setText(null);
            txtr.requestFocus();
        }
    }//GEN-LAST:event_txtrKeyReleased

    private void txteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txteKeyReleased
        // Verificar se ousuario digitou a letra E
        if(txte.getText().equals("E")){

            //muda a cor de fun do da caixa
            txte.setBackground(Color.GREEN);
            //exibe o segundo  campo de texto
            txtk.setVisible(true);
            txtk.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));

        }else{
            txte.setBackground(Color.RED);
            txte.setText(null);
            txte.requestFocus();
        }
    }//GEN-LAST:event_txteKeyReleased

    private void txtkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkKeyReleased
        // Verificar se ousuario digitou a letra K
        if(txtk.getText().equals("K")){

            //muda a cor de fun do da caixa
            txtk.setBackground(Color.GREEN);
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));

            JOptionPane.showMessageDialog(null, "Parabénsss, você acertou o nome do filme!! :)");

        }else{
            txtk.setBackground(Color.RED);
            txtk.setText(null);
            txtk.requestFocus();
        }
    }//GEN-LAST:event_txtkKeyReleased

    private void txteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Esconder os campos de texto
        txth.setVisible(false);
        txtr.setVisible(false);
        txte.setVisible(false);
        txtk.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Telafilme02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telafilme02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telafilme02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telafilme02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telafilme02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblpontos;
    private javax.swing.JLabel lblvida1;
    private javax.swing.JLabel lblvida2;
    private javax.swing.JLabel lblvida3;
    private javax.swing.JFormattedTextField txte;
    private javax.swing.JFormattedTextField txth;
    private javax.swing.JFormattedTextField txtk;
    private javax.swing.JFormattedTextField txtr;
    private javax.swing.JFormattedTextField txts;
    // End of variables declaration//GEN-END:variables
}
