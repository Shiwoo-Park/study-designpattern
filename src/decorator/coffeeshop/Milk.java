package decorator.coffeeshop;

public class Milk extends CodimentDecorator {
	private Beverage beverage;
	
	public Milk(Beverage b) {
		this.beverage = b;
	}
	
	public String getDesc() {
		return beverage.getDesc() + ", Milk";
	}

	public double cost() {
		return beverage.cost() + .1;
	}
}
