package org.dyy.dp.principle.inversion.uc;

class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
