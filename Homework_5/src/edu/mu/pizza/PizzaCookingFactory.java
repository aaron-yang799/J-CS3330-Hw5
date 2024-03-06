package edu.mu.pizza;

public class PizzaCookingFactory {
	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
		switch(pizzaType) {
		
		case HAWAIIAN :
			HawaiianPizza newHawaiian = new HawaiianPizza();
			newHawaiian.setPizzaOrderID(HawaiianPizza.getOrderIDCounter());
			return newHawaiian;
			
		case MARGHERITA:
			MargheritaPizza newMargherita = new MargheritaPizza();
			newMargherita.setPizzaOrderID(MargheritaPizza.getOrderIDCounter());
			return newMargherita;
			
		case SUPREME:
			SupremePizza newSupreme = new SupremePizza();
			newSupreme.setPizzaOrderID(SupremePizza.getOrderIDCounter());
			return newSupreme;
			
		case VEGETARIAN:
			VegetarianPizza newVegetarian = new VegetarianPizza();
			newVegetarian.setPizzaOrderID(VegetarianPizza.getOrderIDCounter());
			return newVegetarian;
			
		default:
			break;
		}
		return null;
	}
}
