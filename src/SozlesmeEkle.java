
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SozlesmeEkle extends javax.swing.JFrame {

    SozlesmeYonetimi sozlesmeYonetimi = new SozlesmeYonetimi();
    KiraciEkle kiraciEkle = new KiraciEkle();
    DefaultTableModel dtm;
    ArrayList<Sozlesme> sozlesmeler = new ArrayList<>();

    public SozlesmeEkle() {
        initComponents();
        dtm = (DefaultTableModel) jTable1.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        sozlesmeOlustur = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sil = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        baslangicGunu = new javax.swing.JComboBox<>();
        baslangicAyi = new javax.swing.JComboBox<>();
        baslangicYili = new javax.swing.JComboBox<>();
        bitisAyi = new javax.swing.JComboBox<>();
        bitisYili = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jList2);

        sozlesmeOlustur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sozlesmeOlustur.setText("KAYDET");
        sozlesmeOlustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sozlesmeOlusturActionPerformed(evt);
            }
        });

        jLabel1.setText("Sözleşme Süresi");

        jLabel2.setText("/");

        sil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sil.setText("SÖZLEŞME SİL");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "vade tarihi", "ödeme miktarı", "Durum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("ÖDEME PLANI");

        baslangicGunu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        baslangicGunu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                baslangicGunuMousePressed(evt);
            }
        });
        baslangicGunu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslangicGunuActionPerformed(evt);
            }
        });

        baslangicAyi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        baslangicAyi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                baslangicAyiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                baslangicAyiMouseEntered(evt);
            }
        });
        baslangicAyi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslangicAyiActionPerformed(evt);
            }
        });

        baslangicYili.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        bitisAyi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        bitisYili.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("KİRACILAR");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("GAYRİMENKULLER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sozlesmeOlustur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(baslangicGunu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(baslangicAyi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(baslangicYili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bitisAyi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bitisYili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baslangicGunu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baslangicAyi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baslangicYili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bitisAyi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bitisYili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sozlesmeOlustur, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sozlesmeOlusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sozlesmeOlusturActionPerformed

        if (!sozlesmeler.isEmpty()) {
            dtm.getDataVector().removeAllElements();
        }
        if (kiraciEkle.kiracilar.size() == 0 || kiraciEkle.gayrimenkulEkle.gayrimenkuller.size() == 0) {
            JOptionPane.showMessageDialog(null, "Sistemde kayıtlı kiracı ya da gayrimenkul bulunamadı", "Hata", 1);
        } else if (jList1.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "KİRACI SEÇİNİZ", "Hata", 1);
        } else if (jList2.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "GAYRİMENKUL SEÇİNİZ", "Hata", 1);
        } else {
            String[] options = new String[2];
            options[0] = new String("Evet");
            options[1] = new String("Hayır");
            int x = JOptionPane.showOptionDialog(null, "Kaydetmek istediğinize emin misiniz ?", "Uyarı", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);
            if (x == JOptionPane.YES_OPTION) {

                Sozlesme sozlesme = new Sozlesme();
                for (int i = 0; i < kiraciEkle.kiracilar.size(); i++) {
                    if (jList1.getSelectedValue().equals(kiraciEkle.kiracilar.get(i).adi + " " + kiraciEkle.kiracilar.get(i).soyadi)) {
                        sozlesme.kiraci = kiraciEkle.kiracilar.get(i);
                    }
                }
                for (int i = 0; i < kiraciEkle.gayrimenkulEkle.gayrimenkuller.size(); i++) {
                    if (jList2.getSelectedValue().equals(kiraciEkle.gayrimenkulEkle.gayrimenkuller.get(i).adres)) {
                        sozlesme.kiraci.gayrimenkul = kiraciEkle.gayrimenkulEkle.gayrimenkuller.get(i);
                    }
                }
                int a = sozlesme.baslangicGunu = Integer.parseInt(baslangicGunu.getSelectedItem().toString());
                int b = sozlesme.baslangicAyi = Integer.parseInt(baslangicAyi.getSelectedItem().toString());
                int c = sozlesme.baslangicYili = Integer.parseInt(baslangicYili.getSelectedItem().toString());
                int d = sozlesme.bitisAyi = Integer.parseInt(bitisAyi.getSelectedItem().toString());
                int e = sozlesme.bitisYili = Integer.parseInt(bitisYili.getSelectedItem().toString());
                String baslangic;
                String bitis;
                if (a < 10 && b < 10) {
                    baslangic = "0" + a + "." + "0" + b + "." + c;
                } else if (a < 10) {
                    baslangic = "0" + a + "." + b + "." + c;
                } else if (b < 10) {
                    baslangic = a + "." + "0" + b + "." + c;
                } else {
                    baslangic = a + "." + b + "." + c;
                }
                if (a < 10 && d < 10) {
                    bitis = "0" + a + "." + "0" + d + "." + e;
                } else if (a < 10) {
                    bitis = "0" + a + "." + d + "." + e;
                } else if (d < 10) {
                    bitis = a + "." + "0" + d + "." + e;
                } else {
                    bitis = a + "." + d + "." + e;
                }
                sozlesmeYonetimi.dtm1.addRow(new Object[]{sozlesme.kiraci.adi, sozlesme.kiraci.soyadi, sozlesme.kiraci.kimlikNo, sozlesme.kiraci.gayrimenkul.adres, baslangic, bitis});

                int pesinat = sozlesme.kiraci.gayrimenkul.pesinat;
                //sözleşme ekle
                b++;
                while (c <= e) {
                    if (b > d && c == e) {
                        break;
                    }
                    String vade;
                    if (a < 10 && b < 10) {
                        vade = "0" + a + "." + "0" + b + "." + c;
                    } else if (a < 10) {
                        vade = "0" + a + "." + b + "." + c;
                    } else if (b < 10) {
                        vade = a + "." + "0" + b + "." + c;
                    } else {
                        vade = a + "." + b + "." + c;
                    }
                    if (pesinat >= sozlesme.kiraci.gayrimenkul.fiyat) {
                        dtm.addRow(new Object[]{vade, sozlesme.kiraci.gayrimenkul.fiyat, "Ödenmiş"});
                        pesinat -= sozlesme.kiraci.gayrimenkul.fiyat;
                    } else {
                        dtm.addRow(new Object[]{vade, sozlesme.kiraci.gayrimenkul.fiyat - pesinat, "Ödenmemiş"});
                        pesinat = 0;
                    }
                    b++;
                    if (b > 12) {
                        b = 1;
                        c++;
                    }
                }
                sozlesmeler.add(sozlesme);
                JOptionPane.showMessageDialog(null, "Sözleşme kaydedildi", "Uyarı", 1);
            } else if (x == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Sözleşme kaydedilmedi", "Uyarı", 1);
                return;
            }

        }
    }//GEN-LAST:event_sozlesmeOlusturActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        String[] options = new String[2];
        options[0] = new String("Evet");
        options[1] = new String("Hayır");
        int x = JOptionPane.showOptionDialog(null, "Silmek istediğinize emin misiniz ?", "Uyarı", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);
        if (x == JOptionPane.YES_OPTION) {
            for (int m = 0; m < sozlesmeler.size(); m++) {
                if (sozlesmeler.get(m).kiraci.gayrimenkul.adres.equals(jList2.getSelectedValue()) && jList1.getSelectedValue().equals(sozlesmeler.get(m).kiraci.adi + " " + sozlesmeler.get(m).kiraci.soyadi)) {
                    sozlesmeler.remove(m);
                    sozlesmeYonetimi.dtm1.removeRow(m);
                    dtm.getDataVector().removeAllElements();
                    for (int i = 0; i < kiraciEkle.kiracilar.size(); i++) {
                        if (jList1.getSelectedValue().equals(kiraciEkle.kiracilar.get(i).adi + " " + kiraciEkle.kiracilar.get(i).soyadi)) {
                            for (int j = 0; j < kiraciEkle.gayrimenkulEkle.gayrimenkuller.size(); j++) {
                                if (kiraciEkle.kiracilar.get(i).gayrimenkul == kiraciEkle.gayrimenkulEkle.gayrimenkuller.get(j)) {
                                    kiraciEkle.gayrimenkulEkle.gayrimenkuller.remove(kiraciEkle.gayrimenkulEkle.gayrimenkuller.get(j));
                                    kiraciEkle.gayrimenkulEkle.dlm.removeElementAt(j);
                                    kiraciEkle.gayrimenkulEkle.gayrimenkulEkle.dtm.removeRow(j);
                                    int a = Integer.parseInt(kiraciEkle.gayrimenkulEkle.gayrimenkulEkle.doluSayisi.getText());
                                    a--;
                                    kiraciEkle.gayrimenkulEkle.gayrimenkulEkle.doluSayisi.setText("" + a);
                                }
                            }
                            kiraciEkle.kiracilar.remove(kiraciEkle.kiracilar.get(i));
                            kiraciEkle.dlm.removeElementAt(i);
                            kiraciEkle.kiraciYonetimi.dtm.removeRow(i);
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Sözleşme silindi", "Uyarı", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Sözleşme silinemedi ", "Uyarı", 1);
            return;
        }


    }//GEN-LAST:event_silActionPerformed

    private void baslangicAyiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslangicAyiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baslangicAyiActionPerformed

    private void baslangicAyiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baslangicAyiMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_baslangicAyiMouseClicked

    private void baslangicAyiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baslangicAyiMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_baslangicAyiMouseEntered

    private void baslangicGunuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslangicGunuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baslangicGunuActionPerformed

    private void baslangicGunuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baslangicGunuMousePressed
        // TODO add your handling code here:
        String[] subat = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"};
        String[] bir = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String[] otuz = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(subat);
        DefaultComboBoxModel model1 = new DefaultComboBoxModel(bir);
        DefaultComboBoxModel model2 = new DefaultComboBoxModel(otuz);
        int[] a = {0, 2, 4, 6, 7, 9, 11};
        int[] b = {3, 5, 8, 10};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (baslangicAyi.getSelectedIndex() == 1) {
                    baslangicGunu.setModel(model);
                    return;
                } else if (baslangicAyi.getSelectedIndex() == a[i]) {
                    baslangicGunu.setModel(model1);
                    return;
                } else if (baslangicAyi.getSelectedIndex() == b[i]) {
                    baslangicGunu.setModel(model2);
                    return;
                }
            }
        }


    }//GEN-LAST:event_baslangicGunuMousePressed

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
            java.util.logging.Logger.getLogger(SozlesmeEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SozlesmeEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SozlesmeEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SozlesmeEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SozlesmeEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> baslangicAyi;
    private javax.swing.JComboBox<String> baslangicGunu;
    private javax.swing.JComboBox<String> baslangicYili;
    private javax.swing.JComboBox<String> bitisAyi;
    private javax.swing.JComboBox<String> bitisYili;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JList<String> jList1;
    public javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton sil;
    private javax.swing.JButton sozlesmeOlustur;
    // End of variables declaration//GEN-END:variables
}
