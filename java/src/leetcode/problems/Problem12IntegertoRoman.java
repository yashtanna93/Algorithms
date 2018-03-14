package leetcode.problems;

import java.util.LinkedHashMap;

/**
 *
 * <h1>Integer to Roman</h1>
 *
 * Given an integer, convert it to a roman numeral.
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
 * @since 3/14/18
 */
public class Problem12IntegertoRoman {
    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
        hashMap.put(1000, "M");
        hashMap.put(900, "CM");
        hashMap.put(500, "D");
        hashMap.put(400, "CD");
        hashMap.put(100, "C");
        hashMap.put(90, "XC");
        hashMap.put(50, "L");
        hashMap.put(40, "XL");
        hashMap.put(10, "X");
        hashMap.put(9, "IX");
        hashMap.put(5, "V");
        hashMap.put(4, "IV");
        hashMap.put(1, "I");

        for(int key: hashMap.keySet()) {
            while (num >= key) {
                num -= key;
                stringBuilder.append(hashMap.get(key));
            }
        }

        return stringBuilder.toString();
    }
}
