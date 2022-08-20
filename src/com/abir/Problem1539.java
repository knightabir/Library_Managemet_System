package com.abir;

public class Problem1539 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println(findKthPositive(arr,5));
    }

    static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int left = 0, right = n-1;
        int missing  = compute(arr[n-1], n);
        while(left <= right) {
            int mid = left + (right-left)/2;
            missing = compute(arr[mid], mid+1);

            if(missing >= k) right = mid-1;
            else left = mid+1;
        }

        // Right -> -1;
        if(right == -1) return k;
        return arr[right] + k-compute(arr[right], right+1);

    }

    static int compute(int actual, int expected){
        return actual - expected;
    }
}
