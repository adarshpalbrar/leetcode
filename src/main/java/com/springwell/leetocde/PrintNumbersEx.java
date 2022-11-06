package com.springwell.leetocde;

public class PrintNumbersEx {

    public static void main(String[] args) {

        printNumbers(10);
    }

    private static void printNumbers(int num) {
        if (num == 0) {
            return;
        }

        System.out.println(num);
        printNumbers(num - 1);
    }
}
