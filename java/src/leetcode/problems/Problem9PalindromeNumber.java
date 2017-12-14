package leetcode.problems;

/**
 * <h1>Palindrome Number</h1>
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 
 * click to show spoilers.
 * 
 * Some hints:
 * Could negative integers be palindromes? (ie, -1)
 * 
 * If you are thinking of converting the integer to string, note the restriction of using extra space.
 * 
 * You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the
 * reversed integer might overflow. How would you handle such case?
 * 
 * There is a more generic way of solving this problem.
 *
 * @author Yash Tanna
 * @since 12/14/17
 */
public class Problem9PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int y = 0;
        while (y < x) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return x == y || x == (y / 10);
    }
}
