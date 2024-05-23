package org.dyy.creational.principle.inversion.dependencypass.solution1;

public class OpenAndClose implements IOpenAndClose {
    @Override
    public void open(ITV tv) {
        tv.play();
    }
}








