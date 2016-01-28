package headfirst.chp5.singleton.boiler;

public class SingleChocolateBoiler3 {
	// 정적초기화를 통해 안정적으로 한개의 객체만을 생성 
	private static SingleChocolateBoiler3 instance = new SingleChocolateBoiler3();

	private boolean empty;
	private boolean boiled;
	
	private SingleChocolateBoiler3() {
		empty = true;
		boiled = false;
	}

	public static SingleChocolateBoiler3 getInstance() {
		// 항상 instance가 있으니 무조건 리턴
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
