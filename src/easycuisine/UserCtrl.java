/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycuisine;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Zach
 */
public class UserCtrl {
    
    User currentUser;
    ResultSet results;
    
    public UserCtrl(){
        System.out.println("--UserCtrl instantiated");  
    }
    
    public UserCtrl(User user){
        
        currentUser = user;
        System.out.println("--UserCtrl instantiated");
    }
    
    void setUsername(String name){
        currentUser.setUsername(name);
    }
    
    void setPassword(String pass){
        currentUser.setPassword(pass);
    }
    
    boolean authenticate(String username, String password) throws SQLException{
        
        boolean authenticated = false;
        String dbUser = "";
        String dbPass = "";
        
        try{
        results = Database.query("SELECT * FROM APP.USERS WHERE Username='" + username + "'" );
        
        while(results.next()){
                
            dbUser = results.getString(1);
            dbPass = results.getString(2);
                
            System.out.println(username + " - " + password);
            }
        }
        catch(SQLException e){
               e.printStackTrace();
        }
        
        if(username.equals(dbUser) && password.equals(dbPass)){
            authenticated = true;
        }
        
        return authenticated;
    }
}
