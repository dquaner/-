package org.dyy.creational.factory.uc.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("GreekPizza");
        System.out.println("preparing..." + name);
    }
}
