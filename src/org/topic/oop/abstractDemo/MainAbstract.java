package org.topic.oop.abstractDemo;

public class MainAbstract {
    public static void main(String[] args) {

        // Cannot create an object of an abstract class
        Parent p1 = new Son(24);
        p1.career();

        GrandParents gp = new Son(23);
        gp.property();


        // cannot create a object of abstract class
        //GrandParents gp1 = new Parent(23);


    }
}
