package org.dyy.creational.factory.absfactory.order;

import org.dyy.creational.factory.absfactory.pizza.Pizza;

public interface AbstractPizzaFactory {
    Pizza createPizza(String pizzaType);
}
