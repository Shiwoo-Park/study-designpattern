package headfirst.chp4.abstractfactory.stores;

import headfirst.chp4.abstractfactory.factories.NYPizzaIngredientFactory;
import headfirst.chp4.abstractfactory.factories.PizzaIngredientFactory;
import headfirst.chp4.abstractfactory.pizzas.NYCheesePizza;
import headfirst.chp4.abstractfactory.pizzas.Pizza2;

public class NYPizzaStore2 extends PizzaStore2{

	@Override
	protected Pizza2 createPizza(String type) {
		Pizza2 pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(type.equals("cheese")){
			pizza = new NYCheesePizza(ingredientFactory);
			pizza.setName("New York style Cheese Pizza");
		}else if (type.equals("veggie")){
			pizza = new NYCheesePizza(ingredientFactory);
			pizza.setName("New York style Veggie Pizza");
		}
		
		return pizza;
	}
}
