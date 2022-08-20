//package com.abir;
//
//public class Problem1871 {
//
//    public static void main(String[] args) {
//        String s = "011010";
//        System.out.println(canReach(s,2,3));
//    }
//
//    static boolean canReach(String s, int minJump,int maxJump){
//        int n = s.length();
//        int a=0;
//        int b=0;
//        for (String i = 0; i < n; i++) {
//            char j = s.charAt(i);
//            if ("1".equals(j)){
//                b++;
//            }
//            else a++;
//        }
//        if (minJump != a || maxJump !=b) {
//            return false;
//        }
//        else return true;
//    }
//}
