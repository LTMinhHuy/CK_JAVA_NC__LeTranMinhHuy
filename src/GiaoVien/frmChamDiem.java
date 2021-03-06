/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoVien;

import GUI.frmGiaoVien;
import SinhVien.*;
import GUI.frmSinhVien;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TuanTuti
 */
public class frmChamDiem extends javax.swing.JFrame {
    Connection con, con1;
    private String id_sv_23, maki_23, malhp_23;
    /**
     * Creates new form frmLoaiSanPham
     */
    public frmChamDiem(String idSv) {
        initComponents();
        this.id_sv_23 = idSv;
//        LayDuLieu("221");
    }

    private frmChamDiem() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlform = new javax.swing.JPanel();
        lblMaLoaiSP = new javax.swing.JLabel();
        lblTenLoai = new javax.swing.JLabel();
        tinchiTk = new javax.swing.JTextField();
        lblMoTa = new javax.swing.JLabel();
        lhptk = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        lblTimKiem = new javax.swing.JLabel();
        tenhpTk = new javax.swing.JTextField();
        btnQuayLai = new javax.swing.JButton();
        kiTk = new javax.swing.JComboBox<>();
        lblTTLSP1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTTLSP = new javax.swing.JLabel();
        btnXemChiTiet = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBangDiem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlform.setBackground(new java.awt.Color(204, 204, 204));
        pnlform.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlform.setForeground(new java.awt.Color(0, 255, 0));

        lblMaLoaiSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaLoaiSP.setForeground(new java.awt.Color(0, 102, 102));
        lblMaLoaiSP.setText("M?? LHP");

        lblTenLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenLoai.setForeground(new java.awt.Color(0, 153, 0));
        lblTenLoai.setText("M?? t??n ch???");

        tinchiTk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tinchiTk.setForeground(new java.awt.Color(0, 153, 0));
        tinchiTk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinchiTkActionPerformed(evt);
            }
        });

        lblMoTa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMoTa.setForeground(new java.awt.Color(102, 102, 0));
        lblMoTa.setText("K??");

        lhptk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lhptk.setForeground(new java.awt.Color(0, 102, 102));
        lhptk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lhptkActionPerformed(evt);
            }
        });

        btnTimkiem.setForeground(new java.awt.Color(0, 0, 204));
        btnTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/timkiem.png"))); // NOI18N
        btnTimkiem.setText("T??m ki???m");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        lblTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTimKiem.setForeground(new java.awt.Color(102, 102, 102));
        lblTimKiem.setText("T??n HP");

        tenhpTk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tenhpTk.setForeground(new java.awt.Color(102, 102, 102));
        tenhpTk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenhpTkActionPerformed(evt);
            }
        });
        tenhpTk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tenhpTkKeyReleased(evt);
            }
        });

        btnQuayLai.setForeground(new java.awt.Color(255, 0, 0));
        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back.png"))); // NOI18N
        btnQuayLai.setText("Quay L???i");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        kiTk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kiTk.setForeground(new java.awt.Color(153, 153, 0));
        kiTk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "221", "121" }));

        lblTTLSP1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTTLSP1.setForeground(new java.awt.Color(0, 0, 204));
        lblTTLSP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/search.png"))); // NOI18N
        lblTTLSP1.setText("TRA C???U");

        javax.swing.GroupLayout pnlformLayout = new javax.swing.GroupLayout(pnlform);
        pnlform.setLayout(pnlformLayout);
        pnlformLayout.setHorizontalGroup(
            pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlformLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMoTa)
                            .addComponent(lblMaLoaiSP))
                        .addGap(43, 43, 43)
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tinchiTk)
                            .addComponent(kiTk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tenhpTk)
                            .addComponent(lhptk, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addComponent(btnQuayLai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimkiem)))
                .addGap(39, 39, 39))
            .addGroup(pnlformLayout.createSequentialGroup()
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblTTLSP1))
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTimKiem))
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlformLayout.setVerticalGroup(
            pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlformLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTTLSP1)
                .addGap(21, 21, 21)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kiTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMoTa))
                .addGap(18, 18, 18)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lhptk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaLoaiSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenLoai)
                    .addComponent(tinchiTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenhpTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(129, 191, 141));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTTLSP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTTLSP.setForeground(new java.awt.Color(0, 0, 204));
        lblTTLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/date.png"))); // NOI18N
        lblTTLSP.setText("DANH S??CH L???P GI???NG D???Y");

        btnXemChiTiet.setForeground(new java.awt.Color(0, 0, 204));
        btnXemChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/renew.png"))); // NOI18N
        btnXemChiTiet.setText("Xem chi ti???t");
        btnXemChiTiet.setEnabled(false);
        btnXemChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietActionPerformed(evt);
            }
        });

        tbBangDiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbBangDiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbBangDiem.setForeground(new java.awt.Color(0, 0, 204));
        tbBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "M?? l???p h???c ph???n", "M?? t??n ch???", "T??n h???c ph???n", "K??"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBangDiem.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tbBangDiem.setSelectionForeground(new java.awt.Color(0, 0, 204));
        tbBangDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBangDiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBangDiem);
        if (tbBangDiem.getColumnModel().getColumnCount() > 0) {
            tbBangDiem.getColumnModel().getColumn(0).setMinWidth(20);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTTLSP)
                        .addContainerGap(359, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnXemChiTiet)))
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTTLSP)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnXemChiTiet)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlform, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String kiemtraDauvaoLoc (String dauvao_23) {
        if ("".equals(dauvao_23)) {
            dauvao_23 = "IS NOT NULL";
        }
        else {
            dauvao_23 = "like (N'%" + dauvao_23  + "%')";
        }
        return dauvao_23;
    }
    
    
    // ===================== H??M T??M KI???M D??? LI???U THEO ?????U V??O ========================
    // ================================================================================
    // ================================================================================

    private void LayDuLieu(String maki_23, String malhp_23, String matc_23, String tenlhp_23){
        // ====== Ki???m tra ?????u v??o =======
        
        // KI???M TRA M?? K??
        maki_23 = kiemtraDauvaoLoc(maki_23);
        malhp_23 = kiemtraDauvaoLoc(malhp_23);
        matc_23 = kiemtraDauvaoLoc(matc_23);
        tenlhp_23 = kiemtraDauvaoLoc(tenlhp_23);
        
        
        con = (Connection) Db.DBConnection.ConnetionDB();
        
        try {
            Statement stm = (Statement) con.createStatement();
            
            String cauTruyVan = "select lhp.malhp, lhp.matc, lhp.tenlhp, lhp.maki, lhp.tg "
                              + "from lhp "
                              + "where magv = " + id_sv_23 
                              + " and lhp.maki " + maki_23 
                              + " and lhp.malhp " + malhp_23
                              + " and lhp.matc " + matc_23 
                              + " and lhp.tenlhp " + tenlhp_23;
            System.out.println("CauTruyVan: " + cauTruyVan);
            ResultSet rs = stm.executeQuery(cauTruyVan);
            
            Object [] obj = new Object[] {"STT","M?? h???c ph???n", "M?? t??n ch???", "T??n h???c ph???n", "K??", "Th???i gian"};
            DefaultTableModel tableModel = new DefaultTableModel(obj,0);
            tbBangDiem.setModel(tableModel);
            
            while (rs.next()) {
                Object[] item = new Object[6];
                item[0] = tbBangDiem.getRowCount() + 1;
                item[1] = rs.getString("malhp");
                item[2] = rs.getString("matc");
                item[3] = rs.getString("tenlhp");
                item[4] = rs.getString("maki");
                item[5] = rs.getString("tg");
                tableModel.addRow(item);
            }
            
            rs.close();
            stm.close();
            
        } catch (SQLException ex) {
            //tbBangDiem.removeAll();
            tinchiTk.setText("");
            lhptk.setText("");
            tenhpTk.setText("");
            
            GUI.Main.thongBao("Kh??ng t??m th???y d??? li???u ph?? h???p !!!", "Th??ng B??o", 1);
        }
    }
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LayDuLieu("", "", "", "");
    }//GEN-LAST:event_formWindowOpened

    private void tbBangDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBangDiemMouseClicked
        // TODO add your handling code here:
        System.out.println("???? click v??o b???ng");
        
        // M??? KH??O BUTTON XEM CHI TI???T L???P H???C
        btnXemChiTiet.setEnabled(true);
        
        JTable source_23 = (JTable)evt.getSource();
        int row_23 = source_23.rowAtPoint( evt.getPoint() );

       
        malhp_23 = source_23.getModel().getValueAt(row_23, 1).toString();
        maki_23 = source_23.getModel().getValueAt(row_23, 4).toString();
        
        System.out.println("=== Ma LHP === " + malhp_23 + " === Ma k?? === " + maki_23);
        
        
    }//GEN-LAST:event_tbBangDiemMouseClicked

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmGiaoVien frmGiaoVien = new frmGiaoVien(id_sv_23);
        frmGiaoVien.show();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void tenhpTkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tenhpTkKeyReleased

    }//GEN-LAST:event_tenhpTkKeyReleased

    private void tenhpTkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenhpTkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenhpTkActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        String ki_23 = kiTk.getSelectedItem().toString();
        String maTinchi = tinchiTk.getText();
        String lopHp = lhptk.getText();
        String tenLhp = tenhpTk.getText();

        // G???I H??M T??M KI???M
        LayDuLieu(ki_23, lopHp, maTinchi, tenLhp);
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void lhptkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lhptkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lhptkActionPerformed

    private void tinchiTkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinchiTkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinchiTkActionPerformed

    private void btnXemChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmChamDiem_2 frmChamDiem_2 = new frmChamDiem_2(id_sv_23, malhp_23, maki_23);
        frmChamDiem_2.show();
    }//GEN-LAST:event_btnXemChiTietActionPerformed

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
            java.util.logging.Logger.getLogger(frmChamDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmChamDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmChamDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmChamDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmChamDiem().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXemChiTiet;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kiTk;
    private javax.swing.JLabel lblMaLoaiSP;
    private javax.swing.JLabel lblMoTa;
    private javax.swing.JLabel lblTTLSP;
    private javax.swing.JLabel lblTTLSP1;
    private javax.swing.JLabel lblTenLoai;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JTextField lhptk;
    private javax.swing.JPanel pnlform;
    private javax.swing.JTable tbBangDiem;
    private javax.swing.JTextField tenhpTk;
    private javax.swing.JTextField tinchiTk;
    // End of variables declaration//GEN-END:variables
}
