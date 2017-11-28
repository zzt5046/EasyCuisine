/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycuisine;

/**
 *
 * @author Zach
 */
public class UserCtrl {
    
    User currentUser;
    
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
    
    boolean authenticate(String username, String password){
        
        boolean authenticated = false;
        
        if(username.equals(currentUser.getUsername()) && password.equals(currentUser.getPassword())){
            authenticated = true;
        }
        
        return authenticated;
    }
}
