package org.practice.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {33,56,78,98,90,32,23};
        int target = 98;
       // System.out.println(linearSearchArray(array,target));
        System.out.println(linearSearchArray1(array,target));
        System.out.println(linearSearchArray2(array,target));

    }

    //return index of the target if exists or return -1
    static int linearSearchArray(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int index=0;index<arr.length;index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }

    //return element if it exists else return -1
    static int linearSearchArray1(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int index=0;index<arr.length;index++){
            if(arr[index] == target){
                return arr[index];
            }
        }
        return -1;
    }

    //return boolean value true or false
    static boolean linearSearchArray2(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        for (int index=0;index<arr.length;index++){
            if(arr[index] == target){
                return true;
            }
        }
        return false;
    }
}
