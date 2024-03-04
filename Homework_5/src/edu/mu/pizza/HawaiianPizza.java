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
	
	public HawaiianPizza(double priceWithoutToppings, double totalPrice, int pizzaOrderID,
			ICookingStrategy cookingStrategy, double cookingPrice) {
		super(priceWithoutToppings, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
		this.toppingsList.add(Toppings.CANADIAN_BACON);
		this.toppingsList.add(Toppings.CHEESE);
		this.toppingsList.add(Toppings.PINEAPPLE);
		this.priceWithoutToppings = 3.00;
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
