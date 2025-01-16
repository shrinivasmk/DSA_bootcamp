package org.practice.binarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {

        int[] nums = {5,7,7,7,7,7,8,8,9};
        int target = 7;

        //System.out.println(searchRange(nums,target).toString());
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];

        ans[0]= serach(nums,target,true);
        if(ans[0] != -1){
            ans[1]= serach(nums,target,false);
        }
        ans[1] = -1;
        return ans;
    }

    static int serach(int[] nums, int target, boolean findStartIndex){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start <= end){
            int mid = (start + end)/2;
            if(target < nums[mid]){
                end = end -1;
            } else if (target > nums[mid]) {
                start = start +1;
            } else {
                ans = mid;
                if(findStartIndex){
                    end = end -1;
                } else {
                    start = start + 1;
                }
            }
        }
        return ans;
    }

}
