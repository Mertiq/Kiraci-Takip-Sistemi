
public class AnaEkran extends javax.swing.JFrame {

    
    public AnaEkran() {
        initComponents();
        
    }

KiraTahsilat kiraTahsilat = new KiraTahsilat();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jFileChooser1 = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        gayrimenkulYonetimi = new javax.swing.JButton();
        gayrimenkulEkle = new javax.swing.JButton();
        kiracıEkle = new javax.swing.JButton();
        kiraciYonetimi = new javax.swing.JButton();
        sYonetimi = new javax.swing.JButton();
        sEkle = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        gayrimenkulYonetimi.setText("GAYRİMENKUL YÖNETİMİ");
        gayrimenkulYonetimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gayrimenkulYonetimiActionPerformed(evt);
            }
        });

        gayrimenkulEkle.setText("GAYRİMENKUL EKLE");
        gayrimenkulEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gayrimenkulEkleActionPerformed(evt);
            }
        });

        kiracıEkle.setText("KİRACI EKLE");
        kiracıEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiracıEkleActionPerformed(evt);
            }
        });

        kiraciYonetimi.setText("KİRACI YÖNETİMİ");
        kiraciYonetimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiraciYonetimiActionPerformed(evt);
            }
        });

        sYonetimi.setText("SÖZLEŞME YÖNETİMİ");
        sYonetimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sYonetimiActionPerformed(evt);
            }
        });

        sEkle.setText("SÖZLEŞME EKLE");
        sEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sEkleActionPerformed(evt);
            }
        });

        jButton1.setText("KİRA TAHSİLAT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gayrimenkulEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(kiracıEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sYonetimi, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kiraciYonetimi, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gayrimenkulYonetimi, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gayrimenkulEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(kiracıEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gayrimenkulYonetimi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(kiraciYonetimi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sYonetimi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gayrimenkulYonetimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gayrimenkulYonetimiActionPerformed
        // TODO add your handling code here:
        kiraTahsilat.sozlesmeEkle.kiraciEkle.gayrimenkulEkle.gayrimenkulEkle.setVisible(true);
    }//GEN-LAST:event_gayrimenkulYonetimiActionPerformed

    private void gayrimenkulEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gayrimenkulEkleActionPerformed

               kiraTahsilat.sozlesmeEkle.kiraciEkle.gayrimenkulEkle.setVisible(true);
               kiraTahsilat.sozlesmeEkle.kiraciEkle.gayrimenkulEkle.jList1.setModel(kiraTahsilat.sozlesmeEkle.kiraciEkle.gayrimenkulEkle.dlm);
               
    }//GEN-LAST:event_gayrimenkulEkleActionPerformed

    private void kiracıEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiracıEkleActionPerformed
        // TODO add your handling code here:
        
        kiraTahsilat.sozlesmeEkle.kiraciEkle.setVisible(true);
        kiraTahsilat.sozlesmeEkle.kiraciEkle.jList1.setModel(kiraTahsilat.sozlesmeEkle.kiraciEkle.dlm);
        kiraTahsilat.sozlesmeEkle.kiraciEkle.jList2.setModel(kiraTahsilat.sozlesmeEkle.kiraciEkle.gayrimenkulEkle.dlm);
        
    }//GEN-LAST:event_kiracıEkleActionPerformed

    private void kiraciYonetimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiraciYonetimiActionPerformed
        // TODO add your handling code here:
        
        kiraTahsilat.sozlesmeEkle.kiraciEkle.kiraciYonetimi.setVisible(true);
    }//GEN-LAST:event_kiraciYonetimiActionPerformed

    private void sYonetimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sYonetimiActionPerformed
        // TODO add your handling code here:
       kiraTahsilat.sozlesmeEkle.sozlesmeYonetimi.setVisible(true);
        
    }//GEN-LAST:event_sYonetimiActionPerformed

    private void sEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sEkleActionPerformed
        // TODO add your handling code here:
        
        kiraTahsilat.sozlesmeEkle.setVisible(true);
        kiraTahsilat.sozlesmeEkle.jList1.setModel(kiraTahsilat.sozlesmeEkle.kiraciEkle.dlm);
        kiraTahsilat.sozlesmeEkle.jList2.setModel(kiraTahsilat.sozlesmeEkle.kiraciEkle.gayrimenkulEkle.dlm);
    }//GEN-LAST:event_sEkleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        kiraTahsilat.setVisible(true);
        kiraTahsilat.jList1.setModel(kiraTahsilat.sozlesmeEkle.kiraciEkle.dlm);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gayrimenkulEkle;
    private javax.swing.JButton gayrimenkulYonetimi;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JButton kiraciYonetimi;
    private javax.swing.JButton kiracıEkle;
    private javax.swing.JButton sEkle;
    private javax.swing.JButton sYonetimi;
    // End of variables declaration//GEN-END:variables
}
