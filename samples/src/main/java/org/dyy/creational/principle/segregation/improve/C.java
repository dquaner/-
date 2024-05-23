package org.dyy.creational.principle.segregation.improve;

/**
 * C 通过 Interface1, Interface3 依赖（使用）D
 */
class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend4(Interface3 i) {
        i.operation4();
    }
    public void depend5(Interface3 i) {
        i.operation5();
    }
}
