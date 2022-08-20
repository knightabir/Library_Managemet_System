package com.abir;

public class fibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibonacciSeries1(7));
    }


    static int fibonacciSeries1(int n){
        // Base condition
        if (n<2) return n;

        return fibonacciSeries1(n-1)+fibonacciSeries1(n-2);
    }
}
