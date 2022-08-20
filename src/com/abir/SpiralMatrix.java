package com.abir;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int r=3;
        int c =3;
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        System.out.println(Arrays.toString(spiral(arr,r,c)));
    }


    static List<Integer> spiral(int[][] matrix){
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0;
        int bot = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while (top<=bot && left<=right){
            for (int i = left; i <= right; i++) {
                ans.add( matrix[top][i]);

            }
            top++;

            for (int i = top; i <= bot; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            if (top<=bot){
                for (int i = right; i >= left; i--) {
                    ans.add (matrix[bot][i]);
                }
                bot--;
            }
            if (left<=right){
                for (int i = bot; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;

    }
}
