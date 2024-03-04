package edu.mu.cookingStrategy;

import edu.mu.pizza.AbstractPizza;

public class MicrowaveCookingStrategy implements ICookingStrategy{

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
