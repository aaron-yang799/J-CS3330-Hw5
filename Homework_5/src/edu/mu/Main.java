package edu.mu;

import edu.mu.pizza.CookingStyleType;
import edu.mu.pizza.PizzaOrder;
import edu.mu.pizza.PizzaType;
import edu.mu.pizza.Toppings;

public class Main {

	public static void main(String[] args) {
		// Instantiate a pizzaOrder, perform operations based on the requirements.
        PizzaOrder order = new PizzaOrder();
        // Adds pizzas to the cart, selects cooking strategies for the pizzas in the cart,
        //prints pizza order cart. Calls checkout to calculate the bill, throws exception if
        //triggered.
        // TODO
        order.addPizzaToCart(PizzaType.HAWAIIAN);
        order.selectCookingStrategyByPizzaOrderID(1, CookingStyleType.MICROWAVE);
        order.addNewToppingToPizza(1, Toppings.PEPPERONI);
        order.printListOfToppingsByPizzaOrderID(1);
        order.removeToppingFromPizza(1, Toppings.PEPPERONI);
        order.addPizzaToCart(PizzaType.SUPREME);
        System.out.println(order.isThereAnyUncookedPizza());
        order.printListOfToppingsByPizzaOrderID(1);
        order.printPizzaOrderCart(1);
	}

}
