package leetcode.problem1;

import org.junit.Test;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertArrayEquals;

/**
 * @author Yash Tanna
 * @since 12/13/2016
 */
public class TestCase2 {
    @Test
    public void testTwoSum() {
        startTest();
        int[] nums = {2, 5, 6, 7, 4, 2, 5, 8, 9, 1};
        int target = 12;
        assertArrayEquals(Problem1TwoSum.twoSum(nums, target), new int[]{1, 3});
    }
}
