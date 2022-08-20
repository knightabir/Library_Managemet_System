package com.abir;

import java.util.Arrays;

public class flipArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int [] i : flip(arr)) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] flip (int [][] arr){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int temp = arr[row][col];
                arr[row][col]=arr[row][arr[0].length-1];
                arr[row][arr[0].length-1]=temp;
            }
        }
        return arr;
    }
}
