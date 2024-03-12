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
	
	public SupremePizza(double priceWithoutToppings, double totalPrice, int pizzaOrderID) {
		super(priceWithoutToppings, totalPrice, pizzaOrderID);
		this.toppingsList.add(Toppings.TOMATO);
		this.toppingsList.add(Toppings.CHEESE);
		this.toppingsList.add(Toppings.BELL_PEPPER);
		this.toppingsList.add(Toppings.ITALIAN_SAUSAGE);
		this.toppingsList.add(Toppings.PEPPERONI);
		this.toppingsList.add(Toppings.BLACK_OLIVE);
		this.toppingsList.add(Toppings.MUSHROOM);
		this.priceWithoutToppings = 3.50;
		
	}

	/**
	 * Calculates the total price of all toppings of the pizza, 
	 * then adds that to the total price and returns the total price.
	 * @param priceWithoutToppings
	 * @return totalPrice
	 */
	@Override
	protected double addToppingsToPrice(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
		int totalToppingPrice = 0;
		
		for(Toppings topping: this.toppingsList) {
			totalToppingPrice += topping.getPrice();
		}
		
		this.totalPrice = totalToppingPrice + this.priceWithoutToppings;
		return this.totalPrice;
	}

	/**
	 * Updates the totalPrice based on the priceWithoutToppings and
	 * price of all toppings.
	 * @return totalPrice
	 */
	@Override
	public double updatePizzaPrice() {
		addToppingsToPrice(this.priceWithoutToppings);
		this.totalPrice += this.cookingPrice;
		return this.totalPrice;
	}
}
