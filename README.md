# Homework 5 - CMP_SCI 3330 SP24
This project is a pizza online order system. It involves the strategy design pattern the implements the ICookingStrategy interface. It also incorporates the factory design pattern in the PizzaCookingFactory class to encapsulate the process.

### Group Members
- Aaron yang
- Zach Snyder
- Viet Nguyen
- Chetan Vanteddu

### Usage

This project was developed using Java Dev Kit version 21. In order to run this code you will need to have JDK 21 selected as you Java Runtime Environment within your IDE. 

We have provided a test Main.java to perform many of the operations provided, however, if you would like to create your own main you can just create it within the package and use it instead.

To run within any file just hit play!

### Contributions
- Aaron Yang
  - Created intial classes, ENUMs, and interfaces as well as the attributes and method sigantures for these as well. As well as getters and setters.
  - Intial paramterized and copy construictors for the Pizza types, also made modifications to them aswell.
  - Created the toString() for AbstractPizza.
  - Created implementations for the below methods:
    - `public boolean cook(AbstractPizza pizza)`, for each startegy of ICoookingStrategy.
    - `protected abstract double addToppingsToPrice(double priceWithoutToppings)`, for each Pizza type.
    - `public abstract double updatePizzaPrice()`, for each Pizza type.
- Zach Snyder
  - Wrote `printPizzaOrderCart` and `printListOfToppingsByPizzaOrderID` and `addPizzaToCart` and made changes to fix the constructors based off errors I encountered while writing my part.
  - Also wrote the `PizzaOrder constructor` and `printListOfToppingsByOrderId`. 
- Viet Nguyen
  - Created `createPizza` method in `PizzaCookingFactory`
      - Changed to initiate pizza objects with parameterized constructors during testing to correctly initiate pizza objects
  - Created `getPizzaByOrderID`, `removeToppingFromPizza`, and `addNewToppingToPizza` methods
- Chetan Vanteddu
  - Created and implemented the following methods:
    - `public boolean isThereAnyUncookedPizza()`
    - `public double checkout() throws Exception`
      - Adjustments were made further down the project timline to properly calculate the total price of the pizzas in the cart, which is returned as a double.
    - `public boolean selectCookingStrategyByPizzaOrderID(int orderID,CookingStyleType cookingStrategyType)`
  - Implemented the ICookingStrategy interface with the `selectCookingStrategyByPizzaOrderID` method
