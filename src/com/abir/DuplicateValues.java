package com.abir;
// Do it after It's important matter for your interview

public class DuplicateValues {
    public static void main(String[] args) {
        int[] abir = {2,2,54,87,54};
        duplicate(abir);
    }

    static void duplicate(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("The duplicate Element is : "+ i);
                }
            }
        }
    }
}
