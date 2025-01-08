package org.topic.oop.interfaces.ExtendDemo2;

public interface A {

    // static interface methods should always have a body
    // call via the interface name
    static void greetings(){
        System.out.println("Hey");
    }

    default void fun(){
        System.out.println("fun");
    }
}
