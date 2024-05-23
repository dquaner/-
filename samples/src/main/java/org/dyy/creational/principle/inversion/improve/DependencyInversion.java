package org.dyy.creational.principle.inversion.improve;

/**
 * 方式2
 */
public class DependencyInversion {
    public static void main(String[] args) {
        // 客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Wechat());
    }
}

