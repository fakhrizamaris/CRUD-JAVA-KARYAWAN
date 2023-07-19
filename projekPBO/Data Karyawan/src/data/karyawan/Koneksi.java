
package data.karyawan;

import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {
    
    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException {
        try{
            String url = "jdbc.mysql://localhost:4306/data_karyawan";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url , user,pass);
          
        }catch(SQLException e) {
            System.out.println("Koneksi ke Database Gagal " + e.getMessage());
        }
        
        return MySQLConfig;
    }
    
}
