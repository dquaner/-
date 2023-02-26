package org.dyy.dp.factory.uc.pizzastore.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("GreekPizza");
        System.out.println("preparing..." + name);
    }
}
