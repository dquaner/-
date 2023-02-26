package org.dyy.dp.factory.absfactory.order;

import org.dyy.dp.factory.absfactory.pizza.Pizza;

public interface AbstractPizzaFactory {
    Pizza createPizza(String pizzaType);
}
