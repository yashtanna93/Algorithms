package leetcode.problem3;

import org.junit.Test;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;

/**
 * @author Yash Tanna
 * @since 4/2/17
 */
public class TestCase3 {
    @Test
    public void testLengthOfLongestSubstring() {
        startTest();
        assertEquals(Problem3LengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"), 3);
    }
}
