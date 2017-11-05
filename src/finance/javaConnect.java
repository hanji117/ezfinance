/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finance;

/**
 *
 * @author edgarcruz
 */

import java.sql.*;
import javax.swing.*; //have to import these two files

public class javaConnect {
    Connection conn= null;
   public static Connection ConnecrDb(){
       
       try{
       Class.forName("org.sqlite.JDBC");
       Connection conn =DriverManager.getConnection("jdbc:sqlite:/Users/edgarcruz/finance.sqlite");
       //JOptionPane.showMessageDialog(null, "Connection Established");
       return conn;
       }catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        return null;
       }             
   
   }
    
}
