package edu.mu.pizza;

import edu.mu.cookingStrategy.ICookingStrategy;

public class HawaiianPizza extends AbstractPizza{

	public HawaiianPizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HawaiianPizza(HawaiianPizza abstractPizza) {
		super(abstractPizza);
		// TODO Auto-generated constructor stub
	}
	
	public HawaiianPizza(double priceWithoutToppings, double totalPrice, int pizzaOrderID) {
		super(priceWithoutToppings, totalPrice, pizzaOrderID);
		this.toppingsList.add(Toppings.CANADIAN_BACON);
		this.toppingsList.add(Toppings.CHEESE);
		this.toppingsList.add(Toppings.PINEAPPLE);
		this.priceWithoutToppings = 3.00;
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
