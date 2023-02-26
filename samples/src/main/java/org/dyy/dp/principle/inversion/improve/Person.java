package org.dyy.dp.principle.inversion.improve;

public class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
