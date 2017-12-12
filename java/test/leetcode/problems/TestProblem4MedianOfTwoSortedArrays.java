package leetcode.problems;

import org.junit.Test;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;

/**
 * @author Yash Tanna
 * @since 12/11/17
 */
public class TestProblem4MedianOfTwoSortedArrays {
    @Test
    public void testMedianOfTwoSortedArraysCase1() {
        startTest();
        int[] A = {1, 3};
        int[] B = {2};
        assertEquals(Problem4MedianOfTwoSortedArrays.findMedianSortedArrays(A, B), 2, 1);
    }

    @Test
    public void testMedianOfTwoSortedArraysCase2() {
        startTest();
        int[] A = {1, 2};
        int[] B = {3, 4};
        assertEquals(Problem4MedianOfTwoSortedArrays.findMedianSortedArrays(A, B), 2.5, 0.1);
    }

    @Test
    public void testMedianOfTwoSortedArraysCase3() {
        startTest();
        int[] A = {1, 3, 8, 9, 15};
        int[] B = {7, 11, 18, 19, 22, 25};
        assertEquals(Problem4MedianOfTwoSortedArrays.findMedianSortedArrays(A, B), 11, 1);
    }

    @Test
    public void testMedianOfTwoSortedArraysCase4() {
        startTest();
        int[] A = {1, 3, 8, 9, 13, 15};
        int[] B = {7, 11, 18, 19, 22, 25};
        assertEquals(Problem4MedianOfTwoSortedArrays.findMedianSortedArrays(A, B), 12, 1);
    }
}
