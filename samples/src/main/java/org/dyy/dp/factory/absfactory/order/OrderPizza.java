package org.dyy.dp.factory.absfactory.order;

import org.dyy.dp.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    private AbstractPizzaFactory pizzaFactory;

    public OrderPizza(AbstractPizzaFactory pizzaFactory) {
        setPizzaFactory(pizzaFactory);

        Pizza pizza;
        String orderType;

        do {
            orderType = getType();
            pizza = this.pizzaFactory.createPizza(orderType);
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

    public void setPizzaFactory(AbstractPizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
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
