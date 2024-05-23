package org.dyy.creational.principle.ocp.improve;

class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("Draw Triangle");
    }
}
