package org.topic.oop.singleton;

import org.topic.oop.access.AccessDemo;

public class SubClass extends AccessDemo {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public void show(){
        SubClass subClass = new SubClass(22,"Shrinivas");
        subClass.display();
        display();
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass(22,"Shrinivas");
        subClass.display();
        System.out.println(subClass.name);

        subClass.show();
    }
}

class SubClass2 extends AccessDemo{
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo(34,"rohit");
        //obj.numm;
        // cannot protected member in with the help on superclass reference;
    }
}