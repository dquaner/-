package org.dyy.dp.factory.simplefactory.order;

import org.dyy.dp.factory.simplefactory.pizza.CheesePizza;
import org.dyy.dp.factory.simplefactory.pizza.GreekPizza;
import org.dyy.dp.factory.simplefactory.pizza.Pizza;

public class SimplePizzaFactory {

    // 简单工厂模式也叫静态工厂模式，可以将该方法定义为静态方法
    public Pizza createPizza(String pizzaType) {
        if ("greek".equals(pizzaType)) {
            return new GreekPizza();
        } else if("cheese".equals(pizzaType)) {
            return new CheesePizza();
        } else {
            return null;
        }
    }

}
