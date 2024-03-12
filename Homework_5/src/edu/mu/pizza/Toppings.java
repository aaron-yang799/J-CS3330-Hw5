package edu.mu.pizza;

public enum Toppings {
	TOMATO(1.50),
	CHEESE(2.00),
	PINEAPPLE(2.50), 
	BLACK_OLIVE(1.25),
	ITALIAN_SAUSAGE(3.50),
	PEPPERONI(3.00),
	BELL_PEPPER(1.00),
	MUSHROOM(1.50),
	CANADIAN_BACON(4.00);
	
	private double price;
	
	/**
	 *Toppings enum private constructor
	 *@param p
	*/
	private Toppings(double p) {
		this.price = p;
	}

//	Setters and getters
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
