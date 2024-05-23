package org.dyy.creational.factory.absfactory.order;

import org.dyy.creational.factory.absfactory.pizza.LDCheesePizza;
import org.dyy.creational.factory.absfactory.pizza.LDPepperPizza;
import org.dyy.creational.factory.absfactory.pizza.Pizza;

public class LDPizzaFactory implements AbstractPizzaFactory {

    @Override
    public Pizza createPizza(String pizzaType) {
        if ("cheese".equals(pizzaType)) {
            return new LDCheesePizza();
        } else if("pepper".equals(pizzaType)) {
            return new LDPepperPizza();
        } else {
            return null;
        }
    }

}
