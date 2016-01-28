package headfirst.chp4.factory.ingredients;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Cheese createCheese();
	public Sauce createSauce();
	public Veggies[] createVeggies();
}
