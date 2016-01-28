package headfirst.chp4.abstractfactory;

import headfirst.chp4.abstractfactory.pizzas.Pizza2;
import headfirst.chp4.abstractfactory.stores.NYPizzaStore2;
import headfirst.chp4.abstractfactory.stores.PizzaStore2;

public class PizzaFranchiseSimulator {
	public static void main(String[] args) {
		PizzaStore2 nyStore = new NYPizzaStore2();
		Pizza2 pizza = nyStore.orderPizza("cheese");
		//Pizza2 pizza = nyStore.orderPizza("lemon");// this will throw error
		System.out.println("Shiwoo ordered "+pizza.getName());
	}
}
