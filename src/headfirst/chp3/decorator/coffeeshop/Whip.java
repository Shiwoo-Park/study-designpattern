package headfirst.chp3.decorator.coffeeshop;

public class Whip extends CodimentDecorator{
	private Beverage beverage;
	
	public Whip(Beverage b) {
		this.beverage = b;
	}
	
	public String getDesc() {
		return beverage.getDesc() + ", Whip Cream";
	}

	public double cost() {
		return beverage.cost() + .1;
	}
}
