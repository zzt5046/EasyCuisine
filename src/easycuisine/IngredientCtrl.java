/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycuisine;

import java.util.ArrayList;

/**
 *
 * @author Zach
 */
public class IngredientCtrl {
    
	Ingredient ing;

    public IngredientCtrl(Ingredient ing){
    	this.ing = ing;
    	System.out.println("--IngredientCtrl instantiated");
    }

    void setName(String name){
    	ing.setName(name);
    }

    void setCategory(int category){
    	ing.setCategory(category);
    }

    ArrayList<Ingredient> getAllIngredients(User user){

    	ArrayList<Ingredient> ingredients = new ArrayList<>();
        //retrieve data
    	return ingredients;
    }
}
