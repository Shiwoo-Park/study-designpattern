package decorator.coffeeshop;

import decorator.coffeeshop.CoffeeShop.Size;

public class Espresso extends Beverage {
	public Espresso(Size size) {
		desc = "Espresso";
		this.size = size;
	}

	public double cost() {
		switch (size) {
		case TALL:
			return 1.99; 
		case GRANDE:
			return 2.49; 
		case VENTI:
			return 2.99; 

		default:
			break;
		}
		return 0;
	}

}
