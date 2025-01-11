package org.topic.oop.interfaces.nested;

public class NestedA {
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class NestedB implements NestedA.NestedInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
