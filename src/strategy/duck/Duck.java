package strategy.duck;

/**
 * 구현이 여러가지일 수 있는 특정행동에 대해
 * 인터페이스를 두고 각각 디테일을 구현하여,
 * 추상클래스에서 필드 변수로 등록
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	SoundBehavior soundBehavior;
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performSound(){
		soundBehavior.makeSound();
	}
	
	public void swim(){
		System.out.println("All ducks can swim, even fake ducks!!!");
	}
}
