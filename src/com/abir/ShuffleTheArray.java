package com.abir;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(shuffle(nums,n));
    }

    static int[] shuffle (int[] arr,int n){
        int[] ans = new int[2*n];
        int j=0;
        for (int i = 0; i < 2*n; i=i+2) {
            ans[i]=arr[j];
            ans[i+1]= arr[j+n];
            j++;
        }
        return arr;
    }
}
