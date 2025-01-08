package org.topic.oop.interfaces.ExtendDemo2;

public class Main implements A,B{
    @Override
    public void greetings() {
        System.out.println("main class");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.greetings();
        A.greetings(); // static methods from interface can be called using class name
    }
}
