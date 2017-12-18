package leetcode.problems;

/**
 *
 * <h1>Regular Expression Matching</h1>
 *
 * Implement regular expression matching with support for '.' and '*'.
 * 
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * 
 * The matching should cover the entire input string (not partial).
 * 
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * 
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 *
 * @author Yash Tanna
 * @since 12/17/17
 */
public class Problem10RegularExpressionMatching {
    public boolean isMatch(String t, String p) {

        char[] text = t.toCharArray();
        char[] pattern = p.toCharArray();

        boolean tracking[][] = new boolean[text.length + 1][pattern.length + 1];

        tracking[0][0] = true;

        //Deals with patterns like a* or a*b* or a*b*c*
        for(int i=1; i<tracking[0].length; i++) {
            if(pattern[i-1] == '*') {
                tracking[0][i] = tracking[0][i-2];
            }
        }

        for(int i=1; i<tracking.length; i++) {
            for(int j=1; j<tracking[0].length; j++) {
                if(pattern[j-1] == '.' || pattern[j-1] == text[i-1]) {
                    tracking[i][j] = tracking[i-1][j-1]; //Check diagonally left upwards.
                } else if(pattern[j-1] == '*') {
                    tracking[i][j] = tracking[i][j-2]; //Check two step to left.
                    if(pattern[j-2] == '.' || pattern[j-2] == text[i-1]) {
                        tracking[i][j] = tracking[i][j] || tracking[i-1][j]; //Check one up.
                    }
                } else {
                    tracking[i][j] = false;
                }
            }
        }

        return tracking[text.length][pattern.length];
    }
}
