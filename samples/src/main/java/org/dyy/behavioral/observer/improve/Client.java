package org.dyy.behavioral.observer.improve;

public class Client {
    
    public static void main(String[] args) {
        
        // 天气数据
        WeatherData d = new WeatherData();
        // 天气公告板
        CurrentConditions c = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();

        d.registerObserver(c);
        d.registerObserver(baiduSite);

        System.out.println("通知观察者...");
        d.setData(40, 160, 20);

        d.removeObserver(c);
        d.setData(30, 150, 30);
    }

}
