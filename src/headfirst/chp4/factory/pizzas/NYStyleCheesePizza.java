package headfirst.chp4.factory.pizzas;

public class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza() {
		this.name = "NYStyleCheesePizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";
		this.toppings.add("Grated Reggiano Cheese");
	}
	@Override
	public void desc() {
		System.out.println("This is NYStyle Cheese Pizza");
	}
}
