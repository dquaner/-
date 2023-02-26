package org.dyy.dp.prototype.deepcopy;

import org.dyy.dp.prototype.uc.Color;
import java.util.stream.IntStream;

public class Client {
    public static void main(String[] args) {
        Sheep prototype = new Sheep("Tom", 1, Color.WHITE);
        prototype.setFriend(new Sheep("Jack", 2, Color.BLACK));
        Sheep[] sheep = new Sheep[10];
        IntStream.range(0, 5).forEach(i -> {
            try {
                sheep[i] = (Sheep) prototype.clone();
                System.out.printf("%s: %s%n", i, sheep[i]);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        });
        IntStream.range(5, 10).forEach(i -> {
            sheep[i] = (Sheep) prototype.deepClone();
            System.out.printf("%s: %s%n", i, sheep[i]);
        });
    }
}
