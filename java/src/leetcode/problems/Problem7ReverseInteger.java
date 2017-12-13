package leetcode.problems;

/**
 *
 * <h1>Reverse Integer</h1>
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * Input: 123
 * Output: 321
 * Example 2:
 * 
 * Input: -123
 * Output: -321
 * Example 3:
 * 
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For
 * the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * @author Yash Tanna
 * @since 12/13/17
 */
public class Problem7ReverseInteger {
    public int reverse(int x) {
        long ans = 0;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
            if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) ans;
    }
}
