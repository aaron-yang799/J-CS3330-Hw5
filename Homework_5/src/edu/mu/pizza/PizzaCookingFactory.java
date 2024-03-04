package edu.mu.pizza;

public class PizzaCookingFactory {
	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
		switch(pizzaType.getClass().getSimpleName()) {
		
		case "HawaiianPizza":
			HawaiianPizza newHawaiian = new HawaiianPizza();
			newHawaiian.setPizzaOrderID(HawaiianPizza.getOrderIDCounter());
			return newHawaiian;
			
		case "MargheritaPizza":
			MargheritaPizza newMargherita = new MargheritaPizza();
			newMargherita.setPizzaOrderID(MargheritaPizza.getOrderIDCounter());
			return newMargherita;
			
		case "SupremePizza":
			SupremePizza newSupreme = new SupremePizza();
			newSupreme.setPizzaOrderID(SupremePizza.getOrderIDCounter());
			return newSupreme;
			
		case "VegetarianPizza":
			VegetarianPizza newVegetarian = new VegetarianPizza();
			newVegetarian.setPizzaOrderID(VegetarianPizza.getOrderIDCounter());
			return newVegetarian;
			
		default:
			break;
		}
		return null;
	}
}
