package org.dyy.creational.principle.liskov.improve;

public class LiskovSubstitution {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11,3));
        System.out.println("1-8=" + a.func1(1,8));

        System.out.println("-----------------------");
        B b = new B();
        // 因为 class B 不再继承 class A，因此调用者不会再认为 func1 是求减法
        System.out.println("11+3=" + b.func1(11,3));
        System.out.println("1+8=" + b.func1(1,8));
        System.out.println("11+3+9=" + b.func2(11,3));
        System.out.println("11-3=" + b.func3(11,3));
        System.out.println("1-8=" + b.func3(1,8));
    }
}

