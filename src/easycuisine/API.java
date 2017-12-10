/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycuisine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Zach
 */
public class API {
    
    public String ingredientSearch(String item) throws MalformedURLException, IOException{
        
        String id = "008eced6";
        String key = "4a9b6eceb273921f4b9f94f665d47b05";
        String searchTerm = encodeConvert(item);
        URL address = new URL("https://api.edamam.com/api/food-database/parser?ingr=" + searchTerm + "&app_id=" + id + "&app_key=" + key + "&page=0");
    
        HttpURLConnection conn = (HttpURLConnection) address.openConnection();
        conn.setRequestMethod("GET");
        
        //add request header
        conn.setRequestProperty("User-Agent", "Mozilla/5.0");
        int responseCode = conn.getResponseCode();
         System.out.println("Response Code : " + responseCode);
     
         BufferedReader in = new BufferedReader(
            new InputStreamReader(conn.getInputStream()));
     
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            
        in.close();
        //print in String
        System.out.println(response.toString());
        return response.toString();
    }
    
    String encodeConvert(String word){
        return word.replaceAll(" ", "%20");
    }
}
