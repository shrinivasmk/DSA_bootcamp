package org.topic.oop.properties.polymorphism;

public class Square extends Shape {

    void area() {
        System.out.println("Area is printed in Circle");
    }

    static void greetings(){
        
        System.out.println("hello from subclass Square , Greeting!");
    }
}
