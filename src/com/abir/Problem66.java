package com.abir;

import java.util.Arrays;

public class Problem66 {
    public static void main(String[] args) {
        int[] abir = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//        int a = count(abir);
        System.out.println(Arrays.toString(plusOne(abir)));
    }
    static int[] plusOne (int[] digits){
        int n = digits.length;
        for (int i = n-1; i >=0; i--) {
            if (digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]= 0;
        }
        int[] new_number = new int[n+1];
        new_number[0] = 1;
        return new_number;
    }
}
