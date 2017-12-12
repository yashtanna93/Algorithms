package leetcode.problems;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Yash Tanna
 * @since 12/11/17
 */
public class TestProblem5LongestPalindromicSubstring {

    Problem5LongestPalindromicSubstring problem5LongestPalindromicSubstring = new Problem5LongestPalindromicSubstring();

    @Test
    public void testLongestPalindromicSubstringCase1() {
        startTest();
        assertEquals(problem5LongestPalindromicSubstring.longestPalindrome("abaabc"), "baab");
    }

    @Test
    public void testLongestPalindromicSubstringCase2() {
        startTest();
        assertEquals(problem5LongestPalindromicSubstring.longestPalindrome("jklollolkidding"), "klollolk");
    }

    @Test
    public void testLongestPalindromicSubstringCase3() {
        startTest();
        assertEquals(problem5LongestPalindromicSubstring.longestPalindrome("cbbd"), "bb");
    }

    @Test
    public void testLongestPalindromicSubstringCase4() {
        startTest();
        assertEquals(problem5LongestPalindromicSubstring.longestPalindrome("ccc"), "ccc");
    }
}
