package factory.pizzaingredient;

public class NYVeggiePizza extends Pizza2{
	PizzaIngredientFactory ingredientFactory;

	public NYVeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	void prepare() {
		System.out.println("Preparing "+name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		veggies = ingredientFactory.createVeggies();
		
	}
	
}
