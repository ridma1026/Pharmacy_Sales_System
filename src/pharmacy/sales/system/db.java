/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy.sales.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    
    public static Connection mycon() {
        Connection con = null;
        
        try {
            // 1. Load the MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Connection details
            // URL: jdbc:mysql://localhost:3306/your_database_name
            // User: root
            // Password: (Empty by default in XAMPP)
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy_posdb", "root", "16534237");
            
            return con;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database Connection Failed: " + e.getMessage());
            return null;
        }
    }
}
