package org.dyy.dp.builder.uc;

public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        basic = "CommonHouse Basic";
    }

    @Override
    public void buildWalls() {
        wall = "CommonHouse Wall";

    }

    @Override
    public void roofed() {
        roof = "CommonHouse Roof";
    }

    @Override
    public String toString() {
        return "CommonHouse{" +
                "basic='" + basic + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
