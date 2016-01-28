package observer.custom.weatherstation;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temp, float humid, float pressure) {
		this.temperature = temp;
		this.humidity = humid;
		display();
	}
	
	public void display(){
		System.out.println("Current condition : "+temperature
				+"F degrees and "+humidity+"% humidity");
	}
}
