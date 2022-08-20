package com.abir;

public class Problem367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(17));
    }


    static public boolean isPerfectSquare(int num) {
        int l = 1;
        int r = num;
        while(l <= r) {
            int m = l + (r - l) / 2;
            if (Integer.MAX_VALUE / m < m) {
                r = m - 1;
                continue;
            }
            int sq = m * m;

            if (num == sq) return true;
            if (num < sq) r = m - 1;
            else l = m + 1;
        }
        return false;
        }
}
