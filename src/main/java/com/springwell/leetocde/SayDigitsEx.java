package com.springwell.leetocde;

import java.util.ArrayList;
import java.util.List;

public class SayDigitsEx {

    private static final List<String> numbers = new ArrayList<>();

    static {
        numbers.add("Zero");
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");
        numbers.add("Five");
        numbers.add("Six");
        numbers.add("Seven");
        numbers.add("Eight");
    }

    public static void main(String[] args) {

        int number = 514;

        sayDigit(number);
    }

    private static void sayDigit(int number) {
        if (number == 0) return;
        int digit = number % 10;
        number = number / 10;
        sayDigit(number);
        System.out.print(numbers.get(digit) + " ");
    }
}
