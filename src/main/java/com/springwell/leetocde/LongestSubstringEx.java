package com.springwell.leetocde;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringEx {

    public static void main(String[] args) {

        String str = "clementisacap";

        Map<Character, Integer> integerMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (! integerMap.containsKey(key)) {
                integerMap.put(key, i);
                stringBuilder.append(key);
            } else {

            }
        }

        System.out.println(stringBuilder);
    }
}
