package edu.mu.pizza;

import edu.mu.cookingStrategy.ICookingStrategy;

public class SupremePizza extends AbstractPizza{

	public SupremePizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SupremePizza(SupremePizza abstractPizza) {
		super(abstractPizza);
		// TODO Auto-generated constructor stub
	}
	
	public SupremePizza(double priceWithoutToppings, double totalPrice, int pizzaOrderID,
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
