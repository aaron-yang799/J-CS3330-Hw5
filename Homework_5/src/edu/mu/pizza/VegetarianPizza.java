package edu.mu.pizza;

import edu.mu.cookingStrategy.ICookingStrategy;

public class VegetarianPizza extends AbstractPizza{

	public VegetarianPizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VegetarianPizza(VegetarianPizza abstractPizza) {
		super(abstractPizza);
		// TODO Auto-generated constructor stub
	}

	public VegetarianPizza(double priceWithoutToppings, double totalPrice, int pizzaOrderID,
			ICookingStrategy cookingStrategy, double cookingPrice) {
		super(priceWithoutToppings, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
		this.toppingsList.add(Toppings.TOMATO);
		this.toppingsList.add(Toppings.CHEESE);
		this.toppingsList.add(Toppings.BELL_PEPPER);
		this.toppingsList.add(Toppings.BLACK_OLIVE);
		this.toppingsList.add(Toppings.MUSHROOM);
		this.priceWithoutToppings = 1.50;
	}

	@Override
	protected double addToppingsToPrice(double priceWithoutToppings) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double updatePizzaPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
