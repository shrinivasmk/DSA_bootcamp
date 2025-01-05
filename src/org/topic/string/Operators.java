package org.topic.string;

import java.util.Arrays;

public class Operators {
    public static void main(String[] args) {
        int num = 10;
        char ch = 'g';
        String string= "Word";
        int[] arr = {1,2,3,4,5,6};

        System.out.println(num + ch);
        System.out.println(string + ch);
        System.out.println(string + Arrays.toString(arr)); // for arrays we need convert it to toString with th help of Arrays function.
        System.out.println(56);
        System.out.println(Arrays.toString(new int[]{1, 2, 5, 8, 0}));
    }
}
