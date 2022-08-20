package com.abir;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {4,5,4,84,4,5};
        System.out.println(findIndex(arr,5,0));
    }

    static boolean linear (int[] arr , int target,int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || linear(arr,target,index+1);
    }

    static int findIndex(int[] arr, int target,int index){
        if (index== arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }
        else {
            return findIndex(arr,target,index+1);
        }
    }
}
