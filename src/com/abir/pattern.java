package com.abir;

public class pattern {
    public static void main(String[] args) {
        Pattern5(9);
    }

    static void Pattern1(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern2(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern3(int a){
        for (int i = a; i > 0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void Pattern4(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void Pattern5(int a ){
        int mid = a/2;

        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a; i > mid ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
