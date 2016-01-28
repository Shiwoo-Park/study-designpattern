package headfirst.chp2.observer.embed.weatherstation;

import java.util.Observable;

public class WeatherData extends Observable{
	private float temp;
	private float humid;
	private float press;
	
	public WeatherData() { }
	
	public void measurementsChanged(){
		setChanged();       // 상태가 바뀌었음을 알린다.
		notifyObservers();  // 데이터를 보낼 수 있지만 여기서는 안보냄
	}
	
	public void setMeasurements(float t, float h, float p){
		this.temp = t;
		this.humid = h;
		this.press = p;
		measurementsChanged();
	}
	
	public float getHumid() {
		return humid;
	}
	
	public float getPress() {
		return press;
	}
	
	public float getTemp() {
		return temp;
	}
}
