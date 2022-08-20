package com.abir;

public class reverseBit {
    public static void main(String[] args) {
//        byte a = 00000010100101000001111010011100;

    }

    static int reverse(int n){
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int bit = (n>>i)&1;
            res = res | bit<<(31-i);
        }
        return res;
    }
}
