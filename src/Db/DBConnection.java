/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Db;

/**
 *
 * @author Muhammad Fakhar
 */

import Obj.Book;
import Obj.Borrower;
import Obj.Library;
import Obj.Loan;
import Obj.Members;
import Obj.Person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class DBConnection
{
    Connection con;
    Statement stmt;
    
    /* =======================================
      DBConnection
     ======================================== */
    public static Connection ConnetionDB(){
       try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qlmonhoc","root","");
            if (conn!=null)
                System.out.println("Ket noi thanh cong");
            else 
                System.out.println("Loi khi ket noi");

           return conn;     
       }catch(Exception e) {
            System.out.println("--> SQLException : " + e) ;
            return null;
       }}
    
    
    /* =======================================
      closeConnection
     ======================================== */
    public static void closeConnection(Connection con)
    {
        try
        {
//            stmt.close();
            con.close();
        }
         catch(Exception e)
        {
            System.out.println(e);
        }      
    }
    
    
    /* =======================================
      ExcuteQueryGetTable
     ======================================== */
    public static ResultSet ExcuteQueryGetTable(Connection con, String cauTruyVanSQL){
        try {
            Statement stmt = con.createStatement();           
            ResultSet rs = stmt.executeQuery(cauTruyVanSQL);
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
            
        return null;
    }
    
    /* =======================================
      ExcuteQueryUpdateDB
     ======================================== */
    public static void ExcuteQueryUpdateDB(Connection con, String cauTruyVanSQL){
       
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(cauTruyVanSQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
}










