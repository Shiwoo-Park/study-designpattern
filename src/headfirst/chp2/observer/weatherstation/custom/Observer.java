package headfirst.chp2.observer.weatherstation.custom;

public interface Observer {
	public void update(float temp, float humid, float pressure);
}
