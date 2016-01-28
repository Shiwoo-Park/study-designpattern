package headfirst.chp3.decorator.decorators;

import headfirst.chp3.decorator.beverage.Beverage;

public class Mocha extends CodimentDecorator {
	private Beverage beverage;
	
	public Mocha(Beverage b) {
		this.beverage = b;
	}
	
	public String getDesc() {
		return beverage.getDesc() + ", Mocha";
	}

	public double cost() {
		double cost = 0;
		switch (beverage.getSize()) {
		case TALL:
			cost = .2;
			break;
		case GRANDE:
			cost = .4;
			break;
		case VENTI:
			cost = .6;
			break;

		default:
			break;
		}
		
		return beverage.cost() + cost;
	}

}
