package Decorateur.Pizza;

import Decorateur.Repas.IIngredient;

// Implements the Pizza interface with only the required
// methods from the interface

// Every Pizza made will start as a PlainPizza

public class PlainPizza implements IIngredient {
 
	public String getDescription() {
		
		return "Thin dough";
	
	}

	public Double getCost() {

		System.out.println("Cost of Dough: " + 4.00);
		
		return 4.00;
	
	}
 
}