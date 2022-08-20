package com.abir;

public class examples {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        int n = nums.length;
        int[] ans= new int[n];
        for (int i = 0; i < n; i++) {
            ans[i]= nums[nums[i]];
        }
        System.out.println(ans);

    }
}
