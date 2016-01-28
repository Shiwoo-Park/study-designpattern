package singleton.boiler;

public class SingleChocolateBoiler4 {
	
	private volatile static SingleChocolateBoiler4 instance;
	private boolean empty;
	private boolean boiled;
	
	private SingleChocolateBoiler4() {
		empty = true;
		boiled = false;
	}

	public static SingleChocolateBoiler4 getInstance() {
		if (instance == null){
			// 처음에만 동기화를 진행(오버헤드 발생 X)
			synchronized (SingleChocolateBoiler4.class) {
				if(instance == null){
					instance = new SingleChocolateBoiler4();
				}
			}
		}
		return instance;
	}
	
	public void fill(){
		if(isEmpty()){
			empty = false;
			boiled = false;
		}
	}
	
	public void boil(){
		if(!isEmpty() && !isBoiled()){
			// 재료를 끓임
			boiled = true;
		}
	}
	
	public void drain(){
		if(!isEmpty() && isBoiled()){
			// 다 끓였음, 재료를 다음단계로 넘긴다
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
