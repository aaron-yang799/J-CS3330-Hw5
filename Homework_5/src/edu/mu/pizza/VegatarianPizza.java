package edu.mu.pizza;

import edu.mu.cookingStrategy.ICookingStrategy;

public class VegatarianPizza extends AbstractPizza{

	public VegatarianPizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VegatarianPizza(AbstractPizza abstractPizza) {
		super(abstractPizza);
		// TODO Auto-generated constructor stub
	}

	public VegatarianPizza(double priceWithoutToppings, double totalPrice, int pizzaOrderID,
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
