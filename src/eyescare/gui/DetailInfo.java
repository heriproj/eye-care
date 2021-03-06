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
public class DetailInfo extends javax.swing.JFrame {
    private Connection c = DBConnections.getCon();
    private String sql, namaPenyakit, solusi, gejala, deskripsi, kode_pengguna;
    private ResultSet hasilQuery = null;
    /**
     * Creates new form Login
     */
    public DetailInfo() {
        initComponents();
    }
    
    public DetailInfo(String sql, String kode_pengguna) {
        this.kode_pengguna = kode_pengguna;
        this.sql = sql;
        initComponents();
        initPenyakit();
        initKonten();
    }
    
    private void initPenyakit() {
        try{
            Statement s = c.createStatement();
            
            this.sql = sql;
            this.hasilQuery = s.executeQuery(sql);
            while(hasilQuery.next()) {
                namaPenyakit = hasilQuery.getString(1);
                deskripsi = hasilQuery.getString(2);
                gejala = hasilQuery.getString(3);
                solusi = hasilQuery.getString(4);
            }
            this.hasilQuery.close();
            s.close();
        }catch(SQLException e){
            System.out.println("Error pada method getSelect()");
        }
    }
    
    private void initKonten() {
        this.namaPenyakitLabel.setText(this.namaPenyakit);
        this.apaItuLabel.setText("Apa itu "+ this.namaPenyakit +"?");
        this.deskripsiTextArea.setText(this.deskripsi);
        this.apaGejalaLabel.setText("Apa gejala dari penyakit "+ this.namaPenyakit +"?");
        this.gejalaTextArea.setText(this.gejala);
        this.apaSolusiLabel.setText("Apa solusi dari penyakit "+ this.namaPenyakit +"?");
        this.solusiTextArea.setText(this.solusi);
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
        namaPenyakitLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        apaItuLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        deskripsiTextArea = new javax.swing.JTextArea();
        apaGejalaLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        gejalaTextArea = new javax.swing.JTextArea();
        apaSolusiLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        solusiTextArea = new javax.swing.JTextArea();
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

        namaPenyakitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        namaPenyakitLabel.setForeground(new java.awt.Color(255, 102, 0));
        namaPenyakitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namaPenyakitLabel.setText("NAMA PENYAKIT");

        jScrollPane1.setBorder(null);

        jPanel6.setBackground(new java.awt.Color(153, 255, 153));

        apaItuLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apaItuLabel.setText("Apa itu Nama_Penyakit?");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        deskripsiTextArea.setEditable(false);
        deskripsiTextArea.setBackground(new java.awt.Color(204, 255, 204));
        deskripsiTextArea.setColumns(20);
        deskripsiTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deskripsiTextArea.setForeground(new java.awt.Color(0, 0, 102));
        deskripsiTextArea.setLineWrap(true);
        deskripsiTextArea.setRows(5);
        jScrollPane2.setViewportView(deskripsiTextArea);

        apaGejalaLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apaGejalaLabel.setText("Apa gelaja dari penyakit Nama_Penyakit?");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        gejalaTextArea.setEditable(false);
        gejalaTextArea.setBackground(new java.awt.Color(204, 255, 204));
        gejalaTextArea.setColumns(20);
        gejalaTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gejalaTextArea.setForeground(new java.awt.Color(0, 0, 102));
        gejalaTextArea.setLineWrap(true);
        gejalaTextArea.setRows(5);
        jScrollPane3.setViewportView(gejalaTextArea);

        apaSolusiLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apaSolusiLabel.setText("Apa solusi dari penyakit Nama_Penyakit?");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        solusiTextArea.setEditable(false);
        solusiTextArea.setBackground(new java.awt.Color(204, 255, 204));
        solusiTextArea.setColumns(20);
        solusiTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        solusiTextArea.setForeground(new java.awt.Color(0, 0, 102));
        solusiTextArea.setLineWrap(true);
        solusiTextArea.setRows(5);
        jScrollPane4.setViewportView(solusiTextArea);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apaItuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apaGejalaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)
                            .addComponent(apaSolusiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(apaItuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(apaGejalaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(apaSolusiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel6);

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
                .addComponent(logoutButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaPenyakitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kembaliButton)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(namaPenyakitLabel)
                        .addComponent(kembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 482, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        Login login = new Login();
        JOptionPane.showMessageDialog(null, "Terima Kasih Telah Menggunakan Aplikasi Eye Care");
        login.setLocation(this.getLocation());
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButton1ActionPerformed

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        InfoPenyakit infoPenyakit = new InfoPenyakit(this.kode_pengguna);
        infoPenyakit.setLocation(this.getLocation());
        infoPenyakit.setVisible(true);
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
            java.util.logging.Logger.getLogger(DetailInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailInfo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apaGejalaLabel;
    private javax.swing.JLabel apaItuLabel;
    private javax.swing.JLabel apaSolusiLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextArea deskripsiTextArea;
    private javax.swing.JTextArea gejalaTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JLabel namaPenyakitLabel;
    private javax.swing.JTextArea solusiTextArea;
    // End of variables declaration//GEN-END:variables
}
