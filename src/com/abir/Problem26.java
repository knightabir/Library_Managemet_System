package com.abir;

public class Problem26 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(duplicate(arr));
    }
    
    
    static int duplicate (int[] nums){
        int ans =0;
        for (int i = 0; i < nums.length; i++) {
            if (i<nums.length-1 && nums[i] == nums[i+1]){
                continue;
            }
            nums[ans]= nums[i];
            ans++;
        }
        return ans;
    }
}
