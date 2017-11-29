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
        }
        
        return results;
    }
}
