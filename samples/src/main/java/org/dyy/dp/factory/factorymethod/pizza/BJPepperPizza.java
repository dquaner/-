package org.dyy.dp.factory.factorymethod.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJPepperPizza");
        System.out.println("preparing..." + name);
    }
}
