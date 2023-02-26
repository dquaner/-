package org.dyy.dp.factory.factorymethod.order;

import org.dyy.dp.factory.factorymethod.pizza.*;

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
