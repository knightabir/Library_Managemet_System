package com.abir;

public class Problem53 {
    public static void main(String[] args) {
        int[] arr = {-2,-1};
        System.out.println(maxSubarray(arr));
    }

    static int maxSubarray(int[] nums){
        int maxsum= 0;
        int cursum =0;
        for (int i = 0; i < nums.length; i++) {
            int a=0;
            a= a+nums[i];

            if (a<0){
                return -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            cursum = cursum+nums[i];
            if (cursum>maxsum){
                maxsum=cursum;
            }
            if (cursum<0){
                cursum=0;
            }
        }
        return maxsum;
    }
}
