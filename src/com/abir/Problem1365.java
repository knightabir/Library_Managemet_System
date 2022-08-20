package com.abir;

import java.util.Arrays;

public class Problem1365 {
    public static void main(String[] args) {
        int [] arr= {8,1,2,2,3};
        int[] ans = sol(arr);
        System.out.println(Arrays.toString(ans));
//        System.out.println(Arrays.toString(arr));
    }

    static int[] sol(int [] arr){
        int n = arr.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            int count =0;
            for (int j = 0; j < n; j++) {
                if (nums[i]>nums[j] && i!=j){
                    count++;
                }
            }
            nums[i]=count;
        }
        return nums;
    }
}
