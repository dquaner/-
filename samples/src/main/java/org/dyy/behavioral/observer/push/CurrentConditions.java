package org.dyy.behavioral.observer.push;

public class CurrentConditions {
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float t, float p, float h) {
        this.temperature = t;
        this.pressure = p;
        this.humidity = h;
        display();
    }

    public void display() {
        System.out.println("***Today's temperature: " + this.temperature + "***");
        System.out.println("***Today's pressure: " + this.pressure + "***");
        System.out.println("***Today's humidity: " + this.humidity + "***");
    }
}
