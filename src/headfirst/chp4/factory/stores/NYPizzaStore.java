package headfirst.chp4.factory.stores;

import headfirst.chp4.factory.pizzas.NYStyleCheesePizza;
import headfirst.chp4.factory.pizzas.NYStyleClamPizza;
import headfirst.chp4.factory.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if(type.equals("clam")){
			return new NYStyleClamPizza();
		}
		return null;
	}

}
