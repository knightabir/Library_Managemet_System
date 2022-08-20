package com.abir;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        //First Array
        int [] a = {10,12,15,14};
        //Second Array
//        int [] b = {21,25,26,24};
        //Determines the length of first Array
        int a1=a.length;
        //Determines the length of second Array
        int b1=a.length;
        //Resultant Array Size
        int c1= a1+b1;
        //Creating the resultant array
        int [] c=new int[c1];
        //Using pre-defined function arraycopy
        System.arraycopy(a,0,c,0,a1);
        System.arraycopy(a,0,c,a1,a1);
        //printing the resultant array
        System.out.println(Arrays.toString(c));
    }
}
/*

 */