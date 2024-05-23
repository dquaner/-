package org.dyy.creational.singleton.solution6;

/**
 * 双重检查
 * 实现了懒加载，解决了线程安全问题，同时保证了效率
 */
public class Singleton {
    // 2. 定义静态变量
    // 相比于 synchronized（重量级锁），volatile 更轻量，它不会引起线程上下文的切换和调度，但是 volatile 变量的同步性较差
    // volatile 保证变量一旦有变化就刷新到内存，达到变量的内存可见性
    private static volatile Singleton singleton;

    // 1. 构造器私有化
    private Singleton() {}

    // 3. 双重检查
    public static Singleton getInstance() {
        if (singleton == null) { // singleton 未实例化时才进行同步，后来的线程（singleton != null）不会再进入同步代码块中
            synchronized (Singleton.class) { // 同步代码块，在类上加锁
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    // methods...
    public void sayHello() {
        System.out.println("hello");
    }
}
