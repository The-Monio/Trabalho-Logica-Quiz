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
public class Telafilme08 extends javax.swing.JFrame {

    int pontos,erros;
    
    public Telafilme08() {
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
        lblvida3 = new javax.swing.JLabel();
        lblvida4 = new javax.swing.JLabel();
        lblvida5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblpontos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtc = new javax.swing.JFormattedTextField();
        txtr = new javax.swing.JFormattedTextField();
        txtu = new javax.swing.JFormattedTextField();
        txts = new javax.swing.JFormattedTextField();
        txth = new javax.swing.JFormattedTextField();
        txta = new javax.swing.JFormattedTextField();
        txta2 = new javax.swing.JFormattedTextField();
        txta3 = new javax.swing.JFormattedTextField();
        txtt = new javax.swing.JFormattedTextField();
        txtu2 = new javax.swing.JFormattedTextField();
        txtr2 = new javax.swing.JFormattedTextField();
        txtl = new javax.swing.JFormattedTextField();

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

        lblvida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VIDAS.png"))); // NOI18N

        lblvida4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VIDAS.png"))); // NOI18N

        lblvida5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VIDAS.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PONTOS:");

        lblpontos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        lblpontos.setForeground(new java.awt.Color(255, 255, 255));
        lblpontos.setText("0");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tall-girl-netflix-crush-a-altura.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

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
            txtu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtuKeyReleased(evt);
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
            txta2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txta2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txta2KeyReleased(evt);
            }
        });

        try {
            txta3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txta3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txta3KeyReleased(evt);
            }
        });

        try {
            txtt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttKeyReleased(evt);
            }
        });

        try {
            txtu2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtu2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtu2KeyReleased(evt);
            }
        });

        try {
            txtr2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtr2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtr2KeyReleased(evt);
            }
        });

        try {
            txtl.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblvida3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblvida4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblvida5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(lblpontos)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 141, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txth, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txta2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtu2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtr2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txta3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4))
                            .addComponent(lblvida3)
                            .addComponent(lblvida5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(lblvida4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6))
                    .addComponent(lblpontos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txth, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txta2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtu2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtr2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txta3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
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
            txtr.setVisible(true);
            txtr.requestFocus();
            
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

    private void txtrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrKeyReleased
        //Verificar se o usuariio digiou a letra R
        if(txtr.getText().equals("R")){
            
            //Muda cor de fundo da caixa de texto
            txtr.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txtu.setVisible(true);
            txtu.requestFocus();
            
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

    private void txtuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuKeyReleased
        //Verificar se o usuariio digiou a letra U
        if(txtu.getText().equals("U")){
            
            //Muda cor de fundo da caixa de texto
            txtu.setBackground(Color.GREEN);
            
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
            txtu.setBackground(Color.RED);
            txtu.setText(null);
            txtu.requestFocus();
            
        }
    }//GEN-LAST:event_txtuKeyReleased

    private void txtsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsKeyReleased
        //Verificar se o usuariio digiou a letra S
        if(txts.getText().equals("S")){
            
            //Muda cor de fundo da caixa de texto
            txts.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txth.setVisible(true);
            txth.requestFocus();
            
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

    private void txthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthKeyReleased
        //Verificar se o usuariio digiou a letra H
        if(txth.getText().equals("H")){
            
            //Muda cor de fundo da caixa de texto
            txth.setBackground(Color.GREEN);
            
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
            txth.setBackground(Color.RED);
            txth.setText(null);
            txth.requestFocus();
            
        }
    }//GEN-LAST:event_txthKeyReleased

    private void txtaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaKeyReleased
        //Verificar se o usuariio digiou a letra A
        if(txta.getText().equals("A")){
            
            //Muda cor de fundo da caixa de texto
            txta.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txta2.setVisible(true);
            txta2.requestFocus();
            
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

    private void txta2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txta2KeyReleased
        //Verificar se o usuariio digiou a letra A2
        if(txta2.getText().equals("A")){
            
            //Muda cor de fundo da caixa de texto
            txta2.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txtl.setVisible(true);
            txtl.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
        }
        else{
            //Muda cor de fundo da caixa de texto
            txta2.setBackground(Color.RED);
            txta2.setText(null);
            txta2.requestFocus();
            
        }
    }//GEN-LAST:event_txta2KeyReleased

    private void txtlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlKeyReleased
        //Verificar se o usuariio digiou a letra L
        if(txtl.getText().equals("L")){
            
            //Muda cor de fundo da caixa de texto
            txtl.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txtt.setVisible(true);
            txtt.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
        }
        else{
            //Muda cor de fundo da caixa de texto
            txtl.setBackground(Color.RED);
            txtl.setText(null);
            txtl.requestFocus();
            
        }
    }//GEN-LAST:event_txtlKeyReleased

    private void txttKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttKeyReleased
        //Verificar se o usuariio digiou a letra T
        if(txtt.getText().equals("T")){
            
            //Muda cor de fundo da caixa de texto
            txtt.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txtu2.setVisible(true);
            txtu2.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
        }
        else{
            //Muda cor de fundo da caixa de texto
            txtt.setBackground(Color.RED);
            txtt.setText(null);
            txtt.requestFocus();
            
        }
    }//GEN-LAST:event_txttKeyReleased

    private void txtu2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtu2KeyReleased
        //Verificar se o usuariio digiou a letra U2
        if(txtu2.getText().equals("U")){
            
            //Muda cor de fundo da caixa de texto
            txtu2.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txtr2.setVisible(true);
            txtr2.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
        }
        else{
            //Muda cor de fundo da caixa de texto
            txtu2.setBackground(Color.RED);
            txtu2.setText(null);
            txtu2.requestFocus();
            
        }
    }//GEN-LAST:event_txtu2KeyReleased

    private void txtr2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtr2KeyReleased
        //Verificar se o usuariio digiou a letra R2
        if(txtr2.getText().equals("R")){
            
            //Muda cor de fundo da caixa de texto
            txtr2.setBackground(Color.GREEN);
            
            //Exibe o segundo campo de texto
            txta3.setVisible(true);
            txta3.requestFocus();
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
        }
        else{
            //Muda cor de fundo da caixa de texto
            txtr2.setBackground(Color.RED);
            txtr2.setText(null);
            txtr2.requestFocus();
            
        }
    }//GEN-LAST:event_txtr2KeyReleased

    private void txta3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txta3KeyReleased
        //Verificar se o usuariio digiou a letra A3
        if(txta3.getText().equals("A")){
            
            //Muda cor de fundo da caixa de texto
            txta3.setBackground(Color.GREEN);
            
            //Calcula Ponto
            pontos += 10;
            
            //Mostra os pontos
            lblpontos.setText(String.valueOf(pontos));
            
            JOptionPane.showMessageDialog(null, "Parabénsss, você acertou o nome do filme!! :)");
           
        }
        else{
            //Muda cor de fundo da caixa de texto
            txta3.setBackground(Color.RED);
            txta3.setText(null);
            txta3.requestFocus();
            

            
        } 
    }//GEN-LAST:event_txta3KeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Esconder os Campos de Texto
      txtr.setVisible(false);
      txtu.setVisible(false);
      txts.setVisible(false);
      txth.setVisible(false);
      txta.setVisible(false);
      txta2.setVisible(false);
      txtl.setVisible(false);
      txtt.setVisible(false);
      txtu2.setVisible(false);
      txtr2.setVisible(false);
      txta3.setVisible(false);
      
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
            java.util.logging.Logger.getLogger(Telafilme08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telafilme08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telafilme08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telafilme08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telafilme08().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblpontos;
    private javax.swing.JLabel lblvida3;
    private javax.swing.JLabel lblvida4;
    private javax.swing.JLabel lblvida5;
    private javax.swing.JFormattedTextField txta;
    private javax.swing.JFormattedTextField txta2;
    private javax.swing.JFormattedTextField txta3;
    private javax.swing.JFormattedTextField txtc;
    private javax.swing.JFormattedTextField txth;
    private javax.swing.JFormattedTextField txtl;
    private javax.swing.JFormattedTextField txtr;
    private javax.swing.JFormattedTextField txtr2;
    private javax.swing.JFormattedTextField txts;
    private javax.swing.JFormattedTextField txtt;
    private javax.swing.JFormattedTextField txtu;
    private javax.swing.JFormattedTextField txtu2;
    // End of variables declaration//GEN-END:variables
}
