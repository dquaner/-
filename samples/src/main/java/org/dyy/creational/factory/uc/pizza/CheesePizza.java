package org.dyy.creational.factory.uc.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("CheesePizza");
        System.out.println("preparing..." + name);
    }
}
