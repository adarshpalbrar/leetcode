package com.springwell.leetocde;

public class KadaneAlgoEx {

    public static void main(String[] args) {

        int[] nums = {-3, -4, 5, -1, 2, -4, 6, -1};
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            sum = sum + num;
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) sum = 0;
        }

        System.out.println(maxSum);
    }
}
