package com.abir;

public class cheek {
    public static void main(String[] args) {
        String[] word1 = {"a","cb"};
        String[] word2 = {"ab","c"};

        System.out.println(stringCheek(word1,word2));
    }

    static boolean stringCheek(String[] word1, String[] word2){
        String a = new String();
        String b = new String();
        for (int i = 0; i < word1.length; i++) {
            a += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            b += word2[i];
        }
        return a.equals(b);
    }
}
