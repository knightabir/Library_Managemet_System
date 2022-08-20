package com.abir;

public class highestAltitude {
    public static void main(String[] args) {
        int[] alt ={-5,1,5,0,-7};
        System.out.println(highest(alt));
    }


    static int highest(int[] arr){
        int max = 0;
        int current= 0;

        for (int i = 0; i < arr.length; i++) {
            current+=arr[i];
            max=Math.max(current,max);
        }
        return max;
    }
}
