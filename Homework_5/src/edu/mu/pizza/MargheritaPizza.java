package edu.mu.pizza;

import edu.mu.cookingStrategy.ICookingStrategy;

public class MargheritaPizza extends AbstractPizza{
	
	public MargheritaPizza() {
		super();
	}

	public MargheritaPizza(MargheritaPizza abstractPizza) {
		super(abstractPizza);
	}
	
	public MargheritaPizza(double priceWithoutToppings, double totalPrice, int pizzaOrderID,
			ICookingStrategy cookingStrategy, double cookingPrice) {
		super(priceWithoutToppings, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
	}

	@Override
	protected double addRoppingsToPrice(double priceWithoutToppings) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double updatePizzaPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
