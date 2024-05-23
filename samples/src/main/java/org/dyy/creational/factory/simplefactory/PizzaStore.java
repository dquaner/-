package org.dyy.creational.factory.simplefactory;

import org.dyy.creational.factory.simplefactory.order.OrderPizza;
import org.dyy.creational.factory.simplefactory.pizza.SimplePizzaFactory;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimplePizzaFactory());
    }
}
