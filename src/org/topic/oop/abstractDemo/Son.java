package org.topic.oop.abstractDemo;

public class Son extends Parent{

    Son(int age){
        super(24);
        //this.age = age;
    }

    @Override
    void career() {
        System.out.println("I want to become a engineer");
    }

    @Override
    void partner() {
        System.out.println("I love pepper pots");
    }

    @Override
    void property() {
        System.out.println("property is called ");
    }
}
