package org.practice.linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3,8,2,5},
                {23,6,91,102},
                {4,62,57}
        };
        int target = 62;
        System.out.println(Arrays.toString(search(arr,target)));

        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr){
        if (arr.length == 0 ){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
