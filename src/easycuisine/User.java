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
public class User {
    
    String username;
    String password;
    
    public User(){
        
        System.out.println("--Basic user instantiated");
    }
    
    public User(String username, String password){
        
        this.username = username;
        this.password = password;
        System.out.println("--New User created");
    }
    
    void setUsername(String name){
        username = name;
    }
    
    void setPassword(String pass){
        password = pass;
    }
    
    String getUsername(){
        return username;
    }
    
    String getPassword(){
        return password;
    }
}
