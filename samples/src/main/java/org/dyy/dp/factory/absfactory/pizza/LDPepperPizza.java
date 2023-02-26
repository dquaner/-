package org.dyy.dp.factory.absfactory.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("LDPepperPizza");
        System.out.println("preparing..." + name);
    }
}
