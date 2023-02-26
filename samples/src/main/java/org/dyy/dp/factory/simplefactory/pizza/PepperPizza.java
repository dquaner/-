package org.dyy.dp.factory.simplefactory.pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("PepperPizza");
        System.out.println("preparing..." + name);
    }
}
