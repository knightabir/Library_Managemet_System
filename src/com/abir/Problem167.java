package com.abir;

import java.util.Arrays;

public class Problem167 {
    public static void main(String[] args) {
        int[] arr= {2,7,11,15,49};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }

    static public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while (start<=end){
            int sum = numbers[start]+numbers[end];
            if (sum == target){
                return new int[]{start+1,end+1};
            }
            if (sum>target){
                end--;
            }else {
                start++;
            }
        }
        return numbers;
    }
}
