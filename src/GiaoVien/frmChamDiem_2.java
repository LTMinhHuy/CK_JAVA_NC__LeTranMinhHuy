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
public class frmChamDiem_2 extends javax.swing.JFrame {
    Connection con, con1;
    private String id_sv_23, malhp_23, maki_23, hotenSV_23, masv_23;
    /**
     * Creates new form frmLoaiSanPham
     */
    public frmChamDiem_2(String idSv, String malhp_nhan_23, String maki_nhan_23) {
        initComponents();
        this.id_sv_23 = idSv;
        this.malhp_23 = malhp_nhan_23;
        this.maki_23 = maki_nhan_23;
    }

    private frmChamDiem_2() {
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
        lblMoTa = new javax.swing.JLabel();
        btnTimkiem = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        lblTTLSP1 = new javax.swing.JLabel();
        diemSVEd = new javax.swing.JTextField();
        tensvlb = new javax.swing.JLabel();
        masvLb = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTTLSP = new javax.swing.JLabel();
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
        lblMaLoaiSP.setText("Điểm");

        lblTenLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenLoai.setForeground(new java.awt.Color(0, 153, 0));
        lblTenLoai.setText("Tên SV");

        lblMoTa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMoTa.setForeground(new java.awt.Color(102, 102, 0));
        lblMoTa.setText("MSV");

        btnTimkiem.setForeground(new java.awt.Color(0, 0, 204));
        btnTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/pencil-red-icon.png"))); // NOI18N
        btnTimkiem.setText("Cập nhập");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        btnQuayLai.setForeground(new java.awt.Color(255, 0, 0));
        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back.png"))); // NOI18N
        btnQuayLai.setText("Quay Lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        lblTTLSP1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTTLSP1.setForeground(new java.awt.Color(0, 0, 204));
        lblTTLSP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/renew.png"))); // NOI18N
        lblTTLSP1.setText("CHẤM ĐIỂM");

        diemSVEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diemSVEdActionPerformed(evt);
            }
        });

        tensvlb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tensvlb.setForeground(new java.awt.Color(0, 153, 0));
        tensvlb.setText("tên SV");

        masvLb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        masvLb.setForeground(new java.awt.Color(102, 102, 102));
        masvLb.setText("MSV");

        javax.swing.GroupLayout pnlformLayout = new javax.swing.GroupLayout(pnlform);
        pnlform.setLayout(pnlformLayout);
        pnlformLayout.setHorizontalGroup(
            pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlformLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMoTa)
                    .addComponent(lblMaLoaiSP)
                    .addComponent(lblTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(81, 81, 81)
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(masvLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tensvlb, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(diemSVEd, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlformLayout.setVerticalGroup(
            pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlformLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTTLSP1)
                .addGap(16, 16, 16)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMoTa)
                    .addComponent(masvLb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenLoai)
                    .addComponent(tensvlb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaLoaiSP)
                    .addComponent(diemSVEd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        lblTTLSP.setText("DANH SÁCH SINH VIÊN");

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
                "STT", "Mã sinh viên", "Mã LHP", "Mã TC", "Điểm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
                        .addComponent(jScrollPane1)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTTLSP)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

    
    
    // ===================== HÀM TÌM KIẾM DỮ LIỆU THEO ĐẦU VÀO ========================
    // ================================================================================
    // ================================================================================

    private void LayDuLieu(String maki_23, String malhp_23){
        
        con = (Connection) Db.DBConnection.ConnetionDB();
        
        try {
            Statement stm = (Statement) con.createStatement();
            
            String cauTruyVan = "select diemdk.masv, lhp.malhp, lhp.matc, diemdk.diem "
                              + "from lhp, diemdk "
                              + "where magv = " + id_sv_23 
                              + " and lhp.maki = " + maki_23 
                              + " and diemdk.malhp = " + malhp_23;
                              //+ " and lhp.matc " + matc_23 
                              //+ " and lhp.tenlhp " + tenlhp_23;
            System.out.println("CauTruyVan: " + cauTruyVan);
            ResultSet rs = stm.executeQuery(cauTruyVan);
            
            Object [] obj = new Object[] {"STT","Mã sinh viên", "Mã LHP", "Mã tín chỉ", "Điểm"};
            DefaultTableModel tableModel = new DefaultTableModel(obj,0);
            tbBangDiem.setModel(tableModel);
            
            while (rs.next()) {
                Object[] item = new Object[5];
                item[0] = tbBangDiem.getRowCount() + 1;
                item[1] = rs.getString("masv");
                item[2] = rs.getString("malhp");
                item[3] = rs.getString("matc");
                item[4] = rs.getInt("diem");
                tableModel.addRow(item);
            }
            
            rs.close();
            stm.close();
            
        } catch (SQLException ex) {
            GUI.Main.thongBao("Không tìm thấy dữ liệu phù hợp !!!", "Thông Báo", 1);
        }
    }
    
    // ===================== LẤY HỌ TÊN SINH VIÊN ========================
    // ================================================================================
    // ================================================================================
    public void laytenSinhVien (String maSv) {
        con = (Connection) Db.DBConnection.ConnetionDB();
        
        try {
            Statement stm = (Statement) con.createStatement();
            
            String cauTruyVan = "select hoten "
                              + "from sv "
                              + "where masv = " + maSv;
                              
            
            System.out.println("CauTruyVan: " + cauTruyVan);
            
            ResultSet rs = stm.executeQuery(cauTruyVan);
            
            while (rs.next()) {
                hotenSV_23 = rs.getString("hoten");
                System.out.println("=== HỌ TÊN SV === " + hotenSV_23);
            }
            
            rs.close();
            stm.close();
            
        } catch (SQLException ex) {
            GUI.Main.thongBao("Không tìm thấy dữ liệu phù hợp !!!", "Thông Báo", 1);
        }
    }
    
    // =========================== CẬP NHẬP ĐIỂM =====================================
    // ================================================================================
    // ================================================================================
    public boolean capNhapDIEM (String maSV, int diem) {
        try {
            String SQL = "update diemdk set diem = " + diem + " where masv = " + maSV + " and malhp = " + malhp_23;
            
            System.out.println("Câu lệnh cập nhập điểm: " + SQL);
            
            con = (Connection) Db.DBConnection.ConnetionDB();
            Db.DBConnection.ExcuteQueryUpdateDB(con, SQL);
            GUI.Main.thongBao("Cập nhập điểm thành công !!!", "Thông Báo", 1);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LayDuLieu(maki_23, malhp_23);
    }//GEN-LAST:event_formWindowOpened

    private void tbBangDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBangDiemMouseClicked
        // TODO add your handling code here:
        System.out.println("Đã click vào bảng");
        
        // MỞ KHÁO BUTTON XEM CHI TIẾT LỚP HỌC
        
        JTable source_23 = (JTable)evt.getSource();
        int row_23 = source_23.rowAtPoint( evt.getPoint() );

        
        masv_23 = source_23.getModel().getValueAt(row_23, 1).toString();
        String diemSV_23 = source_23.getModel().getValueAt(row_23, 4).toString();
        
        // lấy tên sinh viên và gán vào biến hotenSV_23
        laytenSinhVien(masv_23);

        
        System.out.println("=== MÃ SINH VIÊN === " + masv_23);
        
        
        
        // ĐỔ DỮ LIỆU RA BẢNG THÔNG TIN
        masvLb.setText(masv_23); // lấy từ dòng 371
        tensvlb.setText(hotenSV_23); // lấy từ biến họ tên chung
        diemSVEd.setText(diemSV_23);
    }//GEN-LAST:event_tbBangDiemMouseClicked

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmChamDiem frmChamDiem = new frmChamDiem(id_sv_23);
        frmChamDiem.show();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // lấy điểm từ editText
        int diem = Integer.parseInt(diemSVEd.getText());
        // CẬP NHẬP ĐIỂM
        capNhapDIEM(masv_23, diem);
        
        // LOAD LẠI DỮ LIỆU
        LayDuLieu(maki_23, malhp_23);
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void diemSVEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diemSVEdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diemSVEdActionPerformed

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
            java.util.logging.Logger.getLogger(frmChamDiem_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmChamDiem_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmChamDiem_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmChamDiem_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            new frmChamDiem_2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField diemSVEd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaLoaiSP;
    private javax.swing.JLabel lblMoTa;
    private javax.swing.JLabel lblTTLSP;
    private javax.swing.JLabel lblTTLSP1;
    private javax.swing.JLabel lblTenLoai;
    private javax.swing.JLabel masvLb;
    private javax.swing.JPanel pnlform;
    private javax.swing.JTable tbBangDiem;
    private javax.swing.JLabel tensvlb;
    // End of variables declaration//GEN-END:variables
}