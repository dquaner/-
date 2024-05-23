package org.dyy.creational.factory.absfactory.order;

import org.dyy.creational.factory.absfactory.pizza.BJCheesePizza;
import org.dyy.creational.factory.absfactory.pizza.BJPepperPizza;
import org.dyy.creational.factory.absfactory.pizza.Pizza;

public class BJPizzaFactory implements AbstractPizzaFactory {

    @Override
    public Pizza createPizza(String pizzaType) {
        if ("cheese".equals(pizzaType)) {
            return new BJCheesePizza();
        } else if("pepper".equals(pizzaType)) {
            return new BJPepperPizza();
        } else {
            return null;
        }
    }

}
