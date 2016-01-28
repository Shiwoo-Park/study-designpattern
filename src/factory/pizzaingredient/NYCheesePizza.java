package factory.pizzaingredient;

public class NYCheesePizza extends Pizza2{
	PizzaIngredientFactory ingredientFactory;

	public NYCheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	void prepare() {
		System.out.println("Preparing "+name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		
	}
	
}
