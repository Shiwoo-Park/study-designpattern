package strategy.duck;

/**
 * 인터페이스 필드변수에 대해,
 * 생성자에서 객체에 해당하는
 * 구상클래스를 대입하여 초기화
 */
public class MallardDuck extends Duck{
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		soundBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm Mallard Duck!!!");
	}

}
