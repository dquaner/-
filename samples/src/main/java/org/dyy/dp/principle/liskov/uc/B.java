package org.dyy.dp.principle.liskov.uc;

class B extends A {

    public int func1(int a, int b) { // 不小心重写了父类的 func1 方法
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

}
