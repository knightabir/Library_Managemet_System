package com.abir;

public class Problem1295 {
    public static void main(String[] args) {
        int[] arr ={12,345,2,6,7896};
        System.out.println(even(arr));
    }

    static int even (int[] arr){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 ==0){
                count++;
            }
        }
        return count;
    }
}
