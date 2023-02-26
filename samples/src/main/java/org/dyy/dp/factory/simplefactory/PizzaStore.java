package org.dyy.dp.factory.simplefactory;

import org.dyy.dp.factory.simplefactory.pizza.SimplePizzaFactory;
import org.dyy.dp.factory.simplefactory.order.OrderPizza;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimplePizzaFactory());
    }
}
