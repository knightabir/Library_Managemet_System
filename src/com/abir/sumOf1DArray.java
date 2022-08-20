package com.abir;

import java.util.Arrays;
//class Solution {
//    public int[] runningSum(int[] nums) {
//        int len = nums.length;
//        int[] res = new int[len];
//        res[0] = nums[0];
//
//        for (int i = 1; i < len; i++) {
//            res[i] = res[i - 1] + nums[i];
//        }
//
//        return res;
//    }
//}

//private class abir<i> {
//    int [] nums={1,2,3,4};
//    int len = nums.length;
//    int[] res = new int[len];
////    res[0]=nums[0];
//    for(int i =1; i<len;i++){
//
//    }
//}

public class sumOf1DArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int n = nums.length;
        int [] res = new int[n];
        res[0]= nums[0];
        for (int i = 1; i <n; i++) {
            res[i]=res[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
