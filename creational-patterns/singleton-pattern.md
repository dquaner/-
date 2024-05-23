# 单例模式

单例模式：采取一定的方法，保证在整个软件系统中，对某个类**只能存在一个对象实例**，并且该类**只提供一个取得其对象实例的方法**。

比如 Hibernate 的 SessionFactory，它充当数据存储源的代理，并负责创建 Session 对象。SessionFactory 并不是轻量级的，一般情况下，一个项目只需要一个 SessionFactory，这时就会使用到单例模式。

# 单例模式的实现方式

## 1. 饿汉式（静态常量）

**实现步骤**

1. 构造器私有化
2. 在类的内部定义静态常量 `singleton` ，并创建对象实例
3. 对外提供一个静态的公共方法，返回对象实例

```java
public class Singleton {
    // 构造器私有化，防止外部 new Singleton()
    private Singleton() {}

    // 在类的内部创建对象实例（静态常量）
    private final static Singleton singleton = new Singleton();

    // 对外提供一个静态的公共方法，返回对象实例
    public static Singleton getInstance() {
        return singleton;
    }
}
```

**实现分析**

1. 写法简单，在类装载的时候就完成实例化，这样就避免了线程同步问题。
2. 在类装载的时候就进行实例化，没有达到 Lazy Loading 的效果，如果创建了实例但是没有使用过，就会造成内存的浪费。因为不一定是在调用 `getInstance()` 方法时才加载类，JVM 在首次主动使用一个类时加载类。
3. 在实际开发中，可以使用这种方法。

## 2. 饿汉式（静态代码块）

**实现步骤**

1. 构造器私有化
2. 定义静态常量 `singleton` ，并在静态代码块中创建对象实例
3. 对外提供一个静态的公共方法，返回对象实例

```java
public class Singleton {
    // 构造器私有化，防止外部 new Singleton()
    private Singleton() {}

    private static final Singleton singleton;

    static { // 在静态代码块中创建对象实例
        singleton = new Singleton();
    }

    // 对外提供一个静态的公共方法，返回对象实例
    public static Singleton getInstance() {
        return singleton;
    }
}
```

**实现分析**

优缺点与第一种方式饿汉式（静态常量）相同。

## 3. 懒汉式（线程不安全）

**实现步骤**

```java
public class Singleton {
    // 定义静态变量
    private static Singleton singleton;

    // 构造器私有化
    private Singleton() {}

    // 提供一个静态的公有方法，当使用该方法时，才去创建 instance
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
```

**实现分析**

1. 起到了 Lazy Loading 的效果，但是只能在单线程下使用。
2. 在多线程下，如果一个线程进入了 `if (singleton == null)` 判断语句块，同时另一个线程也进入了这段代码块，就有可能创建两个 `singleton` 实例，破坏了单例的效果。因此，多线程环境中不能使用这种实现方式。
3. 在实际开发中，不能使用这种方法。

## 4. 懒汉式（线程安全，同步方法）

**实现步骤**

1. 构造器私有化
2. 定义静态变量 `singleton`
3. 提供一个静态的公有方法，添加同步处理代码，当使用该方法时，才去创建 `singleton`

```java
public class Singleton {
    // 定义静态变量
    private static Singleton singleton;

    // 构造器私有化
    private Singleton() {}

    // 懒汉式（线程安全，同步方法）
    // 提供一个静态的公有方法，加入同步处理代码，解决线程安全问题
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
```

**实现分析**

1. 解决了线程安全问题；
2. 效率非常低，每个线程在想获得类的实例的时候，执行 `getInstance()` 方法都要进行同步；但实际上，这个方法只需要执行一次实例化代码就够了，后来的线程想要获得该类实例，直接 return 即可，这种进行同步的方式效率太低。
3. 在实际开发中，不推荐使用这种方法。

## 5. 懒汉式（线程不安全，同步代码块）

**实现步骤**

```java
public class Singleton {
    // 定义静态变量
    private static Singleton singleton;

    // 构造器私有化
    private Singleton() {}

    // 懒汉式（线程不安全，同步代码块）
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
```

**实现分析**

1. 这种方法本意是对第四种实现方式进行改进，因为第四种方法的同步方式效率太低，改为对产生实例化的代码块进行同步。
2. 但是，这种同步方式并不能起到线程同步的作用。与第三种方式遇到的情形一致，假如一个线程进入了 `if (singleton == null)` 判断语句块内部，还未来得及往下执行，这时另一个线程也通过了这个判断语句，就会产生多个实例。
3. 在实际开发中，不能使用这种方法。

## 6. 【推荐】双重检查

**实现步骤**

1. 构造器私有化
2. 定义 `volatile` 关键字修饰的静态变量 `singleton`
3. 提供一个静态的公有方法，在实例化对象时进行双重检查

```java
public class Singleton {
    // 定义静态变量
    // 相比于 synchronized（重量级锁），volatile 更轻量，它不会引起线程上下文的切换和调度，但是 volatile 变量的同步性较差
    // volatile 保证变量一旦有变化就刷新到内存，达到变量的内存可见性
    private static volatile Singleton singleton;

    // 构造器私有化
    private Singleton() {}

    // 双重检查
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
}
```

**实现分析**

1. Double-Check 概念是多线程开发中常使用到的，如上述代码所示，我们进行了两次 `if (singleton == null)` 的检查，这样就可以保证线程的安全了。
2. 这样，同步的实例化代码块只执行一次，后来的线程再次访问时，判断 `if (singleton == null)` 为 `false` ，直接返回实例化对象，避免了反复进行方法同步。
3. 双重检查即保证了线程安全，又实现了延迟加载，而且效率较高。在实际的开发中，推荐使用这种单例设计模式。

## 7. 【推荐】静态内部类

**实现步骤**

1. 构造器私有化
2. 写一个静态内部类 `SingletonInstance` ，在静态内部类中定义静态常量 `INSTANCE` 并完成对象实例化
3. 提供一个静态的公有方法，直接返回 `SingletonInstance.INSTANCE`

```java
public class Singleton {
    // 1. 构造器私有化
    private Singleton() {}
    
    // 3. 提供一个静态的公有方法，直接返回 SingletonInstance.INSTANCE
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
    
    // 2. 静态内部类，该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
}
```

**实现分析**

1. 采用了类装载的机制来保证初始实例化时只有一个线程。类的静态属性只会在第一次加载类的时候初始化，所以在这里 JVM 帮我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
2. Singleton 类被装载时并不会立即实例化，而是在需要实例化时，调用 `getInstance()` 方法，才会装载 `SingletonInstance` 类，从而完成 `Singleton` 的实例化。
3. 避免了线程不安全，利用静态内部类特点实现了延迟加载，效率比较高。在实际的开发中，推荐使用这种方式。

## 8. 【推荐】枚举

**实现步骤**

```java
public enum Singleton {
    INSTANCE;
}
```

**实现分析**

1. 借助 JDK1.5 中添加的枚举来实现单例模式，不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
2. 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式。

# 单例模式在 JDK 中应用的源码分析

[java.lang.Runtime](https://docs.oracle.com/javase/8/docs/api/java/lang/Runtime.html) - 饿汉式（静态变量）实现

> Every Java application has a **single instance** of class *Runtime* that allows the application to interface with the environment in which the application is running. The current runtime can be obtained from the *getRuntime* method.  
An application cannot create its own instance of this class.

# 注意事项和细节说明
单例模式的注意事项和细节说明：
1. 单例模式保证了系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统性能。
2. 当想要实例化一个单例类的时候，必须要记住使用相应的获取实例对象的方法，而不是使用 new 方法。
3. 单例模式的使用场景：
    - 需要频繁进行创建和销毁的对象
    - 创建对象时耗时过多或耗费资源过多（即：重量级对象）但又经常用到的对象
    - 工具类对象，频繁访问数据库或文件的对象（比如数据源、session factory 等）