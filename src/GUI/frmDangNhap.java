/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TuanTuti
 */
public class frmDangNhap extends javax.swing.JFrame {
    public String IdNguoiDung_;
    Connection con;

    /**
     * Creates new form frmDangKy
     */
    public frmDangNhap() {
        initComponents();
        getRootPane().setDefaultButton(btnDangNhap);
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
        jLabel1 = new javax.swing.JLabel();
        lblTenDangNhap = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        lblMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        btnDangKy = new javax.swing.JButton();
        lblTenDangNhap1 = new javax.swing.JLabel();
        vaitroCb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaption);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Login-icon.png"))); // NOI18N
        jLabel1.setText("LOGIN");

        lblTenDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Users-icon.png"))); // NOI18N
        lblTenDangNhap.setText("Tên Đăng Nhập");

        lblMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Apps-preferences-desktop-user-password-icon.png"))); // NOI18N
        lblMatKhau.setText("Mật Khẩu");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Ironman-icon.png"))); // NOI18N

        btnDangNhap.setBackground(new java.awt.Color(255, 153, 0));
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/secrecy-icon.png"))); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseEntered(evt);
            }
        });
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnDangKy.setBackground(new java.awt.Color(255, 153, 0));
        btnDangKy.setForeground(new java.awt.Color(255, 255, 255));
        btnDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/user-male-edit-icon.png"))); // NOI18N
        btnDangKy.setText("Đăng Ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        lblTenDangNhap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/nhanvien.png"))); // NOI18N
        lblTenDangNhap1.setText("Chức vụ");

        vaitroCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinh viên", "Giáo viên", "Quản lý" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lblMatKhau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblTenDangNhap)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblTenDangNhap1)
                                        .addGap(57, 57, 57)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vaitroCb, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenDangNhap1)
                    .addComponent(vaitroCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenDangNhap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhau)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangKy)
                    .addComponent(btnDangNhap))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        // TODO add your handling code here:
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(frmDangNhap.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        frmDangKy frmDK = new frmDangKy();
//        frmDK.show();
//        this.dispose();
        
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        //-------------------------------------------------------------------------------
        String vaitro = (String) vaitroCb.getSelectedItem();
        String tenDangNhap = txtTenDangNhap.getText().trim();
        String matKhau = String.valueOf(txtMatKhau.getPassword()).trim();
        String cauTruyVan = "";
        // Truyền IdNguoi dùng
        IdNguoiDung_ = tenDangNhap;
        
        if(vaitro == "Giáo viên"){
            con = (Connection) Db.DBConnection.ConnetionDB();
            
            try{
                Statement stmt = (Statement) con.createStatement();
                cauTruyVan = "select * from gv";
                ResultSet rs = stmt.executeQuery(cauTruyVan);
                if(rs.next()){
                    String tdnhapData = rs.getString("magv");
                    String mkhauData = rs.getString("mk");

                    System.out.println("Ma giao vien: " + tdnhapData);
                    System.out.println("MK giao vien: " + mkhauData);

                    
                    if (tenDangNhap.equals(tdnhapData) && matKhau.equals(mkhauData)) {
                        Main.thongBao("Đăng Nhập Thành Công", "Thông Báo", 1);
                        frmGiaoVien frmGiaoVien = new frmGiaoVien(IdNguoiDung_);
                        frmGiaoVien.show();
                        this.dispose(); 
                    }
                    else {
                        GUI.Main.thongBao("Đăng nhập không thành công", "Thông Báo", 1);
                    }
                }
                con.close();
                stmt.close();
            }
            catch (Exception e) {
                System.out.println("Lỗi Đăng Nhập");
            }
        }
        else if(vaitro == "Sinh viên"){
            con = (Connection) Db.DBConnection.ConnetionDB();
            
            try{
                Statement stmt = (Statement) con.createStatement();
                cauTruyVan = "select * from sv";
                ResultSet rs = stmt.executeQuery(cauTruyVan);
                if(rs.next()){
                    String tdnhapData = rs.getString("masv");
                    String mkhauData = rs.getString("mk");
                    System.out.println("Ma giao vien: " + tdnhapData);
                    if (tenDangNhap.equals(tdnhapData) && matKhau.equals(mkhauData)) {
                        Main.thongBao("Đăng Nhập Thành Công", "Thông Báo", 1);
                        frmSinhVien frmSinhVien = new frmSinhVien(IdNguoiDung_);
                        frmSinhVien.show();
                        this.dispose(); 
                    }
                    else {
                        GUI.Main.thongBao("Đăng nhập không thành công", "Thông Báo", 1);
                    }
                }
                con.close();
                stmt.close();
            }
            catch (Exception e) {
                System.out.println("Lỗi Đăng Nhập");
            }
        }
        else if(vaitro == "Quản lý" ){
            //vaitro == "Quản lý" && tenDangNhap == "abc" && matKhau == "123"
            Main.thongBao("Đăng Nhập Thành Công", "Thông Báo", 1);
            frmQuanLy frmQuanLy = new frmQuanLy();
            frmQuanLy.show();
            this.dispose(); 
        }
        else if("".equals(txtTenDangNhap.getText())){           
            Main.thongBao("Tên đăng nhập không được bỏ trống", "Thông Báo", 1);
            txtTenDangNhap.requestFocus();
        }
        else if("".equals(txtMatKhau.getText())){
            Main.thongBao("Mật khẩu không được bỏ trống", "Thông Báo", 1);
            txtMatKhau.requestFocus();
        }
        else{
            Main.thongBao("Bạn nhập sai tài khoản hoặc mật khẩu", "Thông Báo", 1);
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed
    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        confirm();
    }//GEN-LAST:event_formWindowClosing

    private void btnDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangNhapMouseEntered
    public void confirm(){
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        int kQ = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn thoát chương trình không ?","Confirm",JOptionPane.YES_NO_OPTION);
        if(kQ == 0){
            System.exit(0);
        }
        else{
        }
    }
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
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTenDangNhap;
    private javax.swing.JLabel lblTenDangNhap1;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    private javax.swing.JComboBox<String> vaitroCb;
    // End of variables declaration//GEN-END:variables
}
