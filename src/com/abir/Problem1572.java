package com.abir;

public class Problem1572 {
    public static void main(String[] args) {
        int ans =0;
//        int n = mat.length;
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            ans+=mat[i][i] + mat[i][n-i-1];

            System.out.println(ans);
        }
        if (n%2 == 1){
            ans-=mat[n/2][n/2];
        }
        System.out.println(ans);
    }
}
