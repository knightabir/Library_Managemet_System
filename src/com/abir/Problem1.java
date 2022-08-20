package com.abir;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    static int[] twoSum(int[]nums,int target){
        int a=0; int b=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    a = i;
                    b = j;
                }
                break;
            }
        }int[] abir = {a,b};
        return abir;
    }

}
