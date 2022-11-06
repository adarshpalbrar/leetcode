package com.springwell.leetocde;

import java.util.Arrays;

public class TwoSumTwoEx {

    public static void main(String[] args) {

        int[] nums = {-3, 2, 3, 3, 6, 8, 15};
        int[] result = new int[2];
        int target = 6;
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (target <  sum) {
                end--;
            } else if (target > sum) {
                start++;
            } else {
                result[0] = ++start;
                result[1] = ++end;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
