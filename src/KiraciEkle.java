
import static java.awt.PageAttributes.MediaType.A;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Monster
 */
public class KiraciEkle extends javax.swing.JFrame {

    /**
     * Creates new form KiraciEkle
     */
    KiraciYönetimi kiraciYonetimi = new KiraciYönetimi();
    ArrayList<Kiraci> kiracilar = new ArrayList<>();
    GayrimenkulEkle gayrimenkulEkle = new GayrimenkulEkle();

    public KiraciEkle() {
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

        jLabel4 = new javax.swing.JLabel();
        telefon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cinsiyet = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        adi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        soyadi = new javax.swing.JTextField();
        kNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kaydet = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        sil = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        duzenle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        jLabel4.setText("Cinsiyet");

        telefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonActionPerformed(evt);
            }
        });
        telefon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonKeyReleased(evt);
            }
        });

        jLabel6.setText("Cep Telefonu");

        cinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kadın" }));
        cinsiyet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinsiyetActionPerformed(evt);
            }
        });

        jLabel1.setText("Adı");

        adi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adiActionPerformed(evt);
            }
        });
        adi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adiKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adiKeyTyped(evt);
            }
        });

        jLabel2.setText("Soyadı");

        soyadi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                soyadiKeyReleased(evt);
            }
        });

        kNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kNoActionPerformed(evt);
            }
        });
        kNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kNoKeyReleased(evt);
            }
        });

        jLabel3.setText("Kimlik No");

        kaydet.setText("KAYDET");
        kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        sil.setText("KİRACI SİL");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList2);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("GAYRİMENKULLER");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("KİRACILAR");

        duzenle.setText("DÜZENLE");
        duzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duzenleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(kNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sil, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(duzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159)
                .addComponent(kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(duzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cinsiyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinsiyetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinsiyetActionPerformed

    private void kNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kNoActionPerformed
    DefaultListModel dlm = new DefaultListModel();
    private void kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetActionPerformed
        // TODO add your handling code here:

        for (Kiraci kiraci : kiracilar) {
            if (kiraci.kimlikNo.equals(kNo.getText())) {
                JOptionPane.showMessageDialog(null, "Girilen bilgilere ait kiracı sistemde zaten var", "Uyarı", 1);
                return;
            }
        }
        if (adi.getText().isEmpty() || soyadi.getText().isEmpty() || kNo.getText().isEmpty() || telefon.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "EKSİK BİLGİ GİRDİNİZ", "Hata", 1);
        } else if (jList2.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "GAYRİMENKUL SEÇİNİZ", "Hata", 1);
        } else {

            if (telefon.getText().length() != 11) {
            JOptionPane.showMessageDialog(null, "Telefon numarası en az 11 haneli olmalı", "Hata", 1);
            telefon.setText(null);
            return;
        }
            if (kNo.getText().length() != 11) {
            JOptionPane.showMessageDialog(null, "Kimlik numarası en az 11 haneli olamaz", "Hata", 1);
            kNo.setText(null);
            return;
        }
            String[] options = new String[2];
            options[0] = new String("Evet");
            options[1] = new String("Hayır");
            int x = JOptionPane.showOptionDialog(null, "Kaydetmek istediğinize emin misiniz ?", "Uyarı", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);
            if (x == JOptionPane.YES_OPTION) {
                Kiraci kiraci = new Kiraci(adi.getText(), soyadi.getText(), kNo.getText(), telefon.getText(), cinsiyet.getSelectedItem().toString());
                for (int i = 0; i < gayrimenkulEkle.gayrimenkuller.size(); i++) {
                    if (jList2.getSelectedValue().equals(gayrimenkulEkle.gayrimenkuller.get(i).adres)) {
                        kiraci.gayrimenkul = gayrimenkulEkle.gayrimenkuller.get(i);
                        gayrimenkulEkle.gayrimenkuller.get(i).durum = "Dolu";
                        gayrimenkulEkle.gayrimenkulEkle.dtm.setValueAt(gayrimenkulEkle.gayrimenkuller.get(i).durum, i, 7);
                        int a = Integer.parseInt(gayrimenkulEkle.gayrimenkulEkle.bosSayisi.getText());
                        a--;
                        int b = Integer.parseInt(gayrimenkulEkle.gayrimenkulEkle.doluSayisi.getText());
                        b++;
                        gayrimenkulEkle.gayrimenkulEkle.bosSayisi.setText("" + a);
                        gayrimenkulEkle.gayrimenkulEkle.doluSayisi.setText("" + b);
                    }
                }
                kiracilar.add(kiraci);
                kiraciYonetimi.dtm.addRow(new Object[]{kiracilar.size(), adi.getText(), soyadi.getText(), kNo.getText(), telefon.getText()});
                adi.setText(null);
                soyadi.setText(null);
                telefon.setText(null);
                kNo.setText(null);
                cinsiyet.setSelectedIndex(0);

                this.setVisible(false);
                dlm.addElement(kiraci.adi + " " + kiraci.soyadi);

                JOptionPane.showMessageDialog(null, "Kiracı kaydedildi", "Uyarı", 1);

            } else if (x == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Kiracı kaydedilmedi", "Uyarı", 1);
                return;
            }
        }


    }//GEN-LAST:event_kaydetActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        // TODO add your handling code here:

        if (kiracilar.size() == 0 || jList1.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Seçili Kiracı Yok", "Hata", 1);
        } else {
            String[] options = new String[2];
            options[0] = new String("Evet");
            options[1] = new String("Hayır");
            int x = JOptionPane.showOptionDialog(null, "Silmek istediğinize emin misiniz ?", "Uyarı", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);
            if (x == JOptionPane.YES_OPTION) {

                for (int i = 0; i < kiracilar.size(); i++) {
                    if (jList1.getSelectedValue().equals(kiracilar.get(i).adi + " " + kiracilar.get(i).soyadi)) {
                        for (int j = 0; j < gayrimenkulEkle.gayrimenkuller.size(); j++) {
                            if (kiracilar.get(i).gayrimenkul == gayrimenkulEkle.gayrimenkuller.get(j)) {
                                gayrimenkulEkle.gayrimenkuller.remove(gayrimenkulEkle.gayrimenkuller.get(j));
                                gayrimenkulEkle.dlm.removeElementAt(j);
                                gayrimenkulEkle.gayrimenkulEkle.dtm.removeRow(j);
                                int a = Integer.parseInt(gayrimenkulEkle.gayrimenkulEkle.doluSayisi.getText());
                                a--;
                                gayrimenkulEkle.gayrimenkulEkle.doluSayisi.setText("" + a);
                            }
                        }
                        kiracilar.remove(kiracilar.get(i));
                        dlm.removeElementAt(i);
                        kiraciYonetimi.dtm.removeRow(i);

                    }
                }
                JOptionPane.showMessageDialog(null, "Kiracı silindi", "Uyarı", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Kiracı silinemedi", "Uyarı", 1);
                return;
            }
        }
    }//GEN-LAST:event_silActionPerformed

    private void duzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duzenleActionPerformed
        for (Kiraci kiraci : kiracilar) {
            if (kiraci.kimlikNo.equals(kNo.getText())) {
                JOptionPane.showMessageDialog(null, "Girilen bilgilere ait kiracı sistemde zaten var", "Uyarı", 1);
            }
        }
        if (adi.getText().isEmpty() || soyadi.getText().isEmpty() || kNo.getText().isEmpty() || telefon.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "EKSİK BİLGİ GİRDİNİZ", "Hata", 1);
        } else if (jList2.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "GAYRİMENKUL SEÇİNİZ", "Hata", 1);
        } else {
            String[] options = new String[2];
            options[0] = new String("Evet");
            options[1] = new String("Hayır");
            int x = JOptionPane.showOptionDialog(null, "Değişiklikleri kaydetmek istediğinize emin misiniz ?", "Uyarı", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);
            if (x == JOptionPane.YES_OPTION) {
                for (int i = 0; i < kiracilar.size(); i++) {
                    if (jList1.getSelectedValue().equals(kiracilar.get(i).adi + " " + kiracilar.get(i).soyadi)) {
                        kiracilar.get(i).adi = adi.getText();
                        kiracilar.get(i).soyadi = soyadi.getText();
                        kiracilar.get(i).kimlikNo = kNo.getText();
                        kiracilar.get(i).telefon = telefon.getText();
                        for (int j = 0; j < gayrimenkulEkle.gayrimenkuller.size(); j++) {
                            kiracilar.get(i).gayrimenkul.durum = "Boş";
                            gayrimenkulEkle.gayrimenkulEkle.dtm.setValueAt(kiracilar.get(i).gayrimenkul.durum, j, 7);
                            if (jList2.getSelectedValue().equals(gayrimenkulEkle.gayrimenkuller.get(j).adres)) {
                                kiracilar.get(i).gayrimenkul = gayrimenkulEkle.gayrimenkuller.get(j);
                                kiracilar.get(i).gayrimenkul.durum = "Dolu";
                                gayrimenkulEkle.gayrimenkulEkle.dtm.setValueAt(kiracilar.get(i).gayrimenkul.durum, j, 7);
                            }
                        }
                    }
                    dlm.setElementAt(kiracilar.get(i).adi + " " + kiracilar.get(i).soyadi, i);
                    kiraciYonetimi.dtm.setValueAt(kiracilar.size(), i, 0);
                    kiraciYonetimi.dtm.setValueAt(adi.getText(), i, 1);
                    kiraciYonetimi.dtm.setValueAt(soyadi.getText(), i, 2);
                    kiraciYonetimi.dtm.setValueAt(kNo.getText(), i, 3);
                    kiraciYonetimi.dtm.setValueAt(telefon.getText(), i, 4);

                    adi.setText(null);
                    soyadi.setText(null);
                    telefon.setText(null);
                    kNo.setText(null);
                    cinsiyet.setSelectedIndex(0);

                }

            } else {
                JOptionPane.showMessageDialog(null, "Değişiklikler kaydedilmedi", "Uyarı", 1);
                return;
            }
        }

    }//GEN-LAST:event_duzenleActionPerformed

    private void adiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adiActionPerformed


    }//GEN-LAST:event_adiActionPerformed

    private void adiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adiKeyPressed


    }//GEN-LAST:event_adiKeyPressed

    private void adiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adiKeyTyped

    }//GEN-LAST:event_adiKeyTyped

    private void adiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adiKeyReleased
        String a = "[^A-Za-z]";
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(adi.getText());
        while (m.find()) {
            JOptionPane.showMessageDialog(null, "Hatalı karakter girdiniz tekrar deneyiniz", "Hata", 1);
            adi.setText(null);
            return;
        }
    }//GEN-LAST:event_adiKeyReleased

    private void soyadiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_soyadiKeyReleased
        String a = "[^A-Za-z]";
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(soyadi.getText());
        while (m.find()) {
            JOptionPane.showMessageDialog(null, "Hatalı karakter girdiniz tekrar deneyiniz", "Hata", 1);
            soyadi.setText(null);
            return;
        }
    }//GEN-LAST:event_soyadiKeyReleased

    private void kNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kNoKeyReleased

        if (kNo.getText().length() > 11) {
            JOptionPane.showMessageDialog(null, "Kimlik numarası 11 haneden fazla olamaz", "Hata", 1);
            kNo.setText(null);
        }
        String a = "[^0-9]";
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(kNo.getText());
        while (m.find()) {
            JOptionPane.showMessageDialog(null, "Hatalı karakter girdiniz tekrar deneyiniz", "Hata", 1);
            kNo.setText(null);
            return;
        }


    }//GEN-LAST:event_kNoKeyReleased

    private void telefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonActionPerformed

    }//GEN-LAST:event_telefonActionPerformed

    private void telefonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonKeyReleased
        if (telefon.getText().length() > 11) {
            JOptionPane.showMessageDialog(null, "Telefon numarası 11 haneden fazla olamaz", "Hata", 1);
            telefon.setText(null);
        }
        String a = "[^0-9]";
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(telefon.getText());
        while (m.find()) {
            JOptionPane.showMessageDialog(null, "Hatalı karakter girdiniz tekrar deneyiniz", "Hata", 1);
            telefon.setText(null);
            return;
        }

    }//GEN-LAST:event_telefonKeyReleased

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
            java.util.logging.Logger.getLogger(KiraciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KiraciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KiraciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KiraciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KiraciEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adi;
    private javax.swing.JComboBox<String> cinsiyet;
    private javax.swing.JButton duzenle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JList<String> jList1;
    public javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kNo;
    private javax.swing.JButton kaydet;
    private javax.swing.JButton sil;
    private javax.swing.JTextField soyadi;
    private javax.swing.JTextField telefon;
    // End of variables declaration//GEN-END:variables
}
