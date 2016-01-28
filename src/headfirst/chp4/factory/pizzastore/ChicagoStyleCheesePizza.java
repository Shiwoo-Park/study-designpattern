package headfirst.chp4.factory.pizzastore;

public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza() {
		this.name = "ChicagoStyleCheesePizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
		this.toppings.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	public void desc() {
		System.out.println("This is ChicagoStyle Cheese Pizza");
	}
}
