package org.practice.linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {34,67,54,35,78,44,99,39,65};
        int start = 2;
        int end = 5;
        int target = 39;
        System.out.println(search(arr,start,end,target));

    }

    //return index
    static int search(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
