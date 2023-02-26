package org.dyy.dp.principle.singleresponsibility.solution1;

/**
 * 方案1
 * 1. 违反了单一职责原则
 * 2. 改进：为不同的交通工具创建不同的类 -> 方案2
 */
public class MainActivity {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("motorbike");
        vehicle.run("car");
        vehicle.run("plane"); // 逻辑错误
    }
}
