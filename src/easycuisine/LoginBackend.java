/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycuisine;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Zach
 */

public class LoginBackend {
    
    UserCtrl ctrl;
    
    public LoginBackend(){
        System.out.println("--LoginBackend Instantiated");
    }
    
    void authenticateUser(String username, String password) throws SQLException{
        
        ctrl = new UserCtrl();
        
        try{
            if(ctrl.authenticate(username, password)){
                System.out.println("User '" + username + "' authenticated.");
                JOptionPane.showMessageDialog(null, "Valid Login");
            }
            else{
                System.out.println("**Invalid Login");
                JOptionPane.showMessageDialog(null, "Authentication failed.");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }  
    }
}
