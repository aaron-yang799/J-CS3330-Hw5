package edu.mu.pizza;

import java.util.ArrayList;
import java.util.List;

import edu.mu.cookingStrategy.ICookingStrategy;

/**
 * 
 */
public abstract class AbstractPizza {
	protected List<Toppings> toppingsList;
	protected double priceWithoutToppings;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected ICookingStrategy cookingStrategy;
	protected double cookingPrice;
	
	protected static int orderIDCounter = 0;

	public AbstractPizza() {
	}
	
	/**
	 * Parameterized Constructor for AbstarctPizza
	 * @param priceWithoutToppings
	 * @param totalPrice
	 * @param pizzaOrderID
	 */
	public AbstractPizza(double priceWithoutToppings, double totalPrice, int pizzaOrderID) {
		this.toppingsList = new ArrayList<Toppings>();
		this.priceWithoutToppings = priceWithoutToppings;
		this.totalPrice = totalPrice;
		this.pizzaOrderID = pizzaOrderID;
		orderIDCounter++;
	}

	/**
	 * Copy constructor for AbstractPizza
	 * @param abstractPizza
	 */
	public AbstractPizza(AbstractPizza abstractPizza) {
		this.toppingsList = new ArrayList<Toppings>(abstractPizza.toppingsList);
		this.priceWithoutToppings = abstractPizza.priceWithoutToppings;
		this.totalPrice = abstractPizza.totalPrice;
		this.pizzaOrderID = abstractPizza.pizzaOrderID;
	}
	
//	Abstract method
	/**
	 * Calculates the total price of all toppings of the pizza, 
	 * then adds that to the total price and returns the total price.
	 * @param priceWithoutToppings
	 * @return totalPrice
	 */
	protected abstract double addToppingsToPrice(double priceWithoutToppings);
	
//	Abstract method 
	/**
	 * Updates the totalPrice based on the priceWithoutToppings and
	 * price of all toppings.
	 * @return totalPrice
	 */
	public abstract double updatePizzaPrice();
	
//	Getters and setters
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

//	toString
	@Override
	public String toString() {
		return "AbstractPizza [toppingsList=" + toppingsList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + ", getClass()=" + getClass() + "]";
	}
	
	
	
}
