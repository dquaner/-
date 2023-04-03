package org.dyy.dp.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("======= Object Adapter =======");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
