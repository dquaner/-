package org.dyy.behavioral.observer.improve;

public class BaiduSite implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float t, float p, float h) {
        this.temperature = t;
        this.pressure = p;
        this.humidity = h;
        display();
    }

    public void display() {
        System.out.println("***BaiduSite temperature: " + this.temperature + "***");
        System.out.println("***BaiduSite pressure: " + this.pressure + "***");
        System.out.println("***BaiduSite humidity: " + this.humidity + "***");
    }

}
