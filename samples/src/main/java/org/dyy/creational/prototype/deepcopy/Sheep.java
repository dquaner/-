package org.dyy.creational.prototype.deepcopy;

import org.dyy.creational.prototype.uc.Color;

import java.io.*;

public class Sheep implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private Color color;
    private Sheep friend;

    public Sheep(String name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Sheep getFriend() {
        return friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color=" + color +
                ", friend=" + friend.hashCode() +
                '}';
    }

    /**
     * 深拷贝的第一种实现方法，重写 `clone()` 方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
        if (friend != null) {
            sheep.setFriend((Sheep) friend.clone());
        }
        return sheep;
    }

    /**
     * 深拷贝的第二种实现方法，对象序列化（推荐）
     */
    protected Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (bis != null) {
                    bis.close();
                }
                if (oos != null) {
                    oos.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
