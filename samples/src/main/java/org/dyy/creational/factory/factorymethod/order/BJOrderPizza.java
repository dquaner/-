package org.dyy.creational.factory.factorymethod.order;

import org.dyy.creational.factory.factorymethod.pizza.BJCheesePizza;
import org.dyy.creational.factory.factorymethod.pizza.BJPepperPizza;
import org.dyy.creational.factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

    @Override
    protected Pizza createPizza(String pizzaType) {
        if ("cheese".equals(pizzaType)) {
            return new BJCheesePizza();
        } else if("pepper".equals(pizzaType)) {
            return new BJPepperPizza();
        } else {
            return null;
        }
    }

}
