package org.topic.oop.access;

public class SubClass extends AccessDemo {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass(23, "Shrinivas");
        System.out.println(subClass.getNum());
        //System.out.println(subClass.num);

        //System.out.println(subClass instanceof );
    }
}
