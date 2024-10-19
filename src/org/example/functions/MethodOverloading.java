package org.example.functions;

import java.util.Arrays;

public class MethodOverloading {

    static void greeting(String greet){
        System.out.println(greet);
    }

    static void greeting(String name, String greet){
        System.out.println(name + " "+greet);
    }

    static void greet(){
        System.out.println("empty");
    }

    static void greeting (String ...greet){
        System.out.println(Arrays.toString(greet));
    }

    static void sum(){
        System.out.println("sum");
    }

    static  void sum(int a, int b){
        System.out.println(a+b);
    }

    static void sum(int a,int b, int c){
        System.out.println(a+b+c);
    }

    static void sum(int ...num){
        int res = 0;
        for(int i=0;i<num.length; i++){
            res = res + num[i];
        }
        System.out.println(res);
    }


    public static void main(String[] args){
        greeting("hello");
        greeting("Shrinivas","Hello");
        greeting("How", "are","you","doing");
        greeting();

        sum();
        sum(2,5);
        sum(55,6,77);
        sum(23,77,98,66);

    }
}
