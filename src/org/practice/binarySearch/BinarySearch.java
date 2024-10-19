package org.practice.binarySearch;

public class BinarySearch {

    //return index of target
    //return -1 if element is not found
    //for ascending order
    static int binSearchAsc(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        int mid;

        if(arr.length == 0){
            return -1;
        }


        while(start <= end){
            //mid = (start + end )/2;
            mid = start + (end - start)/2;
            if (target > arr[mid]) {
                start = mid+1;
            } else if (target < arr[mid]) {
                end = mid -1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binSearchDesc(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        int mid;

        if(arr.length == 0){
            return -1;
        }


        while(start <= end){
            //mid = (start + end )/2;
            mid = start + (end - start)/2;
            if (target > arr[mid]) {
                end = mid-1;
            } else if (target < arr[mid]) {
                start = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrAsc = {2,5,7,9,13,16,19,22,29,99,1000,1234};
      //  int[] arr = {123};
        int target = 9;
        System.out.println(binSearchAsc(arrAsc,target));

        int[] arrDesc = {99,88,77,66,55,44,33,22,11,1};
        int desc = binSearchDesc(arrDesc,77);
        System.out.println(desc);
    }
}
