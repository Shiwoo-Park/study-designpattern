package headfirst.chp5.singleton.boiler;

public class ChocolateBoilerSimulator {

	public class MyThread implements Runnable{
		private String name;
		private SingleChocolateBoiler boiler;
		public MyThread(String name) {
			this.name = name;
			boiler = SingleChocolateBoiler.getInstance();
		}
		
		@Override
		public void run() {
			boiler.fill(name);
			boiler.boil(name);
			boiler.drain(name);
		}
		
	}
	
	public static void main(String[] args) {
		ChocolateBoilerSimulator obj = new ChocolateBoilerSimulator();
		int threadCount = 5;
		for(int i=0; i < threadCount; i++){
			Thread t = new Thread(obj.new MyThread("Thread"+i));
			t.run();
		}
	}
}
