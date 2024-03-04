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
	protected double addToppingsToPrice(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
		int totalToppingPrice = 0;
		
		for(Toppings topping: this.toppingsList) {
			totalToppingPrice += topping.getPrice();
		}
		
		this.totalPrice = totalToppingPrice + this.priceWithoutToppings;
		return this.totalPrice;
	}

	@Override
	public double updatePizzaPrice() {
		addToppingsToPrice(this.priceWithoutToppings);
		return this.totalPrice;
	}
	
}
