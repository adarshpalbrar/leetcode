package com.springwell.leetocde;

public class TwoSumEx {

    public int[] findTwoSum(int[] array, int target) {
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int numberToFind = target - array[i];
                if (numberToFind == array[j]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
