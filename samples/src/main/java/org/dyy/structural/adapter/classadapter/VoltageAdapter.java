package org.dyy.structural.adapter.classadapter;

/**
 * 适配器类
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        // 获取到 220V 电压
        int srcV = output220V();
        return convertVoltage(srcV);
    }

    private int convertVoltage(int src) {
        return src / 44;
    }
}
