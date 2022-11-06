package com.springwell.leetocde;

import java.util.Arrays;

public class PassByRefEx {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 9, 11};

        change(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] arr) {
        arr[2] = 99;
    }
}
