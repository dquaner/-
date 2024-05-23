package org.dyy.behavioral.observer.improve;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    private final ArrayList<Observer> observers = new ArrayList();

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
        notifyObservers();
    }

    public void setData(float t, float p, float h) {
        this.temperature = t;
        this.pressure = p;
        this.humidity = h;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(o -> o.update(getTemperature(), getPressure(), getHumidity()));
    }

}
