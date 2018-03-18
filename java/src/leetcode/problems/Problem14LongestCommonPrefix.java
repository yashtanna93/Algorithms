package leetcode.problems;

/**
 *
 * <h1>Longest Common Prefix</h1>
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * @author Yash Tanna
 * @since 3/18/18
 */
public class Problem14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for(String str: strs) {
            prefix = prefix.length() > str.length() ? prefix.substring(0, str.length()) : prefix;
            for(int i=0; i<prefix.length(); i++) {
                if(prefix.charAt(i)!=str.charAt(i)) {
                    if(i==0) return "";
                    prefix = prefix.substring(0, i);
                    break;
                }
            }
        }
        return prefix;
    }
}
