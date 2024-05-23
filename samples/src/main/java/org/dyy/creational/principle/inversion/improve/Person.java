package org.dyy.creational.principle.inversion.improve;

public class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
