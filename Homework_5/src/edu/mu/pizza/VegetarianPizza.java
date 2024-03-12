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

	public VegetarianPizza(double priceWithoutToppings, double totalPrice, int pizzaOrderID) {
		super(priceWithoutToppings, totalPrice, pizzaOrderID);
		this.toppingsList.add(Toppings.TOMATO);
		this.toppingsList.add(Toppings.CHEESE);
		this.toppingsList.add(Toppings.BELL_PEPPER);
		this.toppingsList.add(Toppings.BLACK_OLIVE);
		this.toppingsList.add(Toppings.MUSHROOM);
		this.priceWithoutToppings = 1.50;
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
