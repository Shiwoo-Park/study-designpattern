package headfirst.chp5.singleton.boiler;

public class SingleChocolateBoiler {
	private static SingleChocolateBoiler instance;
	private boolean empty;
	private boolean boiled;
	
	private SingleChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static SingleChocolateBoiler getInstance() {
		if(instance == null){
			instance = new SingleChocolateBoiler();
		}
		return instance;
	}
	public void fill(String name){
		if(isEmpty()){
			empty = false;
			boiled = false;
			System.out.println(name+" : Fill up!!");
		}
	}
	
	public void boil(String name){
		if(!isEmpty() && !isBoiled()){
			// 재료를 끓임
			System.out.println(name+" : Boiled!!");
			boiled = true;
		}
	}
	
	public void drain(String name){
		if(!isEmpty() && isBoiled()){
			// 다 끓였음, 재료를 다음단계로 넘긴다
			System.out.println(name+" : Drained!!");
			empty = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	public boolean isBoiled() {
		return boiled;
	}
}
