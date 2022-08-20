package com.abir;

public class binaryAddition {
    public static void main(String[] args) {
        String num1 = "1010";
        String num2 = "10";
        System.out.println(ans(num1,num2));
    }

    private static String ans(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int idxA = a.length() - 1;
        int idxB = b.length() - 1;
        int carry = 0;
        while(idxA >= 0 || idxB >= 0){
            int sum = 0;
            if(idxA >= 0) sum += a.charAt(idxA--) - '0';
            if(idxB >= 0) sum += b.charAt(idxB--) - '0';
            sum += carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if(carry == 1) sb.append(1);
        return sb.reverse().toString();
    }

}
