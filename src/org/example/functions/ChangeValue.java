package org.example.functions;

import java.util.Arrays;


public class ChangeValue {


    int a;
    public static void main(String[] args) {
        int[] arr = {1,23,6,88,67};
        changeNum(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeNum(int[] num){
        num[0] = 99;

        int a;
        for (int i =0;i<num.length; i++){
            //int a = 22;
            if (i==4){
                num[i]= 22;
            }
        }
    }
}
