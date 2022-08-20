package com.abir;

public class isUpperCase {
    static int sol(String str){
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                return i;

        }
        return -1;
    }

    public static void main(String[] args) {
        String ch = "Abir SarKar";
        System.out.println(sol(ch));
    }
}
