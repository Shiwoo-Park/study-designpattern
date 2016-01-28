package headfirst.chp1.strategy;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck duck1 = new MallardDuck();
		duck1.display();
		duck1.performFly();
		duck1.performSound();
	}

}
