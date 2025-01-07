package org.topic.oop.properties.polymorphism;

public class MainPoly {

    public static void main(String[] args) {
        Shape obj1 = new Shape();
        obj1.area();
        //obj1.greetings();

        Shape obj2 = new Circle();
        obj2.area();
        //obj2.greetings();


        Circle obj3 = new Circle();
        obj3.area();
        obj3.area(2,2);
        obj3.area(2,3,"white");
    }

}
