package com.abir;

public class Problem1095 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(findInMountainArray(3,arr));
    }


    static int findInMountainArray(int target , int[] arr){
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== target){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
