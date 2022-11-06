package com.springwell.leetocde;

import java.util.HashMap;
import java.util.Map;

public class NoWaysClimbingStairs {

    Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        int result = f( 4);
        System.out.println(result);
    }

    private static int f(int n) {
        if (n == 0 || n == 1) return 1;
        int result = f(n - 1) + f(n - 2);
        return result;
    }
}
