package headfirst.chp3.decorator.decorators;

import headfirst.chp3.decorator.beverage.Beverage;

/**
 * Decorator class
 * @author Jsilva
 */
public abstract class CodimentDecorator extends Beverage {
	// 모든 첨가물(Decorator)에서 강제 Override 하도록 만듬
	public abstract String getDesc();
}
