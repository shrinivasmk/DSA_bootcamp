package org.topic.oop.abstractDemo;

public class Daughter extends Parent{

    Daughter(int age){
        super(age);
    }

    @Override
    void career(){
        System.out.println("I want to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Iron Man ");
    }

    @Override
    void property() {

    }
}
