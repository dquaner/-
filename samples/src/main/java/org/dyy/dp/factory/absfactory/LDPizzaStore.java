package org.dyy.dp.factory.absfactory;

import org.dyy.dp.factory.absfactory.order.LDPizzaFactory;
import org.dyy.dp.factory.absfactory.order.OrderPizza;

public class LDPizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new LDPizzaFactory());
    }
}
