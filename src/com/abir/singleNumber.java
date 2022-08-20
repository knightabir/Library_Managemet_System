package com.abir;

public class singleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(ans(nums));
    }

    static int ans (int[] nums){
        int ans = 0;
        for (int n : nums)
        {
            ans ^= n;
        }
        return ans;
    }
}
