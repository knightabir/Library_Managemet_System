package com.abir;

public class printWithoutLoops {
    public static void main(String[] args) {
        print(10,1);

    }
//    static void  print2(int n){
//        if ()
//    }
    static void print(int n,int i){
//        i=1;
        if (i==n+1) return;
        System.out.println(i);
        print(n,i+1);
    }
}
