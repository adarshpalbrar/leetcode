package com.springwell.leetocde;

public class FactorialEx {

    public static void main(String[] args) {

        int result = factorial(6);
        System.out.println(result);
    }

    private static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
