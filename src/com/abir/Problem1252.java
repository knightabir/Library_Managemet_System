package com.abir;

import java.util.Arrays;

public class Problem1252 {
    public static void main(String[] args) {
        int count = 0;
        int m=2;
        int n =3;
        int[][] arr =new int[m][n];

        int[][] indices = {
                {0,1},
                {1,1}
        };

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < n; j++) {
                arr[indices[i][0]][j]++;
            }
            for (int j = 0; j < m; j++) {
                arr[j][indices[i][1]]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2 !=0){
                    count++;
                }
            }
        }


        System.out.println(count);
        for (int[] i : arr){
            System.out.println(Arrays.toString(i));
        }

    }

}
