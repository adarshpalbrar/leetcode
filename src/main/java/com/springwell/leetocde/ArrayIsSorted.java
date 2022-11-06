package com.springwell.leetocde;

import java.util.Arrays;

public class ArrayIsSorted {

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 9, 11, 13};

        boolean check = isSorted(array, array.length);
        System.out.println(check);
    }

    private static boolean isSorted(int[] array, int len) {
        if (array == null || array.length <= 1) {
            return true;
        }

        if (array[0] > array[1]) {
            return false;
        }
        return isSorted(Arrays.copyOfRange(array, 1, array.length), len - 1);
    }
}
