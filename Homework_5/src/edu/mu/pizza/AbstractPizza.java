package edu.mu.pizza;

import java.util.ArrayList;
import java.util.List;

import edu.mu.cookingStrategy.ICookingStrategy;

public abstract class AbstractPizza {
	protected List<Toppings> toppingsList;
	protected double priceWithoutToppings;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected ICookingStrategy cookingStrategy;
	protected double cookingPrice;
	
	protected static int orderIDCounter;

	public AbstractPizza() {
	}

	public AbstractPizza(ArrayList<Toppings> toppings, double priceWithoutToppings, double totalPrice, int pizzaOrderID,
			ICookingStrategy cookingStrategy, double cookingPrice) {
		this.toppingsList = toppings;
		this.priceWithoutToppings = priceWithoutToppings;
		this.totalPrice = totalPrice;
		this.pizzaOrderID = pizzaOrderID;
		this.cookingStrategy = cookingStrategy;
		this.cookingPrice = cookingPrice;
	}

	
	public AbstractPizza(AbstractPizza abstractPizza) {
		this.toppingsList = new ArrayList<Toppings>(abstractPizza.toppingsList);
		this.priceWithoutToppings = abstractPizza.priceWithoutToppings;
		this.totalPrice = abstractPizza.totalPrice;
		this.pizzaOrderID = abstractPizza.pizzaOrderID;
		this.cookingStrategy = abstractPizza.cookingStrategy;
		this.cookingPrice = abstractPizza.cookingPrice;
	}
	
	protected abstract double addRoppingsToPrice(double priceWithoutToppings);
	
	public abstract double updatePizzaPrice();
	
	
	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}

	public void setPriceWithoutToppings(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public int getPizzaOrderID() {
		return pizzaOrderID;
	}


	public void setPizzaOrderID(int pizzaOrderID) {
		this.pizzaOrderID = pizzaOrderID;
	}


	public static int getOrderIDCounter() {
		return orderIDCounter;
	}


	public static void setOrderIDCounter(int orderIDCounter) {
		AbstractPizza.orderIDCounter = orderIDCounter;
	}


	public ICookingStrategy getCookingStrategy() {
		return cookingStrategy;
	}


	public void setCookingStrategy(ICookingStrategy cookingStrategy) {
		this.cookingStrategy = cookingStrategy;
	}


	public double getCookingPrice() {
		return cookingPrice;
	}


	public void setCookingPrice(double cookingPrice) {
		this.cookingPrice = cookingPrice;
	}


	public List<Toppings> getToppingsList() {
		return toppingsList;
	}
	
	public void setToppingsList(List<Toppings> toppingsList) {
		this.toppingsList = toppingsList;
	}
	
	
}
