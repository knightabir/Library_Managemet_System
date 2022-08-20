package com.abir;

public class FirstbadVersion {


    static boolean isbadVersion(int n){
        if (n==34){
            return false;
        }
        return true;
    }


    static public int firstBadVersion(int n){
        int start = 0;
        int end = n;
        int ans =-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if (isbadVersion(mid)){
                ans = mid;
                end=mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return ans;
    }
}
