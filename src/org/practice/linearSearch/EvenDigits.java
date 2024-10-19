package org.practice.linearSearch;

public class EvenDigits {
    static int findDigits(int[] nums){
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int digit = getDigit(num);
         return digit % 2 ==0;
    }

    static int getDigit(int num){
        int count = 0;

        while(num>0){
            num = num /10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {23,456,6,9,87,95876, 8888};
        System.out.println(findDigits(nums));
        System.out.println(getDigit(999));
        System.out.println(even(99));
    }
}
