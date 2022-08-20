package com.abir;

public class Problem852 {
    public static void main(String[] args) {
        int[] arr = {0,5,10,2};
        System.out.println(mountain(arr));
    }


//    static int mountain(int[] arr){
//        int peak=0;
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (peak<arr[i]){
//                peak=arr[i];
//                index = i;
//            }
//        }
//        return index;
//    }

    static int mountain(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                //You are in the decreasing part of the array
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
}
