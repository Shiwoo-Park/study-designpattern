package strategy.duck;

public class Mute implements SoundBehavior{
	public void makeSound() {
		System.out.println("...(mute)");
	}
}
