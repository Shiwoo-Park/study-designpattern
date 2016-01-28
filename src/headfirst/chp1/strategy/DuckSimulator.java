package headfirst.chp1.strategy;

import headfirst.chp1.strategy.models.Duck;
import headfirst.chp1.strategy.models.MallardDuck;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck duck1 = new MallardDuck();
		duck1.display();
		duck1.performFly();
		duck1.performSound();
	}

}
