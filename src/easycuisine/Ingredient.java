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
public class Ingredient {
    
	String name;
	int category;

    public Ingredient(){

    	System.out.println("--Ingredient instantiated");
    }

    public Ingredient(String name, int category){

    	this.name = name;
    	this.category = category;
    	System.out.println("--New Ingredient created");
    }

    void setName(String name){
    	this.name = name;
    }

    void setCategory(int category){
    	this.category = category;
    	//1 - Protein, 2 - Vegetable, 3 - Fruit, 4 - Dairy, 5 - Seasoning, 6 - Basic
    	/*
    	- Proteins include meat, fish, poultry, etc...
    	- Vegetables, Fruits, and Dairy are self explanatory
    	- Seasonings include salt, pepper, and assorted spices
    	- Basic includes staples such as flour, cornmeal, sugar, etc..
    	*/
    }

    String getName(){
    	return name;
    }

    int getCategoryVal(){
    	return category;
    }

    String getCategoryString(int num){

    	String categoryString = "";

    	switch(num){
    		case 1:
    			categoryString = "Protein";
    			break;
    		case 2:
    			categoryString = "Vegetable";
    			break;
    		case 3:
    			categoryString = "Fruit";
    			break;
    		case 4:
    			categoryString = "Dairy";
    			break;
    		case 5:
    			categoryString = "Seasoning";
    			break;
    		case 6:
    			categoryString = "Basic";
    			break;
    	}

    	return categoryString;
    }
}
