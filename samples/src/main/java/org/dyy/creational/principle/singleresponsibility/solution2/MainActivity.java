package org.dyy.creational.principle.singleresponsibility.solution2;

/**
 * 方案2
 * 1. 遵守单一职责原则
 * 2. 但是这样做改动很大，即将类分解，同时要修改客户端
 * 3. 改进：直接修改 Vehicle 类，改动的代码比较少 -> 方案3
 */
public class MainActivity {
    public static void main(String[] args) {
        RoadVehicle roadvehicle = new RoadVehicle();
        roadvehicle.run("motorbike");
        roadvehicle.run("car");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("plane");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("boat");
    }
}
