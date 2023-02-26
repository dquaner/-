package org.dyy.dp.builder.uc;

public class HighBuilding extends AbstractHouse {
    @Override
    public void buildBasic() {
        basic = "HighBuilding Basic";
    }

    @Override
    public void buildWalls() {
        wall = "HighBuilding Wall";

    }

    @Override
    public void roofed() {
        roof = "HighBuilding Roof";
    }

    @Override
    public String toString() {
        return "HighBuilding{" +
                "basic='" + basic + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
