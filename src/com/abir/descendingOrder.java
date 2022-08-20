package com.abir;

public class descendingOrder {
    public static void main(String[] args) {
        int[] arr = {21,32,54,65,87,98};
        int target= 87;
        int ans= search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;


        while (start<=end){
            int mid = start+(end-start)/2;

            if (target < arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
