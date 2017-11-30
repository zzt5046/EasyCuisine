/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycuisine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Zach
 */
public class Database {
    
    static Connection conn = null;
    static Statement statement = null;
    static ResultSet results = null;
    
    public Database(){
        System.out.println("--DatabaseQuery instantiated");
    }
    
    static ResultSet query(String sql){
        
        try{ 
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/EasyCuisineDB");
            statement = conn.createStatement();
            results = statement.executeQuery(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("**Query failed: " + sql);
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
        
        return results;
    }
    
    static void insert(String sql){
        
        int x = 0;
        
        try{ 
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/EasyCuisineDB");
            statement = conn.createStatement();
            x = statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registration Successful");
        }
        catch(SQLException e){
            System.out.println("**Registration Failed");
            JOptionPane.showMessageDialog(null, "Registration Failed");
            e.printStackTrace();
        }
    }
}
