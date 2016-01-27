package headfirst.chp6.models;

public class Fan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	int speed;

	public Fan() {
		speed = OFF;
	}

	public void high(){ 
		this.speed = HIGH; 
		System.out.println("Fan speed is HIGH"); 
	}
	public void medium(){
		this.speed = MEDIUM;
		System.out.println("Fan speed is MEDIUM");
	}
	public void low(){ 
		this.speed = LOW;
		System.out.println("Fan speed is LOW");
	}
	public void off(){ 
		this.speed = OFF;
		System.out.println("Fan is OFF");
	}

	public int getSpeed(){ return this.speed; }
}
