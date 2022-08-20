package com.abir;

import java.util.Arrays;

public class Problem867 {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {4,5,6}
        };
        int n = arr.length;
        int m = arr[0].length;
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = arr[j][i];
            }
        }







        for (int[] i:ans){
            System.out.println(Arrays.toString(i));
        }
    }
}
