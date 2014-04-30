/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eyescare.gui;

import javax.swing.JOptionPane;
import eyescare.logic.*;
import java.sql.*;
/**
 *
 * @author Rizal Asrul Pambudi
 */
public class InfoPenyakit extends javax.swing.JFrame {
    private DetailInfo detailInfo;
    private String sql, kode_pengguna;
    /**
     * Creates new form Login
     */
    public InfoPenyakit() {
        initComponents();
    }
    
    public InfoPenyakit(String kode_pengguna) {
        this.kode_pengguna = kode_pengguna;
        initComponents();
    }
    
    private void goToDiagnosa(String sql) {
        this.detailInfo = new DetailInfo(sql, this.kode_pengguna);
        this.detailInfo.setLocation(this.getLocation());
        this.detailInfo.setVisible(true);
        this.dispose();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        konjungtivitisButton = new javax.swing.JButton();
        keratokonjungvivitasButton = new javax.swing.JButton();
        endoftalmitisButton = new javax.swing.JButton();
        trakomaButton = new javax.swing.JButton();
        blefaritisButton = new javax.swing.JButton();
        dakriosistitisButton = new javax.swing.JButton();
        selulitisButton = new javax.swing.JButton();
        ulusKorneaButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        logoutButton1 = new javax.swing.JButton();
        kembaliButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eye Care v1.0");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eyescare/images/bg-icon.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jLabel2.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("Eye Care");

        jLabel3.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        jLabel3.setText("Sistem Pakar Penyakit Mata");

        closeButton.setBackground(new java.awt.Color(255, 153, 51));
        closeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eyescare/images/Close-2-icon.png"))); // NOI18N
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(154, 154, 154))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(closeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 2, true));

        konjungtivitisButton.setBackground(new java.awt.Color(102, 51, 255));
        konjungtivitisButton.setForeground(new java.awt.Color(204, 204, 255));
        konjungtivitisButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eyescare/images/broken-icon.png"))); // NOI18N
        konjungtivitisButton.setText("KONJUNGTIVITIS");
        konjungtivitisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        konjungtivitisButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        konjungtivitisButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        konjungtivitisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konjungtivitisButtonActionPerformed(evt);
            }
        });

        keratokonjungvivitasButton.setBackground(new java.awt.Color(102, 51, 255));
        keratokonjungvivitasButton.setForeground(new java.awt.Color(204, 204, 255));
        keratokonjungvivitasButton.setIcon(new javax.swing.ImageIcon("E:\\My Space\\Task Space\\EEPIS\\Semester 3\\Pemrograman Berbasis Obyek\\Praktikum\\Sistem Pakar Penyakit Mata\\SistemPakarPenyakitMata\\images\\broken-icon.png")); // NOI18N
        keratokonjungvivitasButton.setText("KERATOKONJUNGVIVITAS VERNALIS");
        keratokonjungvivitasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        keratokonjungvivitasButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        keratokonjungvivitasButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        keratokonjungvivitasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keratokonjungvivitasButtonActionPerformed(evt);
            }
        });

        endoftalmitisButton.setBackground(new java.awt.Color(102, 51, 255));
        endoftalmitisButton.setForeground(new java.awt.Color(204, 204, 255));
        endoftalmitisButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eyescare/images/broken-icon.png"))); // NOI18N
        endoftalmitisButton.setText("ENDOFTALMITIS");
        endoftalmitisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        endoftalmitisButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        endoftalmitisButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        endoftalmitisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endoftalmitisButtonActionPerformed(evt);
            }
        });

        trakomaButton.setBackground(new java.awt.Color(102, 51, 255));
        trakomaButton.setForeground(new java.awt.Color(204, 204, 255));
        trakomaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eyescare/images/broken-icon.png"))); // NOI18N
        trakomaButton.setText("TRAKOMA");
        trakomaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trakomaButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        trakomaButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        trakomaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trakomaButtonActionPerformed(evt);
            }
        });

        blefaritisButton.setBackground(new java.awt.Color(102, 51, 255));
        blefaritisButton.setForeground(new java.awt.Color(204, 204, 255));
        blefaritisButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eyescare/images/broken-icon.png"))); // NOI18N
        blefaritisButton.setText("BLEFARITIS");
        blefaritisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blefaritisButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        blefaritisButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        blefaritisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blefaritisButtonActionPerformed(evt);
            }
        });

        dakriosistitisButton.setBackground(new java.awt.Color(102, 51, 255));
        dakriosistitisButton.setForeground(new java.awt.Color(204, 204, 255));
        dakriosistitisButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eyescare/images/broken-icon.png"))); // NOI18N
        dakriosistitisButton.setText("DAKRIOSISTITIS");
        dakriosistitisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dakriosistitisButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dakriosistitisButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        dakriosistitisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dakriosistitisButtonActionPerformed(evt);
            }
        });

        selulitisButton.setBackground(new java.awt.Color(102, 51, 255));
        selulitisButton.setForeground(new java.awt.Color(204, 204, 255));
        selulitisButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eyescare/images/broken-icon.png"))); // NOI18N
        selulitisButton.setText("SELULITIS ORBITALIS");
        selulitisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selulitisButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        selulitisButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        selulitisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selulitisButtonActionPerformed(evt);
            }
        });

        ulusKorneaButton.setBackground(new java.awt.Color(102, 51, 255));
        ulusKorneaButton.setForeground(new java.awt.Color(204, 204, 255));
        ulusKorneaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eyescare/images/broken-icon.png"))); // NOI18N
        ulusKorneaButton.setText("ULUS KORNEA");
        ulusKorneaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ulusKorneaButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ulusKorneaButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ulusKorneaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulusKorneaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(keratokonjungvivitasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(endoftalmitisButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selulitisButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(konjungtivitisButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 42, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(trakomaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(blefaritisButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dakriosistitisButton, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(ulusKorneaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(trakomaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(konjungtivitisButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blefaritisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keratokonjungvivitasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dakriosistitisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endoftalmitisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selulitisButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(ulusKorneaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("DAFTAR PENYAKIT");

        logoutButton1.setBackground(new java.awt.Color(204, 255, 255));
        logoutButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logoutButton1.setForeground(new java.awt.Color(0, 51, 102));
        logoutButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eyescare/images/Log-Out-icon.png"))); // NOI18N
        logoutButton1.setText("Logout");
        logoutButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });

        kembaliButton.setBackground(new java.awt.Color(204, 255, 255));
        kembaliButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kembaliButton.setForeground(new java.awt.Color(0, 51, 102));
        kembaliButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eyescare/images/back-icon.png"))); // NOI18N
        kembaliButton.setText("Kembali");
        kembaliButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(logoutButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(81, 81, 81)
                        .addComponent(kembaliButton))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keratokonjungvivitasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keratokonjungvivitasButtonActionPerformed
        this.sql = "SELECT penyakit.nama_penyakit, penyakit.deskripsi_penyakit, penyakit.gejala_penyakit, solusi FROM penyakit WHERE penyakit.kode_penyakit = 2";
        this.goToDiagnosa(this.sql);
    }//GEN-LAST:event_keratokonjungvivitasButtonActionPerformed

    private void konjungtivitisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konjungtivitisButtonActionPerformed
        this.sql = "SELECT penyakit.nama_penyakit, penyakit.deskripsi_penyakit, penyakit.gejala_penyakit, solusi FROM penyakit WHERE penyakit.kode_penyakit = 1";
        this.goToDiagnosa(this.sql);
    }//GEN-LAST:event_konjungtivitisButtonActionPerformed

    private void endoftalmitisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endoftalmitisButtonActionPerformed
        this.sql = "SELECT penyakit.nama_penyakit, penyakit.deskripsi_penyakit, penyakit.gejala_penyakit, solusi FROM penyakit WHERE penyakit.kode_penyakit = 3";
        this.goToDiagnosa(this.sql);
    }//GEN-LAST:event_endoftalmitisButtonActionPerformed

    private void selulitisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selulitisButtonActionPerformed
        this.sql = "SELECT penyakit.nama_penyakit, penyakit.deskripsi_penyakit, penyakit.gejala_penyakit, solusi FROM penyakit WHERE penyakit.kode_penyakit = 4";
        this.goToDiagnosa(this.sql);
    }//GEN-LAST:event_selulitisButtonActionPerformed

    private void trakomaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trakomaButtonActionPerformed
        this.sql = "SELECT penyakit.nama_penyakit, penyakit.deskripsi_penyakit, penyakit.gejala_penyakit, solusi FROM penyakit WHERE penyakit.kode_penyakit = 5";
        this.goToDiagnosa(this.sql);
    }//GEN-LAST:event_trakomaButtonActionPerformed

    private void blefaritisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blefaritisButtonActionPerformed
        this.sql = "SELECT penyakit.nama_penyakit, penyakit.deskripsi_penyakit, penyakit.gejala_penyakit, solusi FROM penyakit WHERE penyakit.kode_penyakit = 6";
        this.goToDiagnosa(this.sql);
    }//GEN-LAST:event_blefaritisButtonActionPerformed

    private void dakriosistitisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dakriosistitisButtonActionPerformed
        this.sql = "SELECT penyakit.nama_penyakit, penyakit.deskripsi_penyakit, penyakit.gejala_penyakit, solusi FROM penyakit WHERE penyakit.kode_penyakit = 7";
        this.goToDiagnosa(this.sql);
    }//GEN-LAST:event_dakriosistitisButtonActionPerformed

    private void ulusKorneaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulusKorneaButtonActionPerformed
        this.sql = "SELECT penyakit.nama_penyakit, penyakit.deskripsi_penyakit, penyakit.gejala_penyakit, solusi FROM penyakit WHERE penyakit.kode_penyakit = 8";
        this.goToDiagnosa(this.sql);
    }//GEN-LAST:event_ulusKorneaButtonActionPerformed

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        Login login = new Login();
        JOptionPane.showMessageDialog(null, "Terima Kasih Telah Menggunakan Aplikasi Eye Care");
        login.setLocation(this.getLocation());
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButton1ActionPerformed

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        Menu Menu = new Menu(this.kode_pengguna);
        Menu.setLocation(this.getLocation());
        Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kembaliButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this,
                "Yakin ingin keluar?",
                "Peringatan",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
 
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InfoPenyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoPenyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoPenyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoPenyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoPenyakit().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blefaritisButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton dakriosistitisButton;
    private javax.swing.JButton endoftalmitisButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JButton keratokonjungvivitasButton;
    private javax.swing.JButton konjungtivitisButton;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JButton selulitisButton;
    private javax.swing.JButton trakomaButton;
    private javax.swing.JButton ulusKorneaButton;
    // End of variables declaration//GEN-END:variables
}
