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
    
    Connection conn = null;
    Statement statement = null;
    ResultSet results = null;
    
    public Database(){
        
        try{
           
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/EasyCuisineDB", "username", "password");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
