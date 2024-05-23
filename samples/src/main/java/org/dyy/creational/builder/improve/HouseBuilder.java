package org.dyy.creational.builder.improve;

public abstract class HouseBuilder {

    protected House house = new House();

    // 建造的各个流程
    protected abstract void buildBasic();
    protected abstract void buildWalls();
    protected abstract void roofed();

    // 建造好后，返回实例
    public House buildHouse() {
        return house;
    }
}
