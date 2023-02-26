package org.dyy.dp.principle.ocp.uc;

// 用于绘图的类[使用方]
class GraphicEditor {
    // 接收 Shape 对象，根据 type 的值绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) { // 使用方需要添加新的逻辑
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("Draw Rectangle");
    }

    public void drawCircle(Shape c) {
        System.out.println("Draw Circle");
    }

    // 添加绘制三角形的方法
    public void drawTriangle(Shape t) {
        System.out.println("Draw Triangle");
    }
}
