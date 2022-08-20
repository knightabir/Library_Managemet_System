package com.abir;

import java.util.ArrayList;
import java.util.List;

public class Problem448 {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(sort(arr));
    }

    static List<Integer> sort(int[] arr){
            List<Integer> list = new ArrayList<>();
            int i =0;
            while (i<arr.length){
                int correct = arr[i]-1;
                if (arr[i] !=arr[correct]){
                    swap(arr,i,correct);
                }
                else i++;
            }

            for (int index = 0; index < arr.length; index++) {
                if (arr[index]-1 != index){
                    list.add(index+1);
                }
            }
            return list;
        }

        static void swap(int[] arr , int first, int last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last]=temp;
        }
}
