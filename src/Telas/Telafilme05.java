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
public class Telafilme05 extends javax.swing.JFrame {

        int pontos,erros;
    
    public Telafilme05() {
             initComponents();
             
             this.setLocationRelativeTo(null);
        
         pontos = 0;
         erros = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblvida1 = new javax.swing.JLabel();
        lblvida2 = new javax.swing.JLabel();
        lblvida3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txto = new javax.swing.JFormattedTextField();
        txtc = new javax.swing.JFormattedTextField();
        txta = new javax.swing.JFormattedTextField();
        txtm = new javax.swing.JFormattedTextField();
        txts = new javax.swing.JFormattedTextField();
        txtm2 = new javax.swing.JFormattedTextField();
        txto2 = new javax.swing.JFormattedTextField();
        txtr = new javax.swing.JFormattedTextField();
        txtn = new javax.swing.JFormattedTextField();
        txti = new javax.swing.JFormattedTextField();
        txtm3 = new javax.swing.JFormattedTextField();
        txto3 = new javax.swing.JFormattedTextField();
        lblpontos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Qual o Nome do Filme ??");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VIDAS : ");

        lblvida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VIDAS.png"))); // NOI18N

        lblvida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VIDAS.png"))); // NOI18N

        lblvida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VIDAS.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PONTOS:");

        try {
            txto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtoKeyReleased(evt);
            }
        });

        try {
            txtc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcKeyReleased(evt);
            }
        });

        try {
            txta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtaKeyReleased(evt);
            }
        });

        try {
            txtm.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmKeyReleased(evt);
            }
        });

        try {
            txts.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsKeyReleased(evt);
            }
        });

        try {
            txtm2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtm2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtm2KeyReleased(evt);
            }
        });

        try {
            txto2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txto2KeyReleased(evt);
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
            txtn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnKeyReleased(evt);
            }
        });

        try {
            txti.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtiKeyReleased(evt);
            }
        });

        try {
            txtm3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtm3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtm3KeyReleased(evt);
            }
        });

        try {
            txto3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txto3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txto3KeyReleased(evt);
            }
        });

        lblpontos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        lblpontos.setForeground(new java.awt.Color(255, 255, 255));
        lblpontos.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblvida2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblvida3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblvida1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblpontos)
                .addGap(112, 112, 112))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtm2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txto2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txti, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtm3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txto3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpontos)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblvida1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(21, 21, 21)))))))
                    .addComponent(lblvida2)
                    .addComponent(lblvida3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtm2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txto2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txti, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtm3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txto3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcKeyReleased
        //Verificar se o usuariio digiou a letra C
        if(txtc.getText().equals("C")){
            
            //Muda cor de fundo da caixa de texto
            txtc.setBackground(Color.GREEN);
            
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
            txtc.setBackground(Color.RED);
            txtc.setText(null);
            txtc.requestFocus();
            
            

        }
    }//GEN-LAST:event_txtcKeyReleased

    private void txtoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtoKeyReleased
        //Verificar se o usuariio digiou a letra O
        if(txto.getText().equals("O")){
            
            //Muda cor de fundo da caixa de texto
            txto.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txtm.setVisible(true);
            txtm.requestFocus();
            
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

    private void txtmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmKeyReleased
        //Verificar se o usuariio digiou a letra M
        if(txtm.getText().equals("M")){
            
            //Muda cor de fundo da caixa de texto
            txtm.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txta.setVisible(true);
            txta.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
        }
        else{
            //Muda cor de fundo da caixa de texto
            txtm.setBackground(Color.RED);
            txtm.setText(null);
            txtm.requestFocus();
            
            

        }
    }//GEN-LAST:event_txtmKeyReleased

    private void txtaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaKeyReleased
        //Verificar se o usuariio digiou a letra A
        if(txta.getText().equals("A")){
            
            //Muda cor de fundo da caixa de texto
            txta.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txtm2.setVisible(true);
            txtm2.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
        }
        else{
            //Muda cor de fundo da caixa de texto
            txta.setBackground(Color.RED);
            txta.setText(null);
            txta.requestFocus();
            
            

        }
    }//GEN-LAST:event_txtaKeyReleased

    private void txtm2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtm2KeyReleased
        //Verificar se o usuariio digiou a letra M2
        if(txtm2.getText().equals("M")){
            
            //Muda cor de fundo da caixa de texto
            txtm2.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txto2.setVisible(true);
            txto2.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
        }
        else{
            //Muda cor de fundo da caixa de texto
            txtm2.setBackground(Color.RED);
            txtm2.setText(null);
            txtm2.requestFocus();
            
            

        }
    }//GEN-LAST:event_txtm2KeyReleased

    private void txto2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txto2KeyReleased
        //Verificar se o usuariio digiou a letra O2
        if(txto2.getText().equals("O")){
            
            //Muda cor de fundo da caixa de texto
            txto2.setBackground(Color.GREEN);
            
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
            txto2.setBackground(Color.RED);
            txto2.setText(null);
            txto2.requestFocus();
            
            

        }
    }//GEN-LAST:event_txto2KeyReleased

    private void txtrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrKeyReleased
        //Verificar se o usuariio digiou a letra R
        if(txtr.getText().equals("R")){
            
            //Muda cor de fundo da caixa de texto
            txtr.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txts.setVisible(true);
            txts.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
        }
        else{
            //Muda cor de fundo da caixa de texto
            txtr.setBackground(Color.RED);
            txtr.setText(null);
            txtr.requestFocus();
            
            

        }
    }//GEN-LAST:event_txtrKeyReleased

    private void txtsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsKeyReleased
         //Verificar se o usuariio digiou a letra S
        if(txts.getText().equals("S")){
            
            //Muda cor de fundo da caixa de texto
            txts.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txti.setVisible(true);
            txti.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
        }
        else{
            //Muda cor de fundo da caixa de texto
            txts.setBackground(Color.RED);
            txts.setText(null);
            txts.requestFocus();
            
            

        }
    }//GEN-LAST:event_txtsKeyReleased

    private void txtiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtiKeyReleased
        //Verificar se o usuariio digiou a letra I
        if(txti.getText().equals("I")){
            
            //Muda cor de fundo da caixa de texto
            txti.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txtm3.setVisible(true);
            txtm3.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
        }
        else{
            //Muda cor de fundo da caixa de texto
            txti.setBackground(Color.RED);
            txti.setText(null);
            txti.requestFocus();
            
            

        }
    }//GEN-LAST:event_txtiKeyReleased

    private void txtm3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtm3KeyReleased
        //Verificar se o usuariio digiou a letra M3
        if(txtm3.getText().equals("M")){
            
            //Muda cor de fundo da caixa de texto
            txtm3.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txto3.setVisible(true);
            txto3.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
        }
        else{
            //Muda cor de fundo da caixa de texto
            txtm3.setBackground(Color.RED);
            txtm3.setText(null);
            txtm3.requestFocus();
            
            

        }
    }//GEN-LAST:event_txtm3KeyReleased

    private void txto3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txto3KeyReleased
        //Verificar se o usuariio digiou a letra O3
        if(txto3.getText().equals("O")){
            
            //Muda cor de fundo da caixa de texto
            txto3.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txtn.setVisible(true);
            txtn.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
        }
        else{
            //Muda cor de fundo da caixa de texto
            txto3.setBackground(Color.RED);
            txto3.setText(null);
            txto3.requestFocus();
            
            

        }
    }//GEN-LAST:event_txto3KeyReleased

    private void txtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnKeyReleased
        //Verificar se o usuariio digiou a letra N
        if(txtn.getText().equals("N")){
            
            //Muda cor de fundo da caixa de texto
            txtn.setBackground(Color.GREEN);
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
            JOptionPane.showMessageDialog(null, "Parabénsss, você acertou o nome do filme!! :)");
           
        }
        else{
            //Muda cor de fundo da caixa de texto
            txtn.setBackground(Color.RED);
            txtn.setText(null);
            txtn.requestFocus();
            

            
        }
    }//GEN-LAST:event_txtnKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Esconder os Campos de Texto
        txto.setVisible(false);
        txtm.setVisible(false);
        txta.setVisible(false);
        txtm2.setVisible(false);
        txto2.setVisible(false);
        txtr.setVisible(false);
        txts.setVisible(false);
        txti.setVisible(false);
        txtm3.setVisible(false);
        txto3.setVisible(false);
        txtn.setVisible(false);
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
            java.util.logging.Logger.getLogger(Telafilme05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telafilme05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telafilme05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telafilme05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telafilme05().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblpontos;
    private javax.swing.JLabel lblvida1;
    private javax.swing.JLabel lblvida2;
    private javax.swing.JLabel lblvida3;
    private javax.swing.JFormattedTextField txta;
    private javax.swing.JFormattedTextField txtc;
    private javax.swing.JFormattedTextField txti;
    private javax.swing.JFormattedTextField txtm;
    private javax.swing.JFormattedTextField txtm2;
    private javax.swing.JFormattedTextField txtm3;
    private javax.swing.JFormattedTextField txtn;
    private javax.swing.JFormattedTextField txto;
    private javax.swing.JFormattedTextField txto2;
    private javax.swing.JFormattedTextField txto3;
    private javax.swing.JFormattedTextField txtr;
    private javax.swing.JFormattedTextField txts;
    // End of variables declaration//GEN-END:variables
}
