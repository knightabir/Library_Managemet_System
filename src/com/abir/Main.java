package com.abir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);

        // taking input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }

        // printing Arrays Using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");

        }
    }
}