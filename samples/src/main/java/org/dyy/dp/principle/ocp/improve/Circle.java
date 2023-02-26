package org.dyy.dp.principle.ocp.improve;

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
