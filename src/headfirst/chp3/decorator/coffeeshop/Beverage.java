package headfirst.chp3.decorator.coffeeshop;

import headfirst.chp3.decorator.coffeeshop.CoffeeShop.Size;

/**
 * Base class
 */

public abstract class Beverage {
	String desc = "No name";
	Size size = Size.NONE;
	
	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public String getDesc(){
		return desc;
	}
	
	public abstract double cost();
	
	public String toString() {
		return getDesc()+" : "+ cost();
	}
}
