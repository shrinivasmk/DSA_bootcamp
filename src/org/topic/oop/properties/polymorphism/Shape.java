package org.topic.oop.properties.polymorphism;

public class Shape {

    void area(){
        System.out.println("Area is printed in the shape class");
    }

    // final methods cannot be overriden
//    void area(){
//        System.out.println("Area is printed in the shape class");
//    }


    static void greetings(){
        System.out.println("hello from super class , Greeting!");
    }
}
