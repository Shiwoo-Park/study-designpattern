package headfirst.chp1.strategy.behaviors;

public class FlyNoWay implements FlyBehavior{
	public void fly() {
		System.out.println("I can't fly...");
	}
}
