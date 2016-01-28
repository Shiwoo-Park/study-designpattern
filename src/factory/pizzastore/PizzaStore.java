package factory.pizzastore;

public abstract class PizzaStore {
	
	// 실제 외부에서 피자 주문 시 사용하게 될 Method
	public Pizza orderPizza(String type){
		
		Pizza pizza = createPizza(type);
		
		// 피자 주문시 행하는 일련의 작업진행
		pizza.desc();
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	// Factory Method (서브클래스에서 구현)
	protected abstract Pizza createPizza(String type); 

}
