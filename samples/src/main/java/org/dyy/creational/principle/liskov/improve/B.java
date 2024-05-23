package org.dyy.creational.principle.liskov.improve;

class B extends Base {
    // 如果 B 需要使用 A 类的方法，使用组合关系
    private final A a = new A();

    public int func1(int a, int b) { // 不小心重写了父类的 func1 方法
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }

}
