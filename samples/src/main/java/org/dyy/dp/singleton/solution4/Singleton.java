package org.dyy.dp.singleton.solution4;

/**
 * 懒汉式（同步方法）
 * 实现了延迟加载，保证了线程安全，但同步方法效率低
 */
public class Singleton {
    // 1. 构造器私有化
    private Singleton() {}

    // 2. 定义静态变量
    private static Singleton singleton;

    // 3. 提供一个静态的公有方法，加入同步处理代码，解决线程安全问题
    // synchronized 用在静态方法上，给 Singleton 类加锁，保证同一时刻最多只有一个线程执行该方法
    // 每次有一个线程请求 singleton 实例时，都会在方法上同步，效率比较低
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    // methods...
    public void sayHello() {
        System.out.println("hello");
    }
}
