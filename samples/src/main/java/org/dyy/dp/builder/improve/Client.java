package org.dyy.dp.builder.improve;

public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        System.out.println(houseDirector.constructHouse());

        houseDirector.setHouseBuilder(new HighBuilding());
        System.out.println(houseDirector.constructHouse());
    }
}
