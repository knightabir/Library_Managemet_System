package com.abir;

public class binarySearch2 {
    static int bs(int[] arr,int s,int e,int x){
        if (e>=s){
            int mid = e+(s-e)/2;

            if (arr[mid] == x) return mid;

            if (arr[mid]<x){
                return bs(arr,mid+1,e,x);
            }
            return bs(arr,s,mid-1,x);
        }
            return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,10,40};
        System.out.println(bs(arr,0, arr.length -1,10));
    }
}
