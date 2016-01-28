package observer.embed.weatherstation;

import java.util.Observable;
import java.util.Observer;

import observer.custom.weatherstation.DisplayElement;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	Observable observerble;
	private float temp;
	private float humid;
	
	public CurrentConditionDisplay(Observable ob) {
		this.observerble = ob;
		this.observerble.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			this.temp = weatherData.getTemp();
			this.humid = weatherData.getHumid();
			display();
		}
	}
	
	public void display(){
		System.out.println("Current condition :"+temp+"F degrees and"+humid+"% humidity");
	}
}
