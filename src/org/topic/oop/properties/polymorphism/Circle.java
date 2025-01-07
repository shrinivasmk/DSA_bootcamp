package org.topic.oop.properties.polymorphism;

public class Circle extends Shape {

    void area() {
        System.out.println("Area is printed in Circle");

    }

    void area(int noOfItems, double diameter){
        System.out.println("number of circles "+noOfItems);
        System.out.println("diameter of the circle "+diameter);
    }

    void area(int noOfItems, double diameter, String color){
        System.out.println("number of circles = "+noOfItems+" diameter = "+diameter+" color = "+color);
    }

    // static methods cannot be overriden
    static void greetings(){
        System.out.println("hello from subclass circle , Greeting!");
    }
}
