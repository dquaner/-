package org.dyy.creational.principle.singleresponsibility.solution3;

/**
 * 方案3
 * 1. 这种修改方法没有对原来的类做大的修改，只是增加方法
 * 2. 虽然没有在类这个级别上遵守单一职责原则，但在方法级别上，仍然遵守了单一职责
 */
public class MainActivity {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.runRoad("car");
        vehicle.runAir("plane");
        vehicle.runWater("boat");
    }
}


