package com.abir;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target= 16 ;
        int ans = binarySearch2(arr,target);
        System.out.println(ans);
    }

    static int binarySearch2(int[] arr, int target){
        int start=0;
        int end= arr.length-1;

        while (start<=end){
            //Finding the middle element.
            int mid = start+(end-start)/2;

            if (target<arr[mid]){
                end= mid-1;
            }
            else if (target>arr[mid]){
                start= mid+1;
            }
            else{
                //Found the element
                return mid;
            }
        }
        return -1;
    }
    
}
