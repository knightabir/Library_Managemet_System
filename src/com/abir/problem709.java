package com.abir;

import java.util.Arrays;
import java.util.Locale;

public class problem709 {
    public static void main(String[] args) {
//        String vowels = "aeiouAEIOU";
//        String s = "LOveLy Boy";
////        s.toLowerCase(Locale.ROOT);
////        System.out.println(s.toLowerCase());
//        String str = "Abir#is#a#good#boy";
//        String[] arrstr = str.split("#",5);
//        System.out.println(Arrays.toString(arrstr));
        String str = "textbook";
        System.out.println(problem(str));


    }
    static boolean problem (String s){
        String vowels = "aeiouAEIOU";
        int mid =s.length()/2, ans =0;
        for (int i = 0, j =mid; i <mid ; i++,j++) {
            if (vowels.indexOf(s.charAt(i))>=0) ans++;
            if (vowels.indexOf(s.charAt(j))>=0) ans--;
        }
        return ans==0;
    }
}
