package org.dyy.dp.builder.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    protected void buildBasic() {
        house.setBasic("CommonHouse Basic");
    }

    @Override
    protected void buildWalls() {
        house.setWall("CommonHouse Wall");
    }

    @Override
    protected void roofed() {
        house.setRoof("CommonHouse Roof");
    }
}
