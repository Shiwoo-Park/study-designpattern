package headfirst.chp1.strategy;

public class Mute implements SoundBehavior{
	public void makeSound() {
		System.out.println("...(mute)");
	}
}
