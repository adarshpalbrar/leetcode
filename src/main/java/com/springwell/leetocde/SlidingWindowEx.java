package com.springwell.leetocde;

public class SlidingWindowEx {

    public static void main(String[] args) {

        int[] A = {1, 9, -1, -2, 7, 3, -1, 2};
        int k = 4;
        int windowSum = 0, maxSum = 0;
        int start = 0, end = 0;

        while (end < k) {
            windowSum = windowSum + A[end++];
        }
        maxSum = Math.max(maxSum, windowSum);

        while (end < A.length) {
            windowSum = windowSum + A[end++] - A[start++];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);
    }
}
