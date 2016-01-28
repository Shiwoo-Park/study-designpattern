package headfirst.chp4.abstractfactory.pizzas;

import headfirst.chp4.abstractfactory.factories.PizzaIngredientFactory;

public class NYCheesePizza extends Pizza2{
	PizzaIngredientFactory ingredientFactory;

	public NYCheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	public void prepare() {
		System.out.println("Preparing "+name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		
	}
	
}
