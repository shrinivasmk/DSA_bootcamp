package org.topic.oop.abstractDemo;


import java.util.ArrayList;
import java.util.LinkedList;

// abstract class can implement interface
public abstract class Parent extends GrandParents {
    int  age;


    // abstract class need not implememnt or override the methods form super class if the class is declared with abstract
    Parent(int age){
        super();
        this.age = age;
    }

    LinkedList<String> ints = new LinkedList<String>();

    ArrayList<String> list = new ArrayList<>();

    //abstract void property();

    static void staticMethod(){

    }

    abstract void career();

    abstract void partner();
}
