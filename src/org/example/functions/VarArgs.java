package org.example.functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {

    //varArgs
    static void printNum(int ...num){
        System.out.println(Arrays.toString(num));
    }

    public static void main(String[] args){
        printNum(1,2,3,4,5,6);
        printNum(7,8,6);
    }
}
