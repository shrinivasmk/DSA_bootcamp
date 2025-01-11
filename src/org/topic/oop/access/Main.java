package org.topic.oop.access;

public class Main {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo(23, "Shrinivas");
        obj.getNum();
        obj.setNum(33);
        System.out.println(obj.name);
    }
}
