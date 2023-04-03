package org.dyy.dp.adapter.objectadapter;

/**
 * 被适配的类
 */
public class Voltage220V {
    /**
     * Output 220V voltage.
     * @return 220V voltage
     */
    public int output220V() {
        int src = 220;
        System.out.printf("Voltage is %sV.\n", src);
        return src;
    }
}
