package org.dyy.dp.factory.uc.order;

import org.dyy.dp.factory.uc.pizza.CheesePizza;
import org.dyy.dp.factory.uc.pizza.GreekPizza;
import org.dyy.dp.factory.uc.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaOrder {

    public PizzaOrder() {
        Pizza pizza = null;
        String orderType;

        do {
            orderType = getType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
            } else if("cheese".equals(orderType)) {
                pizza = new CheesePizza();
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
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
