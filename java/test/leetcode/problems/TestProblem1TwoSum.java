package leetcode.problems;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * @author Yash Tanna
 * @since 12/10/17
 */
public class TestProblem1TwoSum {
    Problem1TwoSum problem1TwoSum = new Problem1TwoSum();
    @Test
    public void testTwoSumCase1() {
        startTest();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        assertArrayEquals(problem1TwoSum.twoSum(nums, target), new int[] { 0, 1 });
    }

    @Test
    public void testTwoSumCase2() {
        startTest();
        int[] nums = { 2, 5, 6, 7, 4, 2, 5, 8, 9, 1 };
        int target = 12;
        assertArrayEquals(problem1TwoSum.twoSum(nums, target), new int[] { 1, 3 });
    }

    @Test
    public void testTwoSumCase3() {
        startTest();
        int[] nums = { 1, 2, 3 };
        int target = 10;
        assertArrayEquals(problem1TwoSum.twoSum(nums, target), new int[] { 0, 0 });
    }
}
