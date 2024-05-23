package org.dyy.creational.builder.uc;

public abstract class AbstractHouse {
    protected String basic;
    protected String wall;
    protected String roof;

    // 打桩
    protected abstract void buildBasic();
    // 砌墙
    protected abstract void buildWalls();
    // 封顶
    protected abstract void roofed();

    public AbstractHouse build() {
        buildBasic();
        buildWalls();
        roofed();
        return this;
    }
}
