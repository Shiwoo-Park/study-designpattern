package headfirst.chp5.singleton.boiler;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	public ChocolateBoiler() {
		empty = true;
		boiled = false;
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
