package factory.pizzaingredient;

public abstract class PizzaStore2 {
	
	// 실제 외부에서 피자 주문 시 사용하게 될 Method
	public Pizza2 orderPizza(String type){
		
		Pizza2 pizza = createPizza(type);
		
		// 피자 주문시 행하는 일련의 작업진행
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	// Factory Method (서브클래스에서 구현)
	protected abstract Pizza2 createPizza(String type); 

}
