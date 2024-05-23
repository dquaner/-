package org.dyy.creational.principle.segregation.uc;

/**
 * 1. C 通过 Interface1 依赖（使用）D
 * 2. 但是 C 中只会使用到 Interface1 的 1,4,5 三个方法，违反了接口隔离原则
 */
class C {
    public void depend1(Interface i) {
        i.operation1();
    }
    public void depend4(Interface i) {
        i.operation4();
    }
    public void depend5(Interface i) {
        i.operation5();
    }
}
