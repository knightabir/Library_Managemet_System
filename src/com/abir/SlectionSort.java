package com.abir;

import java.util.Arrays;

public class SlectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        slect(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void slect(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
