package com.abir;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr= {2,5,8,4,6,8,7,24};
        System.out.println("The maximum value of the array is : "+max(arr));
        System.out.println("The maximum in the rage is : "+ maxRange(arr,2,5));
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    // Find the maximum in a range
    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
