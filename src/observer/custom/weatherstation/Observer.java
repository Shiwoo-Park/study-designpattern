package observer.custom.weatherstation;

public interface Observer {
	public void update(float temp, float humid, float pressure);
}