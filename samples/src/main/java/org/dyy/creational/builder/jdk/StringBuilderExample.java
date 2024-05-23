package org.dyy.creational.builder.jdk;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("world");
        stringBuilder.append("!");
        System.out.println(stringBuilder.toString());
    }
}
