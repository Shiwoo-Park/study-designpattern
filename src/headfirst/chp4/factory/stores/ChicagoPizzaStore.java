package headfirst.chp4.factory.stores;

import headfirst.chp4.factory.pizzas.ChicagoStyleCheesePizza;
import headfirst.chp4.factory.pizzas.ChicagoStyleClamPizza;
import headfirst.chp4.factory.pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		}else if(type.equals("clam")){
			return new ChicagoStyleClamPizza();
		}
		return null;
	}
}
