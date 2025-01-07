package org.topic.oop.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("printing static block");
        b= a*5;
    }

    public static void main(String[] args) {
        System.out.println(a+ "  "+b); // static variables can be accessed in static block
        StaticBlock staticBlock =  new StaticBlock();
        staticBlock.b += 3;
        // static variables can be access directly through instance variable no need of creating an object of any reference
        System.out.println(staticBlock.a+" "+b);
    }
}
