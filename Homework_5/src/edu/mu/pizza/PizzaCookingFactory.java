package edu.mu.pizza;

public class PizzaCookingFactory {
	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
		switch(pizzaType.getClass().getSimpleName()) {
		
		case "HawaiianPizza":
			HawaiianPizza newHawaiian = new HawaiianPizza();
			newHawaiian.setPizzaOrderID(HawaiianPizza.getOrderIDCounter());
			
		case "MargheritaPizza":
			MargheritaPizza newMargherita = new MargheritaPizza();
			newMargherita.setPizzaOrderID(MargheritaPizza.getOrderIDCounter());
			
		case "SupremePizza":
			SupremePizza newSupreme = new SupremePizza();
			newSupreme.setPizzaOrderID(SupremePizza.getOrderIDCounter());
			
		case "VegetarianPizza":
			VegatarianPizza newVegatarian = new VegatarianPizza();
			newVegatarian.setPizzaOrderID(VegatarianPizza.getOrderIDCounter());
			
		default:
			break;
		}
		return null;
	}
}
