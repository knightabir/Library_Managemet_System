package com.abir;

public class Probelm1886 {
    public static void main(String[] args) {
            int[][] a = {{0,0,0},{0,1,0},{1,1,1}};
            int[][] b = {{1,1,1},{0,1,0},{0,0,0}};

        System.out.println(rotation(a,b));
    }

    private static boolean rotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (same(mat,target)){
                return true;
            }
            mat= rotate(mat);
        }
        return false;

    }

    private static boolean same(int[][] mat, int[][] target) {
        if (mat.length == target.length && mat[0].length==target[0].length){
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] != target[i][j])
                        return false;
                }
            }
        }
        return true;
    }

    private static int[][] rotate(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] b = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[j][n-i-1]=mat[i][j];
            }
        }
        return b;
    }
}
