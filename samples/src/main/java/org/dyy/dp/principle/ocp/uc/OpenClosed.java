package org.dyy.dp.principle.ocp.uc;

public class OpenClosed {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawTriangle(new Triangle());
    }
}
