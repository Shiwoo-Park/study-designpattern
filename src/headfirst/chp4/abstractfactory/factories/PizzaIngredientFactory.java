package headfirst.chp4.abstractfactory.factories;

import headfirst.chp4.abstractfactory.ingredients.Cheese;
import headfirst.chp4.abstractfactory.ingredients.Dough;
import headfirst.chp4.abstractfactory.ingredients.Sauce;
import headfirst.chp4.abstractfactory.ingredients.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Cheese createCheese();
	public Sauce createSauce();
	public Veggies[] createVeggies();
}
