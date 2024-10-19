package org.example.functions;

public class Main {
    public static void main(String[] args){
        int sum = addSum(3,7);
        System.out.println(sum);
        String name = "Shrinivas";
        //String greeting = greet(name);
        //System.out.println(greeting);
        greet("Shrinivas");
    }

    static int addSum(int a,int b){
        int sum = a+b;
        return sum;
    }

    static void greet(String name){
        String greeting = "Hello "+name;
        System.out.println("Hello "+name);
        //return greeting;
    }
}
