package leetcode.problems;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Yash Tanna
 * @since 12/10/17
 */
public class TestProblem3LengthOfLongestSubstring {

    @Test
    public void testLengthOfLongestSubstringCase1() {
        startTest();
        assertEquals(Problem3LengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"), 3);
    }

    @Test
    public void testLengthOfLongestSubstringCase2() {
        startTest();
        assertEquals(Problem3LengthOfLongestSubstring.lengthOfLongestSubstring("bbbb"), 1);
    }

    @Test
    public void testLengthOfLongestSubstringCase3() {
        startTest();
        assertEquals(Problem3LengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"), 3);
    }
}
