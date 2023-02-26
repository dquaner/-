package org.dyy.dp.factory.absfactory.order;

import org.dyy.dp.factory.absfactory.pizza.LDCheesePizza;
import org.dyy.dp.factory.absfactory.pizza.LDPepperPizza;
import org.dyy.dp.factory.absfactory.pizza.Pizza;

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
