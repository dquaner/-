package org.dyy.dp.adapter.classadapter;

public class Phone {
    public void charging(Voltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("Voltage is 5V, charging...");
        } else {
            System.out.println("Invalid voltage.");
        }

    }
}
