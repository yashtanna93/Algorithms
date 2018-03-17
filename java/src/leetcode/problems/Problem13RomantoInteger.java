package leetcode.problems;

import java.util.HashMap;

/**
 *
 * <h1>Roman to Integer</h1>
 *
 * Given a roman numeral, convert it to an integer.
 * 
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 * SYMBOL       VALUE
 * I             1
 * IV            4
 * V             5
 * IX            9
 * X             10
 * XL            40
 * L             50
 * XC            90
 * C             100
 * CD            400
 * D             500
 * CM            900
 * M             1000
 * 
 * @author Yash Tanna
 * @since 3/17/18
 */
public class Problem13RomantoInteger {
    public int romanToInt(String s) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("CM", 900);
        hashMap.put("CD", 400);
        hashMap.put("XC", 90);
        hashMap.put("XL", 40);
        hashMap.put("IX", 9);
        hashMap.put("IV", 4);
        hashMap.put("M", 1000);
        hashMap.put("D", 500);
        hashMap.put("C", 100);
        hashMap.put("L", 50);
        hashMap.put("X", 10);
        hashMap.put("V", 5);
        hashMap.put("I", 1);

        int num = 0;
        for (int key = s.length(); key > 0; key--) {
            if (key > 1 && hashMap.containsKey(s.substring(key - 2, key))) {
                num += hashMap.get(s.substring(key - 2, key--));
            } else {
                num += hashMap.get(s.substring(key - 1, key));
            }
        }

        return num;
    }
}
