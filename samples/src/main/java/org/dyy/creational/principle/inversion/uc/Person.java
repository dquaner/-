package org.dyy.creational.principle.inversion.uc;

class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
