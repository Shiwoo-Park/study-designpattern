package headfirst.chp1.strategy.behaviors;

public class Mute implements SoundBehavior{
	public void makeSound() {
		System.out.println("...(mute)");
	}
}
