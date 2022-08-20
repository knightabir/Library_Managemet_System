package com.abir;

public class xor {

    public static void main(String[] args){
        int[] arr = {1,2,5,4,1,2,4,7};

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
           ans = arr[i]^arr[0];
        }


//        System.out.println( 6 & -6 );
        ans = (ans & -ans);
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & ans) > 0){
                sum1 = (sum1^arr[i]);
            }
            else{
                sum2 = sum2^ arr[i];
            }
        }


        System.out.println(sum1 + " " + sum2);
    }

}
