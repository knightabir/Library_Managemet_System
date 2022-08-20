package com.abir;

import java.util.Arrays;
// here I am using two pointer method to reverse an array

public class RevarseArray {
    public static void main(String[] args) {
        int[] abir = {5,5,4,81,87,7,5};
        System.out.println(Arrays.toString(abir));
        revarse(abir);
        System.out.println(Arrays.toString(abir));
    }

// Using while loop for reverse the element of the array
    static  void revarse (int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    // Swapping two values inside the array. for reversing the array
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
