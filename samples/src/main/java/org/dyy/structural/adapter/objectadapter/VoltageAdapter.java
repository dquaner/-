package org.dyy.structural.adapter.objectadapter;

/**
 * 适配器类
 */
public class VoltageAdapter implements Voltage5V {
    private final Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        // 获取到 220V 电压
        if (voltage220V != null) {
            System.out.println("Using object adapter to convert voltage.");
            int srcV = voltage220V.output220V();
            dst = convertVoltage(srcV);
        }
        return dst;
    }

    private int convertVoltage(int src) {
        return src / 44;
    }
}
