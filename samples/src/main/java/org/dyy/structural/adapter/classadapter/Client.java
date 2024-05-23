package org.dyy.structural.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("======= Class Adapter =======");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
