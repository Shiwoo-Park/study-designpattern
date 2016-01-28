package decorator.coffeeshop;

public class Mocha extends CodimentDecorator {
	private Beverage beverage;
	
	public Mocha(Beverage b) {
		this.beverage = b;
	}
	
	public String getDesc() {
		return beverage.getDesc() + ", Mocha";
	}

	public double cost() {
		float cost = 0;
		switch (size) {
		case TALL:
			cost = 0.2f;
			break;
		case GRANDE:
			cost = 0.4f;
			break;
		case VENTI:
			cost = 0.6f;
			break;

		default:
			break;
		}
		return beverage.cost() + cost;
	}

}
