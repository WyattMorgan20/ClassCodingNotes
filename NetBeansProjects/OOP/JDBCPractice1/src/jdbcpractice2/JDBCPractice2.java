/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcpractice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author s540549
 */
public class JDBCPractice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521/orclpdb";
        String username = "sys as sysdba";
        String password = "Oracle_1";
        Statement dbStatement = null;
        ResultSet dbResultSet = null;
        Connection conn = null;
        PreparedStatement updateZipCode = null;
        
        try{
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Success");
            dbStatement = conn.createStatement();
            
        }
        catch(SQLException e){
            System.out.println("Connection Failure");
        }
        
        try{
            String query = "Update zip from tblStudent where (zip, city) VALUES(?, ?)";
            dbResultSet = dbStatement.executeQuery(query);
            System.out.println(dbResultSet);
            updateZipCode = conn.prepareStatement(query);
        }
        catch(SQLException e){
            System.out.println("Prepared Statement Failed to Run");
        }
             
        
         
    }
    
}
