package observer.embed.weatherstation;

import java.util.Observable;
import java.util.Observer;

import observer.custom.weatherstation.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement{
	private float currentPressure = 29.92f;
	private float lastPressure;

	public ForecastDisplay(Observable ob) {
		ob.addObserver(this);
	}
	
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPress();
			display();
		}
	}

	public void display() {
		System.out.println("Forecast : Last pressure ["+lastPressure+"] Current pressure ["+currentPressure+"]");
	}

}
