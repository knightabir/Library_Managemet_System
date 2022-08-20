package com.abir;

import java.util.Arrays;

public class problem566 {
    public static void main(String[] args) {
        int r = 3;
        int c = 2;
        int[][] arr = {
                {1,2,5},
                {3,4,4}
        };
//        System.out.println(arr.length+" "+arr[0].length);
        int [][] arr2 = matrixReshape(arr,r,c);
        for (int[] i : arr2){
            System.out.println(Arrays.toString(i));
        }
    }


    static int[][] matrixReshape(int[][] mat, int r, int c){
        int row_num = 0;
        int col_num = 0;
//        int[] temp = new int[r*c];
        int[][] ans = new int[r][c];
        int a = mat.length*mat[0].length;
        int b = r*c;
        if (a != b){
            return mat;
        }
        else{
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    ans[row_num][col_num]=mat[row][col];
                    col_num++;
                    if (col_num == c){
                        col_num =0;
                        row_num++;
                    }
                }
            }
        } return ans;

    }
}
