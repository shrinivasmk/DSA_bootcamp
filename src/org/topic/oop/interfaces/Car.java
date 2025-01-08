package org.topic.oop.interfaces;

public class Car implements Engine,Brakes,Media{

    @Override
    public void start(){
        System.out.println("I'll start the normal car");
    }

    @Override
    public void stop(){
        System.out.println("I'll stop the normal car");
    }

    public void acc(){
        System.out.println("I'll accelerate the normal car");
    }

    @Override
    public void brake() {
        System.out.println("I'll brake the normal car");
    }
}
