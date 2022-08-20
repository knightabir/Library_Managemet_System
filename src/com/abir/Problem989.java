package com.abir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem989 {
    public static void main(String[] args) {
        int res=0;
        int[] arr2 = {1,2,3,4,5};
        for (int i = 0; i < arr2.length; i++) {
            res= res*10+arr2[i];
        }
        int abir = res+34;
        String temp =Integer.toString(abir);
        int n = temp.length();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(temp.charAt(i));
        }
        System.out.println(Arrays.toString(new String[]{list.toString()}));
    }

}
