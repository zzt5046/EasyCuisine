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
public class DatabaseQuery {
    
    static Connection conn = null;
    Statement statement = null;
    ResultSet results = null;
    
    public DatabaseQuery(String sql){
        
        String username;
        String password;
        
        try{ 
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/EasyCuisineDB");
            statement = conn.createStatement();
            results = statement.executeQuery(sql);
            
            while(results.next()){
                
                username = results.getString(1);
                password = results.getString(2);
                
                System.out.println(username + " - " + password);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
