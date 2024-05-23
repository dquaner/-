package org.dyy.creational.principle.inversion.uc;

/**
 * 方式1
 * 1. 简单，比较容易想到
 * 2. 如果我们获取的对象是微信，短信等，则要新增类，同时 Person 类要增加相应的接受方法
 * 3. 解决思路：引入一个抽象的接口 IReceiver，Person 类与接口 IReceiver 发生依赖，
 *    因为 Email，WeChat 等都属于接收的范围，他们各自实现 IReceiver 接口即可，这样做符合依赖倒置原则
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

