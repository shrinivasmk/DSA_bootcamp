package org.topic.oop.staticExample;

public class Human {
    int age;
    String name;
    boolean married;
    static long population;

    void message(){
        System.out.println("hello world");
    }

    public Human(int age, String name, boolean married) {
        this.age = age;
        this.name = name;
        this.married = married;
        Human.population += 1;
    }
}
