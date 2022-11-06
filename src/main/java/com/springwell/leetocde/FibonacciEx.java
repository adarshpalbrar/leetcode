package com.springwell.leetocde;


import java.util.HashMap;

public class FibonacciEx {

    public static HashMap<Integer, Integer> hm = new HashMap<>();

    public static void main(String[] args) {
        int result = fib(8);
        System.out.println(result);
    }

    private static int fib(int num) {
        if (hm.containsKey(num)) return hm.get(num);
        if (num <= 1) return num;
        int nthValue = fib(num - 1) + fib(num - 2);
        hm.put(num, nthValue);
        return nthValue;
    }
}
