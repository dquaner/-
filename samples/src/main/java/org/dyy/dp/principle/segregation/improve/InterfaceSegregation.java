package org.dyy.dp.principle.segregation.improve;

public class InterfaceSegregation {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.depend1(b); // class A 通过接口去依赖 class B
        a.depend2(b);
        a.depend3(b);

        C c = new C();
        D d = new D();
        c.depend1(d); // class C 通过接口去依赖 class D
        c.depend4(d);
        c.depend5(d);
    }
}














