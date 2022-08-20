package com.abir;

public class romanToInteger {
    static int summ (char c){
        switch (c){
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'x':
                return 10;
            case 'v':
                return 5;
            case 'I':
                return 1;
        }
        return -1;
    }
    static int romanToInt(String s){
        int sum = summ(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >0; i--) {
            if(summ(s.charAt(i)) < summ(s.charAt(i+1) )) {
                sum -= summ(s.charAt(i));
            }
            else{
                sum +=summ(s.charAt(i));
            }
        }
        return sum;
    }
}
