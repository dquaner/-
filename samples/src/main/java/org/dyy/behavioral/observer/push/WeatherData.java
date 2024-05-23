package org.dyy.behavioral.observer.push;

public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions c) {
        this.currentConditions = c;
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getPressure() {
        return this.pressure;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public void dataChange() {
        this.currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    public void setData(float t, float p, float h) {
        this.temperature = t;
        this.pressure = p;
        this.humidity = h;
        dataChange();
    }

}
