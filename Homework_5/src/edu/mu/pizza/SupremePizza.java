package edu.mu.pizza;

import java.util.ArrayList;

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
	
	public SupremePizza(double priceWithoutToppings, double totalPrice, int pizzaOrderID, ICookingStrategy cookingStrategy, double cookingPrice) {
		super(priceWithoutToppings, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
		this.toppingsList.add(Toppings.TOMATO);
		this.toppingsList.add(Toppings.CHEESE);
		this.toppingsList.add(Toppings.BELL_PEPPER);
		this.toppingsList.add(Toppings.ITALIAN_SAUSAGE);
		this.toppingsList.add(Toppings.PEPPERONI);
		this.toppingsList.add(Toppings.BLACK_OLIVE);
		this.toppingsList.add(Toppings.MUSHROOM);
		this.priceWithoutToppings = 3.50;

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
