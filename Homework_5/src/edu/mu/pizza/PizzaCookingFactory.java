package edu.mu.pizza;

public class PizzaCookingFactory {
	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
		switch(pizzaType) {
		
		case HAWAIIAN :
			HawaiianPizza newHawaiian = new HawaiianPizza(0, 0, 0);
			newHawaiian.setPizzaOrderID(HawaiianPizza.getOrderIDCounter());
			return newHawaiian;
			
		case MARGHERITA:
			MargheritaPizza newMargherita = new MargheritaPizza(0, 0, 0);
			newMargherita.setPizzaOrderID(MargheritaPizza.getOrderIDCounter());
			return newMargherita;
			
		case SUPREME:
			SupremePizza newSupreme = new SupremePizza(0, 0, 0);
			newSupreme.setPizzaOrderID(SupremePizza.getOrderIDCounter());
			return newSupreme;
			
		case VEGETARIAN:
			VegetarianPizza newVegetarian = new VegetarianPizza(0, 0, 0);
			newVegetarian.setPizzaOrderID(VegetarianPizza.getOrderIDCounter());
			return newVegetarian;
			
		default:
			break;
		}
		return null;
	}
}
