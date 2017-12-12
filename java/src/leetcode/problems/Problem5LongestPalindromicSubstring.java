package leetcode.problems;

/**
 *
 * <h1>Longest Palindromic Substring</h1>
 *
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * 
 * Example:
 * 
 * Input: "babad"
 * 
 * Output: "bab"
 * 
 * Note: "aba" is also a valid answer.
 * Example:
 * 
 * Input: "cbbd"
 * 
 * Output: "bb"
 * 
 * @author Yash Tanna
 * @since 12/11/17
 */
public class Problem5LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        int len = s.length();
        String ans = "";

        if(len==1) return s;

        int[][] strBoolTable = new int[len][len];

        //When length of string is 1
        for(int i=0; i<len; i++) {
            ans = s.substring(i, i+1);
            strBoolTable[i][i] = 1;
        }

        //When length of string is 2
        for(int i=0; i<len-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)) {
                ans = s.substring(i, i+2);
                strBoolTable[i][i+1] = 1;
            }
        }

        //When length is greater than 2
        int j;
        for(int k=2; k<len; k++) {
            for(int i=0; i<len-k; i++) {
                j = i + k;
                if(s.charAt(i) == s.charAt(j) && strBoolTable[i+1][j-1] == 1) {
                    String substring = s.substring(i, j+1);
                    if(substring.length() > ans.length()) {
                        ans = substring;
                    }
                    strBoolTable[i][j] = 1;
                }
            }
        }

        return ans;
    }
}
