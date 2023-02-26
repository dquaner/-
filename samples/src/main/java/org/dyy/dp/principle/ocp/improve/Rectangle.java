package org.dyy.dp.principle.ocp.improve;

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
