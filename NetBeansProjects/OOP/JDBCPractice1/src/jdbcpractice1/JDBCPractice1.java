/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcpractice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author s540549
 */
public class JDBCPractice1 {

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
        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Succesful");
        
        dbStatement = conn.createStatement();
        String query = ("select ISBN, AuthFirstName, AuthLastName, Title from tblBooks");
        //PreparedStatement pstmt = conn.prepareStatement(query);
        
        
        dbResultSet = dbStatement.executeQuery(query);
        
         
    }
    
}
