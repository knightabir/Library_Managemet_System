package com.abir;

public class Problem441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
    }

    static int arrangeCoins(int n) {
        int rowCount = 0;
//        if (n==1){
//            return 1;
//        }
        while (n>=0){
            rowCount++;
            n= n-rowCount;
        }
        if (rowCount==0){
            return rowCount;
        }
        return rowCount-1;
    }

}
