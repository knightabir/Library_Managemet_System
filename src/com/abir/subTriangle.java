package com.abir;

import java.util.Arrays;

public class subTriangle {

    static void sum(int[] arr){
        if (arr.length<1) return;
        int n = arr.length;
        int[] temp = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            int a = arr[i]+arr[i+1];
            temp[i] = a;
        }

        sum(temp);

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        sum(arr);
    }
}
