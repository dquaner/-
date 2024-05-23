package org.dyy.creational.factory.absfactory;

import org.dyy.creational.factory.absfactory.order.LDPizzaFactory;
import org.dyy.creational.factory.absfactory.order.OrderPizza;

public class LDPizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new LDPizzaFactory());
    }
}
