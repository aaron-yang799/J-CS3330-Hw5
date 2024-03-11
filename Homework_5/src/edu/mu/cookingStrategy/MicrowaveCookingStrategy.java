package edu.mu.cookingStrategy;

import edu.mu.pizza.AbstractPizza;

public class MicrowaveCookingStrategy implements ICookingStrategy{

	/**
	 * Sets the cooking price depending on the strategy for cooking.
	 * Adds this cooking price to the totalPrice.
	 * Also sets the cookingStrategy to the cooking strategy specified.
	 * @param pizza
	 */
	@Override
	public boolean cook(AbstractPizza pizza) {
		if(pizza == null) {
			return false;
		}
		pizza.setCookingStrategy(this);
		pizza.setCookingPrice(1.00);
		pizza.setTotalPrice(pizza.getTotalPrice() + pizza.getCookingPrice());
		return true;
	}
}
