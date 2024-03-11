package edu.mu;

import edu.mu.pizza.CookingStyleType;
import edu.mu.pizza.PizzaOrder;
import edu.mu.pizza.PizzaType;
import edu.mu.pizza.Toppings;

public class Main {

	public static void main(String[] args) throws Exception {
		// Instantiate a pizzaOrder, perform operations based on the requirements.
        PizzaOrder order = new PizzaOrder();
        // Adds pizzas to the cart, selects cooking strategies for the pizzas in the cart,
        //prints pizza order cart. Calls checkout to calculate the bill, throws exception if
        //triggered.
        // TODO
        order.addPizzaToCart(PizzaType.HAWAIIAN);
        order.selectCookingStrategyByPizzaOrderID(1, CookingStyleType.MICROWAVE);
        order.addNewToppingToPizza(1, Toppings.PEPPERONI);
        System.out.println("\nPizza after adding Pepperoni: ");
        order.printListOfToppingsByPizzaOrderID(1);
        System.out.println("\nResult of removing Pepperoni: " + order.removeToppingFromPizza(1, Toppings.PEPPERONI));
        System.out.println("\nPizza after removing Pepperoni: ");
        order.printListOfToppingsByPizzaOrderID(1);
        System.out.println("\nResult of adding a uncooked Supreme pizza: " + order.addPizzaToCart(PizzaType.SUPREME));
        System.out.println("\nResult of isThereAnyUncookedPizza: " + order.isThereAnyUncookedPizza() + "\n");
        
        System.out.println("\nAdding muliple pizzas and cooking");
        order.addPizzaToCart(PizzaType.MARGHERITA);
        order.addPizzaToCart(PizzaType.VEGETARIAN);
        order.selectCookingStrategyByPizzaOrderID(2, CookingStyleType.BRICK_OVEN);
        order.selectCookingStrategyByPizzaOrderID(3, CookingStyleType.CONVENTIONAL_OVEN);
        order.selectCookingStrategyByPizzaOrderID(4, CookingStyleType.MICROWAVE);
        System.out.println("\nList of pizzas in cart: ");
        order.printPizzaOrderCart(1);
        System.out.println("Checkout total: " + order.checkout());
	}

}
