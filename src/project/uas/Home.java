/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.uas;

/**
 *
 * @author A S U S
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    Home(String _username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        txtNama = new javax.swing.JTextField();
        txtMeja = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbEspresso = new javax.swing.JCheckBox();
        cbAmericano = new javax.swing.JCheckBox();
        cbCappucino = new javax.swing.JCheckBox();
        cbLatte = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hargaCappucino = new javax.swing.JTextField();
        hargaAmericano = new javax.swing.JTextField();
        hargaespresso = new javax.swing.JTextField();
        hargaLatte = new javax.swing.JTextField();
        jumlahCappucino = new javax.swing.JTextField();
        jumlahAmericano = new javax.swing.JTextField();
        jumlahEspresso = new javax.swing.JTextField();
        jumlahLatte = new javax.swing.JTextField();
        totalCappucino = new javax.swing.JTextField();
        totalAmericano = new javax.swing.JTextField();
        totalEspresso = new javax.swing.JTextField();
        totalLatte = new javax.swing.JTextField();
        checkout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        diskon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bayar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        totalfull = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jLabel3.setFont(new java.awt.Font("STXihei", 0, 12)); // NOI18N
        jLabel3.setText("Menu");

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));

        lblWelcome.setFont(new java.awt.Font("STXihei", 1, 14)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Welcome to UAS Caffe ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblWelcome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblWelcome)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));

        jLabel1.setFont(new java.awt.Font("STXihei", 0, 12)); // NOI18N
        jLabel1.setText("Jumlah");

        jLabel2.setFont(new java.awt.Font("STXihei", 0, 12)); // NOI18N
        jLabel2.setText("Harga");

        cbEspresso.setText("Espresso");
        cbEspresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspressoActionPerformed(evt);
            }
        });

        cbAmericano.setText("Americano");
        cbAmericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAmericanoActionPerformed(evt);
            }
        });

        cbCappucino.setText("Cappucino");
        cbCappucino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCappucinoActionPerformed(evt);
            }
        });

        cbLatte.setText("Latte");
        cbLatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLatteActionPerformed(evt);
            }
        });

        jLabel4.setText("Pilih Menu");

        jLabel5.setText("Sub Total");

        hargaCappucino.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hargaCappucino.setText("0");

        hargaAmericano.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hargaAmericano.setText("0");

        hargaespresso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hargaespresso.setText("0");
        hargaespresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaespressoActionPerformed(evt);
            }
        });

        hargaLatte.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hargaLatte.setText("0");

        jumlahCappucino.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jumlahCappucino.setText("0");

        jumlahAmericano.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jumlahAmericano.setText("0");

        jumlahEspresso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jumlahEspresso.setText("0");

        jumlahLatte.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jumlahLatte.setText("0");

        totalCappucino.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalCappucino.setText("0");

        totalAmericano.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalAmericano.setText("0");

        totalEspresso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalEspresso.setText("0");

        totalLatte.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalLatte.setText("0");

        checkout.setText("CHECK OUT");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        jLabel6.setText("Total Bayar");

        diskon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        diskon.setText("0");

        jLabel7.setText("Total Kembalian");

        bayar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bayar.setText("0");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });

        jLabel8.setText("Diskon");

        totalfull.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalfull.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbLatte, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbEspresso, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbAmericano, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCappucino, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(hargaespresso, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                            .addComponent(hargaLatte)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hargaCappucino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hargaAmericano, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jumlahAmericano, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(jumlahCappucino)
                                    .addComponent(jumlahEspresso)
                                    .addComponent(jumlahLatte)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(checkout)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(totalEspresso, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(totalLatte)
                    .addComponent(totalCappucino)
                    .addComponent(totalAmericano)
                    .addComponent(diskon)
                    .addComponent(bayar)
                    .addComponent(totalfull))
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCappucino)
                    .addComponent(hargaCappucino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahCappucino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCappucino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAmericano)
                    .addComponent(hargaAmericano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahAmericano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalAmericano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEspresso)
                    .addComponent(hargaespresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahEspresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalEspresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLatte)
                    .addComponent(hargaLatte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahLatte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLatte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(diskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(checkout))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalfull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void cbEspressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspressoActionPerformed
        // TODO add your handling code here:
             if (cbEspresso.isSelected()){
            hargaespresso.setEnabled(true);
            jumlahEspresso.setEnabled(true);           
            totalEspresso.setEnabled(true);
        }else{
            hargaespresso.setEnabled(false);
            jumlahEspresso.setEnabled(false);
            totalEspresso.setEnabled(false);

    }//GEN-LAST:event_cbEspressoActionPerformed

    private void hargaespressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaespressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaespressoActionPerformed
         
    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bayarActionPerformed

    private void cbCappucinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCappucinoActionPerformed
        // TODO add your handling code here:
             if (cbCappucino.isSelected()){
            hargaCappucino.setEnabled(true);
            jumlahCappucino.setEnabled(true);           
            totalCappucino.setEnabled(true);
        }else{
            hargaCappucino.setEnabled(false);
            jumlahCappucino.setEnabled(false);
            totalCappucino.setEnabled(false);

    }//GEN-LAST:event_cbCappucinoActionPerformed

    private void cbAmericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAmericanoActionPerformed
        // TODO add your handling code here:
             if (cbAmericano.isSelected()){
            hargaAmericano.setEnabled(true);
            jumlahAmericano.setEnabled(true);           
            totalAmericano.setEnabled(true);
        }else{
            hargaAmericano.setEnabled(false);
            jumlahAmericano.setEnabled(false);
            totalAmericano.setEnabled(false);

    }//GEN-LAST:event_cbAmericanoActionPerformed

    private void cbLatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLatteActionPerformed
        // TODO add your handling code here:
             if (cbLatte.isSelected()){
            hargaLatte.setEnabled(true);
            jumlahLatte.setEnabled(true);           
            totalLatte.setEnabled(true);
        }else{
            hargaLatte.setEnabled(false);
            jumlahLatte.setEnabled(false);
            totalLatte .setEnabled(false);

    }//GEN-LAST:event_cbLatteActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        // TODO add your handling code here:
            int harga = Integer.parseInt(hargaCappucino.getText());
        int jumlah = Integer.parseInt(jumlahCappucino.getText());
        totalCappucino.setText(Integer.toString(jumlah * harga)); //Menghitung subTotal harga ikan
        
        int harga1 = Integer.parseInt(hargaAmericano.getText());
        int jumlah1= Integer.parseInt(jumlahAmericano.getText());
        totalAmericano.setText(Integer.toString(harga1 * jumlah1));//menghitung subTotal harga ayam
        
        int harga2 = Integer.parseInt(hargaespresso.getText());
        int jumlah2 = Integer.parseInt(jumlahEspresso.getText());
        totalEspresso.setText(Integer.toString(harga2 * jumlah2)); //Menghitung subTotal harga ayam krispi
        
        int harga3 = Integer.parseInt(hargaLatte.getText());
        int jumlah3 = Integer.parseInt(jumlahLatte.getText());
        totalLatte.setText(Integer.toString(harga3 * jumlah3)); //Menghitung subTotal harga ayam bakar
        
        // Menghitung harga total, diskon dan total bayar
        int Total1 = Integer.parseInt(totalCappucino.getText());
        int Total2 = Integer.parseInt(totalAmericano.getText());
        int Total3 = Integer.parseInt(totalEspresso.getText());
        int Total4 = Integer.parseInt(totalLatte.getText());
        int total = Total1 + Total2 + Total3 + Total4;
        diskon.setText("Rp." + total + ",00");
        if (total > 250000){
            totalfull.setText("20%");
            total = total-(total * 20/100);
            bayar.setText("Rp." + total + ",00");
        }else if (total > 150000){
            totalfull.setText("10%");
            total = total-(total*10/100);
            bayar.setText("Rp." + total + ",00");
        }else{
            bayar.setText("Rp."+total+",00");
        }

    }//GEN-LAST:event_checkoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bayar;
    private javax.swing.JCheckBox cbAmericano;
    private javax.swing.JCheckBox cbCappucino;
    private javax.swing.JCheckBox cbEspresso;
    private javax.swing.JCheckBox cbLatte;
    private javax.swing.JButton checkout;
    private javax.swing.JTextField diskon;
    private javax.swing.JTextField hargaAmericano;
    private javax.swing.JTextField hargaCappucino;
    private javax.swing.JTextField hargaLatte;
    private javax.swing.JTextField hargaespresso;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jumlahAmericano;
    private javax.swing.JTextField jumlahCappucino;
    private javax.swing.JTextField jumlahEspresso;
    private javax.swing.JTextField jumlahLatte;
    private javax.swing.JLabel lblWelcome;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private javax.swing.JTextField totalAmericano;
    private javax.swing.JTextField totalCappucino;
    private javax.swing.JTextField totalEspresso;
    private javax.swing.JTextField totalLatte;
    private javax.swing.JTextField totalfull;
    private javax.swing.JTextField txtMeja;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
