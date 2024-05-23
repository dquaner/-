package org.dyy.creational.factory.absfactory;

import org.dyy.creational.factory.absfactory.order.BJPizzaFactory;
import org.dyy.creational.factory.absfactory.order.OrderPizza;

public class BJPizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJPizzaFactory());
    }
}
