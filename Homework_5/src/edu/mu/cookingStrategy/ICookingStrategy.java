package edu.mu.cookingStrategy;

import edu.mu.pizza.AbstractPizza;

public interface ICookingStrategy {
	
	/**
	 * Sets the cooking price depending on the strategy for cooking.
	 * Adds this cooking price to the totalPrice.
	 * Also sets the cookingStrategy to the cooking strategy specified.
	 * @param pizza
	 */
	public boolean cook(AbstractPizza pizza);
	
}
