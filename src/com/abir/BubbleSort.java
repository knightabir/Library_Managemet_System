package com.abir;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,1,3,9,7};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                //Swap if the item is smaller than the previous item
                if (arr[j]<arr[j-1]){
                    //Swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped= true;
                }
            }
            //If it did not swap for a particular value of i, it means the array is sorted, hence stop the program
            if (!swapped) break;
        }
    }
}
