package com.abir;

public class minimum {
    public static void main(String[] args) {
        int[] abir= {4,5,4,8,4,5,7,254};
        System.out.println(min(abir));

    }
//Functions to find the maximum value element of the array
    static int min(int[] arr){
        //setting the maximum value 0 at the beginning of the program.
        int max_val=0;
        //Running a for loop to iterate each element of the array.
        for (int i = 0; i < arr.length; i++) {
            if (max_val<arr[i]){
                max_val=arr[i];// increasing the maximum value to the new maximum value in the array
            }
        }
        return max_val;
    }
}
