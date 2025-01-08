package org.topic.oop.abstractDemo;

public abstract class Parent extends GrandParents {
    int  age;


    // abstract class need not implememnt or override the methods form super class if the class is declared with abstract
    Parent(int age){
        super();
        this.age = age;
    }

    //abstract void property();

    static void staticMethod(){

    }

    abstract void career();

    abstract void partner();
}
