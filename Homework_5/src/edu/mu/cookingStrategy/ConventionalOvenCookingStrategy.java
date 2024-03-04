package edu.mu.cookingStrategy;

import edu.mu.pizza.AbstractPizza;

public class ConventionalOvenCookingStrategy implements ICookingStrategy{

	@Override
	public boolean cook(AbstractPizza pizza) {
		if(pizza == null) {
			return false;
		}
		pizza.setCookingStrategy(this);
		pizza.setCookingPrice(8.00);
		pizza.setTotalPrice(pizza.getTotalPrice() + pizza.getCookingPrice());
		return true;
	}
}
