package org.dyy.dp.builder.improve;

public class HighBuilding extends HouseBuilder {
    @Override
    protected void buildBasic() {
        house.setBasic("HighBuilding Basic");
    }

    @Override
    protected void buildWalls() {
        house.setWall("HighBuilding Wall");
    }

    @Override
    protected void roofed() {
        house.setRoof("HighBuilding Roof");
    }
}
