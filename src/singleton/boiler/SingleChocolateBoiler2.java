package singleton.boiler;

public class SingleChocolateBoiler2 {
	private static SingleChocolateBoiler2 instance;
	private boolean empty;
	private boolean boiled;
	
	private SingleChocolateBoiler2() {
		empty = true;
		boiled = false;
	}

	/** 멀티스레딩에 의한 동시접근 방지
	 * 
	 *  < 단점 >
	 *  - 처음 인스턴스를 만들때를 제외하고 이부분은 영영 동기화될 필요가 없다.
	 *  - 즉, 첫번째 과정을 제외하면 프로세스의 불필요한 오버헤드만을 증가시킴.
	 *  
	 */
	public static synchronized SingleChocolateBoiler2 getInstance() {
		if(instance == null){
			instance = new SingleChocolateBoiler2();
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
