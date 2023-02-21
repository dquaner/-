package org.dyy.dp.singleton.solution7;

/**
 * 静态内部类
 */
public class Singleton {
    // 1. 构造器私有化
    private Singleton() {}

    // 3. 提供一个静态的公有方法，直接返回 SingletonInstance.INSTANCE
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    // 2. 写一个静态内部类，该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // methods...
    public void sayHello() {
        System.out.println("hello");
    }
}
