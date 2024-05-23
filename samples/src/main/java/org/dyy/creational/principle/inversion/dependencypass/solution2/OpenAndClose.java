package org.dyy.creational.principle.inversion.dependencypass.solution2;

public class OpenAndClose implements IOpenAndClose {
    private final ITV tv;

    public OpenAndClose(ITV tv) { //构造方法
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}






