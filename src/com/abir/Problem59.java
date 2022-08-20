package com.abir;

import java.util.Arrays;

public class Problem59 {
    public static void main(String[] args) {
        int[][] abir = matrixForm(3);
        for (int[] i : abir){
            System.out.println(Arrays.toString(i));
        }
    }


    static int [][] matrixForm(int n){
        if (n==1){
            int[][] ans1 = {
                    {1}
            };
            return  ans1;
        }
        int[][] ans = new int[n][n];
        int a =1;
        int top = 0;
        int bottom = ans.length-1;
        int left =0;
        int right = ans[0].length-1;

        while (top<=bottom && left<=right){
            for (int i = left; i <= right; i++) {
                ans[top][i]=a;
                a++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans[i][right]=a;
                a++;
            }
            right--;

            if (top <= bottom){
                for (int i = right; i >= left; i--) {
                    ans[bottom][i]=a;
                    a++;
                }
                bottom--;
            }
            if (left<=right){
                for (int i = bottom; i >= top; i--) {
                    ans[i][left]= a;
                    a++;
                }
                left++;
            }
        }
        return ans;

    }

}
