package headfirst.chp1.strategy.behaviors;

public class Beep implements SoundBehavior{
	public void makeSound() {
		System.out.println("Beep!!!");
	}
}
