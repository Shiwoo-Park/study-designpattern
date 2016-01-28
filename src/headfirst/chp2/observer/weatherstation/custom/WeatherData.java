package headfirst.chp2.observer.weatherstation.custom;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int idx = observers.indexOf(o);
		if(idx >= 0)
			observers.remove(idx);
	}
	
	public void notifyObservers() {
		for(int i=0; i<observers.size(); i++){
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float t, float h, float p){
		this.temperature = t;
		this.humidity = h;
		this.pressure = p;
		measurementChanged();
	}
}
