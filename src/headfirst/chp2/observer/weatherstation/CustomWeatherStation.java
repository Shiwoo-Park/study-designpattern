package headfirst.chp2.observer.weatherstation;

import headfirst.chp2.observer.weatherstation.custom.CurrentConditionDisplay;
import headfirst.chp2.observer.weatherstation.custom.WeatherData;

public class CustomWeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay cDisplay = new CurrentConditionDisplay(weatherData);
		//StatisticsDisplay sDisplay = new StatisticsDisplay(weatherData);
		//ForecastDisplay fDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 62, 30.4f);
		weatherData.setMeasurements(82, 70, 27.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
