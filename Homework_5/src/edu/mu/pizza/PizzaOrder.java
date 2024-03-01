package edu.mu.pizza;

import java.util.ArrayList;
import java.util.List;

import edu.mu.cookingStrategy.ICookingStrategy;

public class PizzaOrder {
	
	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy;
	private List<AbstractPizza> pizzaOrderList;
	
	/*
	 * PizzaOrder:
	 * Constructor
	 */
	public PizzaOrder(){
		this.pizzaFactory = new PizzaCookingFactory();
		this.pizzaOrderList = new ArrayList<AbstractPizza>();
	}
	
	/*
	 * printListOfToppingsByPizzaOrderID
	 * @param orderID
	 * uses for each loop to go through every pizza in the order list.
	 * Once the correct pizza order is found, 
	 */
	public void printListOfToppingsByPizzaOrderID(int orderID) {
		for(AbstractPizza pizza : pizzaOrderList) {
			if(pizza.getPizzaOrderID() == orderID) {
				System.out.println("Toppings:");
				pizza.toppingsList.stream().map(i -> "\t" + i + "\n").forEach(System.out::print);
			}
		}
	}
	
	
	
}
