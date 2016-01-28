package factory.pizzastore;

public class PizzaFranchiseDriver {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Shiwoo ordered "+pizza.getName()+" from NY store\n");
		
		Pizza pizza2 = chicagoStore.orderPizza("cheese");
		System.out.println("Jason ordered "+pizza2.getName()+" from Chicago store\n");
	}
}
