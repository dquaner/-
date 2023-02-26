package org.dyy.dp.factory.absfactory;

import org.dyy.dp.factory.absfactory.order.BJPizzaFactory;
import org.dyy.dp.factory.absfactory.order.OrderPizza;

public class BJPizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJPizzaFactory());
    }
}
