package com.abir;

import java.util.Arrays;

public class Problem34 {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int target = 0;

        System.out.println(Arrays.toString(searchRange(arr, target)));
    }


    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans[0] = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}
