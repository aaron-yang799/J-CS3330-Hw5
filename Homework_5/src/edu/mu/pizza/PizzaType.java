package edu.mu.pizza;

public enum PizzaType {
	HAWAIIAN(8.50),
	MARGHERITA(3.50),
	SUPREME(13.75),
	VEGETARIAN(7.25);
	
	private double toppingPrice;	
	
	private PizzaType(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}

	public double getToppingPrice() {
		return toppingPrice;
	}

	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
	
	
}
