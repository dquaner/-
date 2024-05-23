package org.dyy.behavioral.observer.push;

public class Client {
    
    public static void main(String[] args) {
        // 天气公告板
        CurrentConditions c = new CurrentConditions();
        // 天气数据
        WeatherData d = new WeatherData(c);

        d.setData(30, 150, 40);

        System.out.println("======天气发生变化======");
        d.setData(40, 160, 20);
    }

}
