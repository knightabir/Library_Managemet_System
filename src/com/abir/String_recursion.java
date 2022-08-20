package com.abir;

public class String_recursion {

    public static void main(String[] args) {
        System.out.println(skipAppNotApple("bacappecdah"));
    }

    static String skip (String a){
        if (a.isEmpty()){
            return " ";
        }
        char ch  = a.charAt(0);

        if(ch == 'a'){
            return skip(a.substring(1));
        } else{
            return ch + skip(a.substring(1));
        }
    }

    static String skip2 (String a){
        if (a.isEmpty()){
            return "";
        }

        if(a.startsWith("apple")){
            return skip2(a.substring(5));
        } else{
            return a.charAt(0) + skip2(a.substring(1));
        }
    }


    static String skipAppNotApple (String a){
        if (a.isEmpty()){
            return "";
        }

        if(a.startsWith("app") && !a.startsWith("apple")){
            return skipAppNotApple(a.substring(3));
        } else{
            return a.charAt(0) + skipAppNotApple(a.substring(1));
        }
    }
}
