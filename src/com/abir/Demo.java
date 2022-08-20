package com.abir;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int temp = arr[row][col];
                arr[row][col]=arr[row][arr[row].length-1];
                arr[row][arr[row].length-1]=temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
                if (arr[i][j]==0){
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }


        for(int[] i:arr){
            System.out.println(Arrays.toString(i));
        }
    }
}
