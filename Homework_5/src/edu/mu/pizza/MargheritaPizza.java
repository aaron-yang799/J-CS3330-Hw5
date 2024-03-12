package edu.mu.pizza;

import edu.mu.cookingStrategy.ICookingStrategy;

public class MargheritaPizza extends AbstractPizza{
	
	public MargheritaPizza() {
		super();
	}

	public MargheritaPizza(MargheritaPizza abstractPizza) {
		super(abstractPizza);
	}
	
	public MargheritaPizza(double priceWithoutToppings, double totalPrice, int pizzaOrderID) {
		super(priceWithoutToppings, totalPrice, pizzaOrderID);
		this.toppingsList.add(Toppings.TOMATO);
		this.toppingsList.add(Toppings.CHEESE);
		this.priceWithoutToppings = 2.50;
		
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
