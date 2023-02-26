package org.dyy.dp.factory.simplefactory;

import org.dyy.dp.factory.simplefactory.order.OrderPizza;
import org.dyy.dp.factory.simplefactory.pizza.SimplePizzaFactory;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimplePizzaFactory());
    }
}
