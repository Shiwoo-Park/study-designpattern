package factory.pizzaingredient;

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
