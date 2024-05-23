package org.dyy.creational.principle.segregation.uc;

/**
 * 1. A 通过 Interface1 依赖（使用）B
 * 2. 但是 A 中只会使用到 Interface1 的 1,2,3 三个方法，违反了接口隔离原则
 */
class A {
    public void depend1(Interface i) {
        i.operation1();
    }
    public void depend2(Interface i) {
        i.operation2();
    }
    public void depend3(Interface i) {
        i.operation3();
    }
}
