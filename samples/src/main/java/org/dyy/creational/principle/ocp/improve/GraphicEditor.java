package org.dyy.creational.principle.ocp.improve;

// 用于绘图的类[使用方]
class GraphicEditor {
    // 接收 Shape 对象，根据 type 的值绘制不同的图形
    public void drawShape(Shape s) {
        s.draw(); // 新增 Shape 时使用方不需要做任何修改
    }
}
