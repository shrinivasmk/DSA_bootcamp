package org.practice.binarySearch;

public class OrderAgnosticBS {

    public static void main(String[] args) {
        int[] asc = {1,2,3,4,5,5,6,7,9};
        int[] desc = {9,8,7,6,6,5,5,4,3,2,1};

        int target = 8;

        System.out.println(search(asc,target));
        System.out.println(search(desc,target));
    }

    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            //mid = (start + end )/2;
            mid = start + (end - start)/2;

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid+1;
                } else if (target < arr[mid]) {
                    end = mid -1;
                } else {
                    return mid;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid+1;
                } else if (target > arr[mid]) {
                    end = mid -1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

}
