package com.abir;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {12,25,2,4,26,8,2};
        swap (arr, 0,1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
