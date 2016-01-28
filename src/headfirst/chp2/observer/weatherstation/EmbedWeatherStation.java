package headfirst.chp2.observer.weatherstation;

import headfirst.chp2.observer.weatherstation.embed.CurrentConditionDisplay;
import headfirst.chp2.observer.weatherstation.embed.ForecastDisplay;
import headfirst.chp2.observer.weatherstation.embed.WeatherData;

public class EmbedWeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay cDisplay = new CurrentConditionDisplay(weatherData);
		ForecastDisplay fDisplay = new ForecastDisplay(weatherData);
		//StatisticsDisplay sDisplay = new StatisticsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 62, 30.4f);
		weatherData.setMeasurements(82, 70, 27.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
