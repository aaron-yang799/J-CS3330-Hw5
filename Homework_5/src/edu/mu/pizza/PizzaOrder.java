package edu.mu.pizza;

import java.util.ArrayList;
import java.util.List;

import edu.mu.cookingStrategy.ICookingStrategy;

public class PizzaOrder {
	
	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy;
	private List<AbstractPizza> pizzaOrderList;
	
	/**
	 * PizzaOrder:
	 * Constructor
	 */
	public PizzaOrder(){
		this.pizzaFactory = new PizzaCookingFactory();
		this.pizzaOrderList = new ArrayList<AbstractPizza>();
	}
	
	/**
	 * printListOfToppingsByPizzaOrderID
	 * @param orderID
	 * uses for each loop to go through every pizza in the order list.
	 * Once the correct pizza order is found, the list is turned into a stream, so it can then be mapped to a string of the desired format,
	 * then the forEach method is used to invoke the print method for all members of the newly mapped stream.
	 */
	public void printListOfToppingsByPizzaOrderID(int orderID) {
		for(AbstractPizza pizza : pizzaOrderList) {
			if(pizza.getPizzaOrderID() == orderID) {
				System.out.println("Toppings:");
				pizza.getToppingsList().stream().map(i -> "\t" + i + "\tPrice: $" + i.getPrice() + "\n").forEach(System.out::print);
			}
		}
	}
	
	/**
	 * printPizzaOrderCart
	 * @param orderID
	 * Prints all necessary information about pizzas with the given order ID
	 */
	public void printPizzaOrderCart(int orderID) {
		int count = 0;
		for(AbstractPizza pizza : pizzaOrderList) {
			if(pizza.getPizzaOrderID() == orderID) {
				++count;
				System.out.println("Pizza #" + count + "\n\tType: " + pizza.getClass().getSimpleName() + "\tPrice Without Toppings: $" + pizza.getPriceWithoutToppings() + "\n\tToppings:");
				for(Toppings topping : pizza.getToppingsList()) {
					System.out.println("\t\t" + topping + "\tPrice: $" + topping.getPrice());
				}
				System.out.println("\tTotal Cost: " + pizza.getTotalPrice() + "\n");
			}
		}
	}
	/**
	 * Adds pizza to cart if it is returned as not null by the pizza factory.
	 * @param pizzaType
	 * @return boolean
	 */
	
	
	public boolean addPizzaToCart(PizzaType pizzaType) {
		AbstractPizza pizza = pizzaFactory.createPizza(pizzaType);
		if(pizza == null) {
			return false;
		}
		pizzaOrderList.add(pizza);
		return true;
	}
	
	public AbstractPizza getPizzaByOrderID(int orderID) {
		for(AbstractPizza pizza: pizzaOrderList) {
			if(pizza.getPizzaOrderID() == orderID) {
				return pizza;
			}
		}
		return null;
	}
	
	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		if(pizza == null) {
			System.out.println("Pizza with ID" + orderID + "not found");
			return false;
		}
		
		for(int i = 0; i < pizza.toppingsList.size(); i++) {
			if(pizza.toppingsList.get(i) == topping) {
				System.out.println("The pizza already has " + topping);
				return false;
			}
		}
		pizza.toppingsList.add(topping);
		return true;
	}

	public boolean RemoveToppingFromPizza(int orderID, Toppings topping) {
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		if(pizza == null) {
			System.out.println("Pizza with ID" + orderID + "not found");
			return false;
		}
		
		for(int i = 0; i < pizza.toppingsList.size(); i++) {
			if(pizza.toppingsList.get(i) == topping) {
				pizza.toppingsList.remove(i);
				return true;
			}
		}
		return false;
	
	}
	
}
