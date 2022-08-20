package com.abir;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr = new int [3][3];
//        int [][] arr2D = {
//                {1,2,3}, // 0th index
//                {4,5},  // 1st index
//                {6,7,8,9} // 2nd index
//        };

        //Input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=in.nextInt();
            }
        }
        //Output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }

        // Other ways to output 2D arrays
        for (int row = 0; row< arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
