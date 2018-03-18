package leetcode.problems;

import org.junit.Test;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;

/**
 * @author Yash Tanna
 * @since 3/18/18
 */
public class TestProblem14LongestCommonPrefix {

    Problem14LongestCommonPrefix problem14LongestCommonPrefix = new Problem14LongestCommonPrefix();

    @Test
    public void testLongestCommonPrefixCase1() {
        startTest();
        assertEquals(problem14LongestCommonPrefix.longestCommonPrefix(new String[]{""}), "");
    }

    @Test
    public void testLongestCommonPrefixCase2() {
        startTest();
        assertEquals(problem14LongestCommonPrefix.longestCommonPrefix(new String[]{"a", "a"}), "a");
    }

    @Test
    public void testLongestCommonPrefixCase3() {
        startTest();
        assertEquals(problem14LongestCommonPrefix.longestCommonPrefix(new String[]{"ab", "a"}), "a");
    }

    @Test
    public void testLongestCommonPrefixCase4() {
        startTest();
        assertEquals(problem14LongestCommonPrefix.longestCommonPrefix(new String[]{"ab", "ab"}), "ab");
    }

    @Test
    public void testLongestCommonPrefixCase5() {
        startTest();
        assertEquals(problem14LongestCommonPrefix.longestCommonPrefix(new String[]{"ba", "a"}), "");
    }
}
