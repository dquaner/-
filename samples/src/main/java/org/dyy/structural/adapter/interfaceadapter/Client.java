package org.dyy.structural.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void f1() {
                System.out.println("f1 implementation");
            }
        };
        absAdapter.f1();
    }
}
