package org.dyy.creational.principle.ocp.improve;

// 新增一个图形
class AnotherShape extends Shape {
    AnotherShape() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("Draw AnotherShape");
    }
}
