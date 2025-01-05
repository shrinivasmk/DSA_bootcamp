package org.algoExpert.arrays;

import java.util.Arrays;

public class TwoNumberSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(twoSumNum(arr,10)));
    }

    public static int[] twoSumNum(int[] arr, int target){
        int sum;
        for(int i = 0;i < arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                sum = arr[i] + arr[j];
                if(sum == target){
                    return new int[]{arr[i],arr[j]};
                }
            }
        }
        return new int[0];
    }
}
