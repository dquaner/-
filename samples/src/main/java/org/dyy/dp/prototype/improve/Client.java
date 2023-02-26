package org.dyy.dp.prototype.improve;

import org.dyy.dp.prototype.uc.Color;
import java.util.stream.IntStream;

public class Client {
    public static void main(String[] args) {
        Sheep prototype = new Sheep("Tom", 1, Color.WHITE);
        Sheep[] sheep = new Sheep[10];
        IntStream.range(0, 10).forEach(i -> {
            // 使用原型模式的一个优势：
            // 如果 Sheep 的构造函数发生了变化，Client 的代码不受影响
            try {
                sheep[i] = (Sheep) prototype.clone();
                System.out.printf("%s: %s%n", i, sheep[i]);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        });
    }
}
