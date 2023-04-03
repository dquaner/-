package org.dyy.dp.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("======= Class Adapter =======");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
