package org.dyy.dp.singleton.solution2;

/**
 * 饿汉式（静态代码块）
 * 类加载时创建实例对象，没有实现 Lazy Loading
 */
public class Singleton {
    // 1. 构造器私有化，防止外部 new Singleton()
    private Singleton() {}

    private static final Singleton singleton;

    static { // 2. 在静态代码块中创建对象实例
        singleton = new Singleton();
    }

    // 3. 对外提供一个静态的公共方法，返回对象实例
    public static Singleton getInstance() {
        return singleton;
    }

    // methods...
    public void sayHello() {
        System.out.println("hello");
    }
}
