package org.practice.binarySearch;

public class CeilingOfNumber {
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid ;
        //int ceilingNo = 0;

        while(start <= end){
            mid  = (start + end)/2;
            if(arr[mid] < target){
                start = mid+1;
            } else if(arr[mid] > target){
                end = mid -1;
                //ceilingNo = arr[mid];
            } else {
                return mid;
            }
        }
       // return ceilingNo;
        return start;
    }

    public static void main(String[] args) {
        int[] arr ={3,5,7,9,11,34,56,78,90};

        int[] arr2 ={2,4,6,8,10,12,14,16};
        int target = 13;

        int ans = search(arr,target);
        System.out.println(ans);
    }
}
