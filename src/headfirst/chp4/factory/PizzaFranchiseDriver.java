package headfirst.chp4.factory;

import headfirst.chp4.factory.pizzas.Pizza;
import headfirst.chp4.factory.stores.ChicagoPizzaStore;
import headfirst.chp4.factory.stores.NYPizzaStore;
import headfirst.chp4.factory.stores.PizzaStore;

public class PizzaFranchiseDriver {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Shiwoo ordered "+pizza.getName()+" from NY store\n");
		
		Pizza pizza2 = chicagoStore.orderPizza("cheese");
		System.out.println("Jason ordered "+pizza2.getName()+" from Chicago store\n");
	}
}
