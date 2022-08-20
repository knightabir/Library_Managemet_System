package com.abir;

public class Prroblem1351 {
    public static void main(String[] args) {
        int[][] arr = {
                {3,2},
                {1,0}
        };
        System.out.println(countNegative(arr));
    }


//    static int countNegative(int[][] arr){
//        int ans = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j]<0){
//                    ans++;
//                }
//            }
//        }
//        return ans;
//    }

    static int countNegative(int[][]matrix){
        int ans =0;
        int n= matrix.length;
        int m = matrix[0].length;
        int lo = 0;
        int hi =(n*m)-1;

        while (lo<=hi){
            int mid = (lo+(hi-lo)/2);
            if (matrix[mid/m][mid%m] <0){
                ans++;
            }
            else if (matrix[mid/m][mid%m]<0){
                lo =mid+1;
            }
            else {
                hi = mid-1;
            }
        }
        return ans;
    }
}
