package leetcode.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Yash Tanna
 * @since 12/14/17
 */
public class TestProblem9PalindromeNumber {

    Problem9PalindromeNumber problem9PalindromeNumber = new Problem9PalindromeNumber();

    @Test
    public void testPalindromeNumberCase1() {
        assertEquals(problem9PalindromeNumber.isPalindrome(12321), true);
    }

    @Test
    public void testPalindromeNumberCase2() {
        assertEquals(problem9PalindromeNumber.isPalindrome(1221), true);
    }

    @Test
    public void testPalindromeNumberCase3() {
        assertEquals(problem9PalindromeNumber.isPalindrome(1231), false);
    }

    @Test
    public void testPalindromeNumberCase4() {
        assertEquals(problem9PalindromeNumber.isPalindrome(-1221), false);
    }

    @Test
    public void testPalindromeNumberCase5() {
        assertEquals(problem9PalindromeNumber.isPalindrome(1000), false);
    }
}
