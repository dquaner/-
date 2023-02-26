package org.dyy.dp.principle.segregation.improve;

/**
 * A 通过 Interface1, Interface2 依赖（使用）B
 */
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface2 i) {
        i.operation2();
    }
    public void depend3(Interface2 i) {
        i.operation3();
    }
}
