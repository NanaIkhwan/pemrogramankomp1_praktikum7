/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package main;

import Koneksi.koneksi;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class TambahProduk extends javax.swing.JDialog {
     private AdminPage dataProduk; // Referensi ke DataProduk
    /**
     * Creates new form TambahProduk
     */
    public TambahProduk(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.dataProduk = (AdminPage) parent; // Simpan referensi ke DataProduk
        initComponents();
        
        viewCategory("produk_kategori", cmb_kategori);
        viewCategory("supplier", cmb_supplier);
        
        generateProductCode();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_kodeproduk = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_namaproduk = new javax.swing.JTextField();
        txt_gambarproduk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_hargajual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_hargabeli = new javax.swing.JTextField();
        txt_stokproduk = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bt_browse = new javax.swing.JButton();
        cmb_kategori = new javax.swing.JComboBox<>();
        cmb_supplier = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        bt_simpan = new javax.swing.JButton();
        bt_batl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("KODE PRODUK");

        txt_kodeproduk.setEditable(false);
        txt_kodeproduk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_kodeproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodeprodukActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("NAMA PRODUK");

        txt_namaproduk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_namaproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaprodukActionPerformed(evt);
            }
        });

        txt_gambarproduk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_gambarproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gambarprodukActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("GAMBAR PRODUK");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("KATEGORI  PRODUK");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("SUPPLIER");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("HARGA JUAL");

        txt_hargajual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_hargajual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_hargajualKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("HARGA BELI");

        txt_hargabeli.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_hargabeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_hargabeliKeyTyped(evt);
            }
        });

        txt_stokproduk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_stokproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stokprodukActionPerformed(evt);
            }
        });
        txt_stokproduk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stokprodukKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("STOK PRODUK");

        bt_browse.setText("Browse...");
        bt_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_browseActionPerformed(evt);
            }
        });

        cmb_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_kategoriActionPerformed(evt);
            }
        });

        cmb_supplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_supplierActionPerformed(evt);
            }
        });

        bt_simpan.setText("SIMPAN");
        bt_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simpanActionPerformed(evt);
            }
        });

        bt_batl.setText("BATAL");
        bt_batl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_batlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_kodeproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_namaproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_gambarproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_browse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_kategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_supplier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_hargajual, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_hargabeli, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_stokproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_batl)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_kodeproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_namaproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_gambarproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_browse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(cmb_kategori))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(cmb_supplier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hargajual, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hargabeli, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_stokproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_simpan)
                    .addComponent(bt_batl))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_namaprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaprodukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaprodukActionPerformed

    private void txt_gambarprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gambarprodukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gambarprodukActionPerformed

    private void cmb_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_kategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_kategoriActionPerformed

    private void bt_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_browseActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Pilih Gambar Produk");

        // Menetapkan filter agar hanya file .jpg dan .png yang ditampilkan
        FileNameExtensionFilter filter = new FileNameExtensionFilter("File Gambar", "jpg", "png");
        jfc.setFileFilter(filter);

        // Menampilkan dialog dan mendapatkan pilihan pengguna
        int userSelection = jfc.showOpenDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToOpen = jfc.getSelectedFile();
            JOptionPane.showMessageDialog(this, "File yang dipilih: " + fileToOpen.getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(this, "Perintah buka dibatalkan");
        }
        
    }//GEN-LAST:event_bt_browseActionPerformed

    private void cmb_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_supplierActionPerformed

    private void txt_hargajualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hargajualKeyTyped
        // TODO add your handling code here:
        checkInput(evt);
    }//GEN-LAST:event_txt_hargajualKeyTyped

    private void txt_hargabeliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hargabeliKeyTyped
        checkInput(evt);
    }//GEN-LAST:event_txt_hargabeliKeyTyped

    private void txt_stokprodukKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stokprodukKeyTyped
        checkInput(evt);
    }//GEN-LAST:event_txt_stokprodukKeyTyped

    private void txt_kodeprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodeprodukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodeprodukActionPerformed

    private void bt_batlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_batlActionPerformed
        // TODO add your handling code here:
        AdminPage ap = new AdminPage();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_batlActionPerformed

    private void txt_stokprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stokprodukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stokprodukActionPerformed

    private void bt_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpanActionPerformed
        // TODO add your handling code here:
        simpanDataProduk();
    }//GEN-LAST:event_bt_simpanActionPerformed

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
            java.util.logging.Logger.getLogger(TambahProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TambahProduk dialog = new TambahProduk(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_batl;
    private javax.swing.JButton bt_browse;
    private javax.swing.JButton bt_simpan;
    private javax.swing.JComboBox<String> cmb_kategori;
    private javax.swing.JComboBox<String> cmb_supplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_gambarproduk;
    private javax.swing.JTextField txt_hargabeli;
    private javax.swing.JTextField txt_hargajual;
    private javax.swing.JTextField txt_kodeproduk;
    private javax.swing.JTextField txt_namaproduk;
    private javax.swing.JTextField txt_stokproduk;
    // End of variables declaration//GEN-END:variables

    private void viewCategory(String tableName, JComboBox cmb) {
        try {
            cmb.removeAllItems();
            Connection K = koneksi.konek();
            Statement S = K.createStatement();

            System.out.println("produk_kategori: " + tableName); // Baris debugging

            // Perbarui query SQL dengan nama kolom yang benar
            String Q = "SELECT id, nama FROM " + tableName;  // Gunakan 'nama' bukan 'produk_kategori'
            ResultSet R = S.executeQuery(Q);

            while (R.next()) {
                int id = R.getInt("id");
                String name = R.getString("nama"); // Ambil data dari kolom 'nama'
                // Menambahkan hanya nama ke dalam ComboBox
                cmb.addItem(name);  // Hanya menampilkan nama di ComboBox
            }
        } catch (SQLException e) {
            System.err.println("Kesalahan SQL: " + e.getErrorCode() + " - " + e.getMessage());
            e.printStackTrace(); // Cetak stack trace untuk debugging lebih lanjut
        }
    }

    private void checkInput(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }

    private void generateProductCode() {
        //P00001
        try {
            String pcode = "";
            int lastnumber = getLastProductNumber();
            if (lastnumber < 10) {
                pcode = "P0000" + lastnumber;
            } else if (lastnumber > 9 && lastnumber < 100) {
                pcode = "P000" + lastnumber;
            } else if (lastnumber > 99 && lastnumber < 1000) {
                pcode = "P00" + lastnumber;
            } else if (lastnumber > 999 && lastnumber < 10000) {
                pcode = "P0" + lastnumber;
            } else if (lastnumber > 9999 && lastnumber < 100000) {
                pcode = "P" + lastnumber;
            }
            txt_kodeproduk.setText(pcode);
        } catch (Exception e) {
            //
        }
    }

    private int getLastProductNumber() {
        try {
            Connection K = koneksi.konek();
            Statement S = K.createStatement();
            String Q = "SELECT kode_produk FROM produk ORDER BY id DESC LIMIT 1";  // Pastikan nama tabel dan kolom benar
            ResultSet R = S.executeQuery(Q);
            int n = 0;
            String code = "";
            while (R.next()) {
                code = R.getString("kode_produk");
                n++;
            }

            if (n > 0) {
                // Mengambil nomor dari kode produk, misal P00001
                String k = code.substring(1, 6);
                int num = Integer.parseInt(k);
                return num + 1;
            }
        } catch (Exception e) {
            e.printStackTrace(); // Tambahkan ini untuk debugging
        }
        return 0;
    }
    
    private void simpanDataProduk() {
        try {
            // Membuat koneksi ke database
            Connection K = koneksi.konek();

            // Query SQL untuk menyimpan data produk
            String Q = "INSERT INTO produk (kode_produk, nama_produk, gambar_produk, kategori_produk, supplier, harga_jual, harga_beli, stok_produk) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = K.prepareStatement(Q);

            // Mengatur parameter untuk query SQL
            ps.setString(1, txt_kodeproduk.getText()); // kode produk
            ps.setString(2, txt_namaproduk.getText()); // nama produk
            ps.setString(3, txt_gambarproduk.getText()); // path gambar produk
            ps.setInt(4, cmb_kategori.getSelectedIndex() + 1); // id kategori produk
            ps.setInt(5, cmb_supplier.getSelectedIndex() + 1); // id supplier
            ps.setDouble(6, Double.parseDouble(txt_hargajual.getText())); // harga jual
            ps.setDouble(7, Double.parseDouble(txt_hargabeli.getText())); // harga beli
            ps.setLong(8, Long.parseLong(txt_stokproduk.getText())); // stok produk

            // Menjalankan query untuk menyimpan data
            ps.executeUpdate();

            // Menampilkan pesan sukses
            JOptionPane.showMessageDialog(this, "Data produk berhasil disimpan!");

            // Panggil refreshData() untuk memperbarui tampilan data di tabel DataProduk
            dataProduk.refreshData(); // Gunakan referensi dataProduk

            // Menutup dialog setelah berhasil disimpan
            this.dispose();

        } catch (SQLException e) {
            // Menampilkan pesan error jika ada kesalahan
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data produk: " + e.getMessage());
            e.printStackTrace();
        }
    }



    private void loadData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
