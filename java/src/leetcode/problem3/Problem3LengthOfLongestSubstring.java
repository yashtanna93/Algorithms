package leetcode.problem3;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>Longest Substring Without Repeating Characters</h1>
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 * Given "bbbbb", the answer is "b", with the length of 1.
 *
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a
 * subsequence and not a substring.
 *
 * @author Yash Tanna
 * @since 4/2/2017
 */
public class Problem3LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0, j=0; j<s.length(); j++) {
            if(map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            max = Math.max(max, j-i+1);
            map.put(s.charAt(j), j+1);
        }
        return max;
    }
}
