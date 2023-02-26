package org.dyy.dp.builder.improve;

public class House {
    protected String basic;
    protected String wall;
    protected String roof;

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "basic='" + basic + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
