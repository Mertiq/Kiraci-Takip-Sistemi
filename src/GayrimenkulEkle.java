
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class GayrimenkulEkle extends javax.swing.JFrame {

    GayrimenkulYonetimi gayrimenkulEkle = new GayrimenkulYonetimi();

    public ArrayList<Gayrimenkul> gayrimenkuller = new ArrayList<>();

    public GayrimenkulEkle() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kaydet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        oda = new javax.swing.JTextField();
        mKare = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fiyat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pesinat = new javax.swing.JTextField();
        kat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Il = new javax.swing.JLabel();
        isinma = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        il = new javax.swing.JComboBox<>();
        Il1 = new javax.swing.JLabel();
        ilce = new javax.swing.JTextField();
        Il2 = new javax.swing.JLabel();
        mahalle = new javax.swing.JTextField();
        Il3 = new javax.swing.JLabel();
        cadde = new javax.swing.JTextField();
        Il4 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        sil = new javax.swing.JButton();
        tip = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        duzenle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        kaydet.setText("KAYDET");
        kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetActionPerformed(evt);
            }
        });

        jLabel1.setText("Tip");

        jLabel2.setText("Oda Sayısı");

        oda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                odaKeyReleased(evt);
            }
        });

        mKare.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mKareKeyReleased(evt);
            }
        });

        jLabel3.setText("Metrekare");

        fiyat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fiyatKeyReleased(evt);
            }
        });

        jLabel4.setText("Fiyat");

        jLabel5.setText("Peşinat");

        pesinat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesinatKeyReleased(evt);
            }
        });

        kat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                katKeyReleased(evt);
            }
        });

        jLabel6.setText("Kat");

        Il.setText("İl");

        isinma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doğalgaz", "Merkezi Isıtma", "Soba", "Kombi", "Klima" }));
        isinma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isinmaActionPerformed(evt);
            }
        });

        jLabel8.setText("Isınma Tipi");

        il.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta", "İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri", "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce" }));
        il.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilActionPerformed(evt);
            }
        });

        Il1.setText("İlçe");

        ilce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilceActionPerformed(evt);
            }
        });
        ilce.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ilceKeyReleased(evt);
            }
        });

        Il2.setText("Mahalle");

        mahalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mahalleActionPerformed(evt);
            }
        });
        mahalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mahalleKeyReleased(evt);
            }
        });

        Il3.setText("Cadde / Sokak");

        cadde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caddeKeyReleased(evt);
            }
        });

        Il4.setText("NO");

        no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                noKeyReleased(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        sil.setText("GAYRİMENKUL SİL");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        tip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Konut", "İşyeri" }));
        tip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("GAYRİMENKULLER");

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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Il2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mahalle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Il3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadde, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Il1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ilce, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Il, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(il, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mKare, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tip, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(oda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesinat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 413, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(duzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sil, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isinma, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Il4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addComponent(kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mKare, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesinat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(il)
                    .addComponent(Il, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Il1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ilce, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mahalle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Il2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadde, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Il3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Il4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isinma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(duzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189)
                        .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DefaultListModel dlm = new DefaultListModel();
    private void kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetActionPerformed

        if (oda.getText().isEmpty() || kat.getText().isEmpty() || fiyat.getText().isEmpty() || mKare.getText().isEmpty() || ilce.getText().isEmpty() || cadde.getText().isEmpty() || mahalle.getText().isEmpty() || no.getText().isEmpty() || pesinat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "EKSİK BİLGİ GİRDİNİZ", "Hata", 1);
        } else {
            for (Gayrimenkul gayrimenkul : gayrimenkuller) {
                String adres = il.getSelectedItem() + " " + ilce.getText() + " " + mahalle.getText() + " " + cadde.getText() + " " + no.getText();
                if (gayrimenkul.adres.equals(adres)) {
                    JOptionPane.showMessageDialog(null, "Girilen bilgilere ait gayrimenkul sistemde zaten var", "Uyarı", 1);
                    return;
                }
            }
            
            String[] options = new String[2];
            options[0] = new String("Evet");
            options[1] = new String("Hayır");
           int x =  JOptionPane.showOptionDialog(null, "Kaydetmek istediğinize emin misiniz ?", "Uyarı", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);
            if (x == JOptionPane.YES_OPTION) {

                String adres = il.getSelectedItem() + " " + ilce.getText() + " " + mahalle.getText() + " " + cadde.getText() + " " + no.getText();
                Gayrimenkul gayrimenkul = new Gayrimenkul(adres, tip.getSelectedItem().toString(), isinma.getSelectedItem().toString(), Integer.parseInt(oda.getText()), Integer.parseInt(kat.getText()), Integer.parseInt(fiyat.getText()), Integer.parseInt(pesinat.getText()), Integer.parseInt(mKare.getText()));
                gayrimenkul.durum = "Boş";
                gayrimenkuller.add(gayrimenkul);
                gayrimenkulEkle.dtm.addRow(new Object[]{gayrimenkuller.size(), tip.getSelectedItem(), kat.getText(), fiyat.getText(), mKare.getText(), oda.getText(), isinma.getSelectedItem(), gayrimenkul.durum});
                tip.setSelectedIndex(0);
                kat.setText(null);
                fiyat.setText(null);
                oda.setText(null);
                mKare.setText(null);
                isinma.setSelectedIndex(0);
                il.setSelectedIndex(0);
                ilce.setText(null);
                cadde.setText(null);
                mahalle.setText(null);
                no.setText(null);
                pesinat.setText(null);
                this.setVisible(false);
                if (gayrimenkul.durum.equals("Boş")) {
                    int a = Integer.parseInt(gayrimenkulEkle.bosSayisi.getText());
                    a++;
                    gayrimenkulEkle.bosSayisi.setText("" + a);
                }

                dlm.addElement(adres);
                JOptionPane.showMessageDialog(null, "Gayrimenkul kaydedildi", "Uyarı", 1);
            } else if (x == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Gayrimenkul kaydedilmedi", "Uyarı", 1);
                return;
            }
{
            }
        }
    }//GEN-LAST:event_kaydetActionPerformed

    private void isinmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isinmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isinmaActionPerformed

    private void ilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        String[] options = new String[2];
            options[0] = new String("Evet");
            options[1] = new String("Hayır");
           int x =  JOptionPane.showOptionDialog(null, "Silmek istediğinize emin misiniz ?", "Uyarı", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);
        if (x == JOptionPane.YES_OPTION) {
            for (int i = 0; i < gayrimenkuller.size(); i++) {
                if (jList1.getSelectedValue().equals(gayrimenkuller.get(i).adres)) {
                    if (gayrimenkuller.get(i).durum.equals("Boş")) {
                        int a = Integer.parseInt(gayrimenkulEkle.bosSayisi.getText());
                        a--;
                        gayrimenkulEkle.bosSayisi.setText("" + a);
                    } else {
                        int a = Integer.parseInt(gayrimenkulEkle.doluSayisi.getText());
                        a--;
                        gayrimenkulEkle.doluSayisi.setText("" + a);
                    }

                    gayrimenkuller.remove(gayrimenkuller.get(i));
                    dlm.removeElementAt(i);
                    gayrimenkulEkle.dtm.removeRow(i);

                }
            }
            JOptionPane.showMessageDialog(null, "Gayrimenkul silindi", "Uyarı", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Gayrimenkul silinemedi", "Uyarı", 1);
            return;
        }

        jList1.setModel(dlm);

    }//GEN-LAST:event_silActionPerformed

    private void tipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipActionPerformed

    private void duzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duzenleActionPerformed

        if (oda.getText().isEmpty() || kat.getText().isEmpty() || fiyat.getText().isEmpty() || mKare.getText().isEmpty() || ilce.getText().isEmpty() || cadde.getText().isEmpty() || mahalle.getText().isEmpty() || no.getText().isEmpty() || pesinat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "EKSİK BİLGİ GİRDİNİZ", "Hata", 1);
        } else {
            for (Gayrimenkul gayrimenkul : gayrimenkuller) {
                String adres = il.getSelectedItem() + " " + ilce.getText() + " " + mahalle.getText() + " " + cadde.getText() + " " + no.getText();
                if (gayrimenkul.adres.equals(adres)) {
                    JOptionPane.showMessageDialog(null, "Girilen bilgilere ait gayrimenkul sistemde zaten var", "Uyarı", 1);
                    return;
                }
            }
            
            String[] options = new String[2];
            options[0] = new String("Evet");
            options[1] = new String("Hayır");
            int x = JOptionPane.showOptionDialog(null, "Düzenlemek istediğinize emin misiniz ?", "Uyarı", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);
            if (x == JOptionPane.YES_OPTION) {
                for (int i = 0; i < gayrimenkuller.size(); i++) {
                    if (jList1.getSelectedValue().equals(gayrimenkuller.get(i).adres)) {
                        String adres = il.getSelectedItem() + " " + ilce.getText() + " " + mahalle.getText() + " " + cadde.getText() + " " + no.getText();
                        gayrimenkuller.get(i).adres = adres;
                        gayrimenkuller.get(i).pesinat = Integer.parseInt(pesinat.getText());
                        gayrimenkuller.get(i).fiyat = Integer.parseInt(fiyat.getText());
                        gayrimenkuller.get(i).kat = Integer.parseInt(kat.getText());
                        gayrimenkuller.get(i).metrekare = Integer.parseInt(mKare.getText());
                        gayrimenkuller.get(i).oda = Integer.parseInt(oda.getText());
                        gayrimenkuller.get(i).isinma = isinma.getSelectedItem().toString();
                        gayrimenkuller.get(i).tip = tip.getSelectedItem().toString();
                        dlm.setElementAt(gayrimenkuller.get(i).adres, i);
                        gayrimenkulEkle.dtm.setValueAt(gayrimenkuller.size(), i, 0);
                        gayrimenkulEkle.dtm.setValueAt(gayrimenkuller.get(i).tip, i, 1);
                        gayrimenkulEkle.dtm.setValueAt(gayrimenkuller.get(i).kat, i, 2);
                        gayrimenkulEkle.dtm.setValueAt(gayrimenkuller.get(i).fiyat, i, 3);
                        gayrimenkulEkle.dtm.setValueAt(gayrimenkuller.get(i).metrekare, i, 4);
                        gayrimenkulEkle.dtm.setValueAt(gayrimenkuller.get(i).oda, i, 5);
                        gayrimenkulEkle.dtm.setValueAt(gayrimenkuller.get(i).isinma, i, 6);
                        tip.setSelectedIndex(0);
                        kat.setText(null);
                        fiyat.setText(null);
                        oda.setText(null);
                        mKare.setText(null);
                        isinma.setSelectedIndex(0);
                        il.setSelectedIndex(0);
                        ilce.setText(null);
                        cadde.setText(null);
                        mahalle.setText(null);
                        no.setText(null);
                        pesinat.setText(null);
                        this.setVisible(false);

                    }
                }
                JOptionPane.showMessageDialog(null, "Değişiklikler kaydedildi", "Uyarı", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Değişiklikler kaydedilmedi", "Uyarı", 1);
                return;
            }
        }
    }//GEN-LAST:event_duzenleActionPerformed

    private void odaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_odaKeyReleased
        String a = "[^0-9]";
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(oda.getText());
        while (m.find()) {
            JOptionPane.showMessageDialog(null, "Hatalı karakter girdiniz tekrar deneyiniz", "Hata", 1);
            oda.setText(null);
            return;
        }

    }//GEN-LAST:event_odaKeyReleased

    private void mKareKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mKareKeyReleased
        String a = "[^0-9]";
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(mKare.getText());
        while (m.find()) {
            JOptionPane.showMessageDialog(null, "Hatalı karakter girdiniz tekrar deneyiniz", "Hata", 1);
            mKare.setText(null);
            return;
        }
    }//GEN-LAST:event_mKareKeyReleased

    private void fiyatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fiyatKeyReleased
        String a = "[^0-9]";
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(fiyat.getText());
        while (m.find()) {
            JOptionPane.showMessageDialog(null, "Hatalı karakter girdiniz tekrar deneyiniz", "Hata", 1);
            fiyat.setText(null);
            return;
        }
    }//GEN-LAST:event_fiyatKeyReleased

    private void pesinatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesinatKeyReleased
        String a = "[^0-9]";
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(pesinat.getText());
        while (m.find()) {
            JOptionPane.showMessageDialog(null, "Hatalı karakter girdiniz tekrar deneyiniz", "Hata", 1);
            pesinat.setText(null);
            return;
        }
    }//GEN-LAST:event_pesinatKeyReleased

    private void katKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_katKeyReleased
        String a = "[^0-9]";
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(kat.getText());
        while (m.find()) {
            JOptionPane.showMessageDialog(null, "Hatalı karakter girdiniz tekrar deneyiniz", "Hata", 1);
            kat.setText(null);
            return;
        }
    }//GEN-LAST:event_katKeyReleased

    private void ilceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilceActionPerformed

    }//GEN-LAST:event_ilceActionPerformed

    private void mahalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mahalleActionPerformed

    }//GEN-LAST:event_mahalleActionPerformed

    private void caddeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caddeKeyReleased
        String a = "[^A-Za-z0-9]";
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(cadde.getText());
        while (m.find()) {
            JOptionPane.showMessageDialog(null, "Hatalı karakter girdiniz tekrar deneyiniz", "Hata", 1);
            cadde.setText(null);
            return;
        }
    }//GEN-LAST:event_caddeKeyReleased

    private void noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noKeyReleased
        String a = "[^0-9]";
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(no.getText());
        while (m.find()) {
            JOptionPane.showMessageDialog(null, "Hatalı karakter girdiniz tekrar deneyiniz", "Hata", 1);
            no.setText(null);
            return;
        }
    }//GEN-LAST:event_noKeyReleased

    private void ilceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ilceKeyReleased
        // TODO add your handling code here:
        String a = "[^A-Za-z]";
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(ilce.getText());
        while (m.find()) {
            JOptionPane.showMessageDialog(null, "Hatalı karakter girdiniz tekrar deneyiniz", "Hata", 1);
            ilce.setText(null);
            return;
        }
    }//GEN-LAST:event_ilceKeyReleased

    private void mahalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mahalleKeyReleased
        // TODO add your handling code here:
        String a = "[^A-Za-z]";
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(mahalle.getText());
        while (m.find()) {
            JOptionPane.showMessageDialog(null, "Hatalı karakter girdiniz tekrar deneyiniz", "Hata", 1);
            mahalle.setText(null);
            return;
        }
    }//GEN-LAST:event_mahalleKeyReleased

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
            java.util.logging.Logger.getLogger(GayrimenkulEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GayrimenkulEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GayrimenkulEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GayrimenkulEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GayrimenkulEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Il;
    private javax.swing.JLabel Il1;
    private javax.swing.JLabel Il2;
    private javax.swing.JLabel Il3;
    private javax.swing.JLabel Il4;
    private javax.swing.JTextField cadde;
    private javax.swing.JButton duzenle;
    private javax.swing.JTextField fiyat;
    private javax.swing.JComboBox<String> il;
    private javax.swing.JTextField ilce;
    private javax.swing.JComboBox<String> isinma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kat;
    private javax.swing.JButton kaydet;
    private javax.swing.JTextField mKare;
    private javax.swing.JTextField mahalle;
    private javax.swing.JTextField no;
    private javax.swing.JTextField oda;
    private javax.swing.JTextField pesinat;
    private javax.swing.JButton sil;
    private javax.swing.JComboBox<String> tip;
    // End of variables declaration//GEN-END:variables
}
