package com.abir;

import java.util.LinkedList;
import java.util.List;

public class Problem54 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new LinkedList<>();
        int rowStart = 0, rowEnd = matrix.length-1;
        int colStart = 0, colEnd = matrix[0].length-1;
        while(rowStart <= rowEnd && colStart <= colEnd) {
            for(int i=colStart;i<=colEnd;i++) {
                spiral.add(matrix[rowStart][i]);
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++) {
                spiral.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowStart <= rowEnd) {
                for(int i=colEnd;i>=colStart;i--) {
                    spiral.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            if(colStart <= colEnd) {
                for(int i=rowEnd;i>=rowStart;i--) {
                    spiral.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        return spiral;
    }
}
