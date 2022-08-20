package com.abir;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        int start = 0;
        int end = arr.length-1;
        sd(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
    static void sd(char[] arr, int start, int end){
        if (end<start) return;
        // Swapping Code Starts Here
        char temp = arr[start];
        arr[start]=arr[end];
        arr[end] = temp;
        //Swapping code Ends here
        sd(arr,start+1,end-1); // Here i make the recursive call by increasing by one index and decreasing by one index.
    }
}
