package com.abir;

public class problem69 {
    public static void main(String[] args) {
        int x= 2147395599;
        System.out.println(sqrt(x));
    }

    static int sqrt(int x){
        int start = 0;
        int end = x;
        int ans =-1;
        while (start<=end){
            long mid = start+(end-start)/2;
            if (mid*mid == x){
                return (int)mid;
            }else if (mid*mid < x){
                ans =(int) mid;
                start =(int)mid+1;
            }else {
                end=(int) mid-1;
            }
        }
        return ans;
    }
}
