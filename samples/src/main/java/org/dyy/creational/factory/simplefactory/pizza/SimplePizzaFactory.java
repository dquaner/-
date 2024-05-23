package org.dyy.creational.factory.simplefactory.pizza;

public class SimplePizzaFactory {

    // 简单工厂模式也叫静态工厂模式，可以将该方法定义为静态方法
    public Pizza createPizza(String pizzaType) {
        if ("greek".equals(pizzaType)) {
            return new GreekPizza();
        } else if("cheese".equals(pizzaType)) {
            return new CheesePizza();
        } else if("pepper".equals(pizzaType)) {
            return new PepperPizza();
        } else {
            return null;
        }
    }

}
