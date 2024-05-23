package org.dyy.creational.prototype.uc;

import java.util.stream.IntStream;

public class Client {
    public static void main(String[] args) {
        Sheep prototype = new Sheep("Tom", 1, Color.WHITE);
        Sheep[] sheep = new Sheep[10];
        IntStream.range(0, 10).forEach(i -> {
            sheep[i] = new Sheep(prototype.getName(), prototype.getAge(), prototype.getColor());
            System.out.printf("%s: %s%n", i, sheep[i]);
        });
    }
}
