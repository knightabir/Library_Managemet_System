package com.abir;

public class FindNumberWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumber(nums));
    }


    static int findNumber(int[] nums){
        int count=0;
        for(int num: nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    static int digits (int num){
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    //Function to check weather a number contains even number or not
    static boolean even(int num){
        int numerOfDigits= digits(num);
        if (numerOfDigits % 2 ==0){
            return true;
        }
        return false;
    }
}
