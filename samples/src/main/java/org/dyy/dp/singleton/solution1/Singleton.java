package org.dyy.dp.singleton.solution1;

/**
 * 饿汉式（静态常量）
 * 类加载时创建实例对象，没有实现 Lazy Loading
 */
public class Singleton {
    // 1. 构造器私有化，防止外部 new Singleton()
    private Singleton() {}

    // 2. 在类的内部创建对象实例（静态常量）
    private final static Singleton singleton = new Singleton();

    // 3. 对外提供一个静态的公共方法，返回对象实例
    public static Singleton getInstance() {
        return singleton;
    }

    // methods...
    public void sayHello() {
        System.out.println("hello");
    }
}
