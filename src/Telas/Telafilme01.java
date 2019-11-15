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
public class Telafilme01 extends javax.swing.JFrame {

    int pontos,erros;
            
    public Telafilme01() {
               initComponents();
        this.setLocationRelativeTo(null);
        
         pontos = 0;
         erros = 0;
        }
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtj = new javax.swing.JFormattedTextField();
        txto = new javax.swing.JFormattedTextField();
        txtk = new javax.swing.JFormattedTextField();
        txte = new javax.swing.JFormattedTextField();
        txtr = new javax.swing.JFormattedTextField();
        lblvida2 = new javax.swing.JLabel();
        lblvida3 = new javax.swing.JLabel();
        lblvida1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblpontos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setText("Qual o Nome do Filme ??");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Joker.jpg"))); // NOI18N

        try {
            txtj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjActionPerformed(evt);
            }
        });
        txtj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjKeyReleased(evt);
            }
        });

        try {
            txto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtoActionPerformed(evt);
            }
        });
        txto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtoKeyReleased(evt);
            }
        });

        try {
            txtk.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkActionPerformed(evt);
            }
        });
        txtk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkKeyReleased(evt);
            }
        });

        try {
            txte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txteKeyReleased(evt);
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

        lblvida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VIDAS.png"))); // NOI18N

        lblvida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VIDAS.png"))); // NOI18N

        lblvida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VIDAS.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("VIDAS : ");

        lblpontos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        lblpontos.setText("0");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setText("PONTOS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtj, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(txto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txtk, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblvida1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 86, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(217, 217, 217))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblvida2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblvida3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblpontos)
                                .addGap(46, 46, 46))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblvida3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(20, 20, 20))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblvida1)
                            .addComponent(lblpontos)
                            .addComponent(lblvida2))))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtk, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtj, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      //Esconder os Campos de Texto
      txto.setVisible(false);
      txtk.setVisible(false);
      txte.setVisible(false);
      txtr.setVisible(false);

        
    }//GEN-LAST:event_formWindowOpened

    private void txtjKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjKeyReleased
      //LETRA J
        //Verificar se o usuariio digiou a letra J
        if(txtj.getText().equals("J")){
            
            //Muda cor de fundo da caixa de texto
            txtj.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txto.setVisible(true);
            txto.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
        }
        else{
            //Muda cor de fundo da caixa de texto
            txtj.setBackground(Color.RED);
            txtj.setText(null);
            txtj.requestFocus();
            
            

        }
        
    }//GEN-LAST:event_txtjKeyReleased

    private void txtoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtoKeyReleased
      //LETRA O
        //Verificar se o usuariio digiou a letra O
        if(txto.getText().equals("O")){
            
            //Muda cor de fundo da caixa de texto
            txto.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txtk.setVisible(true);
            txtk.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
        }
        else{
            //Muda cor de fundo da caixa de texto
            txto.setBackground(Color.RED);
            txto.setText(null);
            txto.requestFocus(); 
            

        }
        

    }//GEN-LAST:event_txtoKeyReleased

    private void txtkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkKeyReleased
      //LETRA K
        //Verificar se o usuariio digiou a letra K
        if(txtk.getText().equals("K")){
            
            //Muda cor de fundo da caixa de texto
            txtk.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txte.setVisible(true);
            txte.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
        }
        else{
            //Muda cor de fundo da caixa de texto
            txtk.setBackground(Color.RED);
            txtk.setText(null);
            txtk.requestFocus(); 
            

        }
       
    }//GEN-LAST:event_txtkKeyReleased

    private void txteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txteKeyReleased
      //LETRA E
        //Verificar se o usuariio digiou a letra E
        if(txte.getText().equals("E")){
            
            //Muda cor de fundo da caixa de texto
            txte.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txtr.setVisible(true);
            txtr.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
        }
        else{
            //Muda cor de fundo da caixa de texto
            txte.setBackground(Color.RED);
            txte.setText(null);
            txte.requestFocus();
            

        }
        

    }//GEN-LAST:event_txteKeyReleased

    private void txtrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrKeyReleased
      //LETRA R 
       //Verificar se o usuariio digiou a letra R
        if(txtr.getText().equals("R")){
            
            //Muda cor de fundo da caixa de texto
            txtr.setBackground(Color.GREEN);
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
            JOptionPane.showMessageDialog(null, "Parabénsss, você acertou o nome do filme!! :)");
           
        }
        else{
            //Muda cor de fundo da caixa de texto
            txtr.setBackground(Color.RED);
            txtr.setText(null);
            txtr.requestFocus();
            

            
        } 
    }//GEN-LAST:event_txtrKeyReleased

    private void txtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtoActionPerformed

    private void txtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkActionPerformed

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
            java.util.logging.Logger.getLogger(Telafilme01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telafilme01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telafilme01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telafilme01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telafilme01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblpontos;
    private javax.swing.JLabel lblvida1;
    private javax.swing.JLabel lblvida2;
    private javax.swing.JLabel lblvida3;
    private javax.swing.JFormattedTextField txte;
    private javax.swing.JFormattedTextField txtj;
    private javax.swing.JFormattedTextField txtk;
    private javax.swing.JFormattedTextField txto;
    private javax.swing.JFormattedTextField txtr;
    // End of variables declaration//GEN-END:variables
}
