/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jeram Kraskens
 */
public class DatabaseConnection {
        
     private static  String DB_URL = "jdbc:mysql://localhost:3306/Library";
    private static String DB_USERNAME = "root";
    private static  String DB_PASSWORD = "";
    private static Connection conn = null;
    


public static Connection getConnection(){

        try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
                
    }catch(Exception ee){
        System.err.println("Error"+ee.toString());
    }
        return conn;
}

}

