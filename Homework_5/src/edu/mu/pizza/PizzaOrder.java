package edu.mu.pizza;


import java.util.ArrayList;
import java.util.List;

import edu.mu.cookingStrategy.ConventionalOvenCookingStrategy;
import edu.mu.cookingStrategy.BrickOvenCookingStrategy;
import edu.mu.cookingStrategy.MicrowaveCookingStrategy;

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
		for(AbstractPizza pizza : pizzaOrderList) {
			System.out.println("Pizza #" + pizza.getPizzaOrderID() + "\n\tType: " + pizza.getClass().getSimpleName() + "\tPrice Without Toppings: $" + pizza.getPriceWithoutToppings() + "\n\tToppings:");
			for(Toppings topping : pizza.getToppingsList()) {
				System.out.println("\t\t" + topping + "\tPrice: $" + topping.getPrice());
			}
			System.out.println("\tTotal Cost: " + pizza.updatePizzaPrice() + "\n");
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
		//traverse through all pizzas in pizzaOrderList
		for(AbstractPizza pizza: pizzaOrderList) {
			//return pizza if orderID of pizza in list matches orderID of query
			if(pizza.getPizzaOrderID() == orderID) {
				return pizza;
			}
		}
		return null;
	}
	
	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		//find pizza we need to add topping to using getPizzaByOrderID
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		//if pizza does not exist, return false
		if(pizza == null) {
			System.out.println("Pizza with ID" + orderID + "not found");
			return false;
		}
		
		//traverse through toppingsList to check if pizza already has topping
		for(int i = 0; i < pizza.toppingsList.size(); i++) {
			//if pizza already has topping, return false
			if(pizza.toppingsList.get(i) == topping) {
				System.out.println("The pizza already has " + topping);
				return false;
			}
		}
		//if pizza does not have topping already, add topping and return true
		pizza.toppingsList.add(topping);
		return true;
	}

	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
		//find pizza we need to remove topping from using getPizzaByOrderID
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		//if pizza does not exist, return false
		if(pizza == null) {
			System.out.println("Pizza with ID" + orderID + "not found");
			return false;
		}
		
		//traverse through toppingsList to check if pizza has topping we need to remove
		for(int i = 0; i < pizza.toppingsList.size(); i++) {
			//if topping matches the query, remove the topping
			if(pizza.toppingsList.get(i) == topping) {
				pizza.toppingsList.remove(i);
				return true;
			}
		}
		//return false if we could not find topping to remove
		return false;
	
	}
	
	/**
	 * Checks the pizzaOrderList to see if there are any AbstractPizza's that are uncooked;
	 * this is indicated by checking each pizza's cooking strategy and returning true if there
	 * are any pizzas without any assigned pizza cooking strategy, returns false if there
	 *	are no pizzas without an assigned cooking strategy.
	 * @param void
	 * @return boolean
	 */
	public boolean isThereAnyUncookedPizza()
	{
		if(this.pizzaOrderList.isEmpty())
		{
			return false;
		}
		else
		{
			for(AbstractPizza p: pizzaOrderList)
			{
				if(p.getCookingStrategy() == null)
				{
					return true;
				}
			}
		}
		
		return false;
		
	}
	
	/**
	 * This method first checks if there are any uncooked pizzas in the pizzaOrderList,
	 * if there are any, then an exception is thrown. However if all the pizzas are 
	 * cooked then the method will calculate the total price of all pizzas and
	 * returns the total cart price.
	 * @param void
	 * @return double
	 */
	public double checkout() throws Exception 
	{
		double total = 0.00;
        if (isThereAnyUncookedPizza()) {
            throw new Exception("There are uncooked pizzas in the order. Please cook all pizzas before checkout.");
        }
        for(AbstractPizza pizza : pizzaOrderList)
        {
        	total+=pizza.getTotalPrice();
        }
        	
        return total;
    }
	
	
	/**
	 * This method instantiates and assigns a cookingStrategy object 
	 * to the associated pizza based on the passed in orderID parameter,
	 * via the cook() function.
	 * @param int, CookingStyleType
	 * @return boolean
	 */
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
        for (AbstractPizza pizza : pizzaOrderList) {
            if (pizza.getPizzaOrderID() == orderID) {
                switch (cookingStrategyType) {
                    case BRICK_OVEN:
                    	new BrickOvenCookingStrategy().cook(pizza);
                        break;
                    case CONVENTIONAL_OVEN:
                        new ConventionalOvenCookingStrategy().cook(pizza);
                        break;
                    case MICROWAVE:
                        new MicrowaveCookingStrategy().cook(pizza);
                        break;
                    default:
                        return false;
                }
                return true;
            }
        }
        return false;
    }

	
	
}

	

