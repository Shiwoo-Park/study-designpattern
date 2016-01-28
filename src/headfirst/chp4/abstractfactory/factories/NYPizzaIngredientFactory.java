package headfirst.chp4.abstractfactory.factories;

import headfirst.chp4.abstractfactory.ingredients.Cheese;
import headfirst.chp4.abstractfactory.ingredients.Dough;
import headfirst.chp4.abstractfactory.ingredients.Garlic;
import headfirst.chp4.abstractfactory.ingredients.MarinaraSauce;
import headfirst.chp4.abstractfactory.ingredients.Onion;
import headfirst.chp4.abstractfactory.ingredients.ReggianoCheese;
import headfirst.chp4.abstractfactory.ingredients.Sauce;
import headfirst.chp4.abstractfactory.ingredients.ThinCrustDough;
import headfirst.chp4.abstractfactory.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}
	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new Garlic(), new Onion()};
		return veggies;
	}
}
