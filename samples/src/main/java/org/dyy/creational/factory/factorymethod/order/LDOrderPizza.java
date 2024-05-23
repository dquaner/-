package org.dyy.creational.factory.factorymethod.order;

import org.dyy.creational.factory.factorymethod.pizza.LDCheesePizza;
import org.dyy.creational.factory.factorymethod.pizza.LDPepperPizza;
import org.dyy.creational.factory.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

    @Override
    protected Pizza createPizza(String pizzaType) {
        if ("cheese".equals(pizzaType)) {
            return new LDCheesePizza();
        } else if("pepper".equals(pizzaType)) {
            return new LDPepperPizza();
        } else {
            return null;
        }
    }

}
