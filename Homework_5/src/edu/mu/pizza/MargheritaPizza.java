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
		this.toppingsList.add(Toppings.TOMATO);
		this.toppingsList.add(Toppings.CHEESE);
		this.priceWithoutToppings = 2.50;
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
