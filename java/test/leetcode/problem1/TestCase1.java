package leetcode.problem1;

import org.junit.Test;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertArrayEquals;


/**
 * @author Yash Tanna
 * @since 12/13/2016
 */
public class TestCase1 {
    @Test
    public void testTwoSum() {
        startTest();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(Problem1TwoSum.twoSum(nums, target), new int[]{0, 1});
    }
}
