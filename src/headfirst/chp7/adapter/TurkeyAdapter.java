package headfirst.chp7.adapter;

public class TurkeyAdapter implements Duck{ // the interface to adapt. 
	Turkey turkey;

	// Get Turkey
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() { // make sound
		turkey.gobble();
	}

	@Override
	// turkey needs to fly more to be same with duck
	public void fly() {
		for(int i=0; i<5; i++){
			turkey.fly(); 
		}
	}
}
