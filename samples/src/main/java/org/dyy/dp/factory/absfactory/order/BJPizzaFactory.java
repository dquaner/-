package org.dyy.dp.factory.absfactory.order;

import org.dyy.dp.factory.absfactory.pizza.BJCheesePizza;
import org.dyy.dp.factory.absfactory.pizza.BJPepperPizza;
import org.dyy.dp.factory.absfactory.pizza.Pizza;

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
