package org.dyy.dp.factory.simplefactory.order;

import org.dyy.dp.factory.simplefactory.pizza.Pizza;
import org.dyy.dp.factory.simplefactory.pizza.SimplePizzaFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    private SimplePizzaFactory pizzaFactory;

    public OrderPizza(SimplePizzaFactory simplePizzaFactory) {
        setPizzaFactory(simplePizzaFactory);

        Pizza pizza;
        String orderType;

        do {
            orderType = getType();
            pizza = pizzaFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                break;
            }
        } while (true);
    }

    public void setPizzaFactory(SimplePizzaFactory simplePizzaFactory) {
        this.pizzaFactory = simplePizzaFactory;
    }

    public String getType() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            return in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
