package com.springwell.leetocde;

import java.util.Arrays;

public class StringReverseEx {

    public static void main(String[] args) {

        String str = "abcde";
        int start = 0;
        int end = str.length() - 1;
        String result = reverseStr(str.toCharArray(), start, end);

        System.out.println("result = " + result);
    }

    private static String reverseStr(char[] str, int start, int end) {
        if (start >= end) {
            return Arrays.toString(str);
        }
        swap(str, start, end);
        start++;
        end--;
        return reverseStr(str, start, end);
    }

    private static void swap(char[] str, int start, int end) {
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
    }
}
