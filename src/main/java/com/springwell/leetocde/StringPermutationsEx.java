package com.springwell.leetocde;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationsEx {


    public static void main(String[] args) {
        int[] integers = {1, 2, 3};
        List<Integer> output = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int index = 0;
        compute(integers, index, output, result);
        System.out.println(result);
    }

    private static void compute(int[] integers, int index, List<Integer> output, List<List<Integer>> result) {
        if (index >= integers.length) {
            result.add(output);
            return;
        }
        compute(integers, index+1, output, result);
        int element = integers[index];
        output.add(element);
        compute(integers, index+1, output, result);
    }


    @SuppressWarnings("unused")
    private static void swap(List<String> strings) {
        int start = 0;
        int end = strings.size() - 1;

        while (start < end) {
            String temp = strings.get(start);
            strings.set(start, strings.get(end));
            strings.set(end, temp);
            start++;
            end--;
        }
    }
}
