package leetcode.problems;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Yash Tanna
 * @since 12/11/17
 */
public class TestProblem4MedianOfTwoSortedArrays {
    Problem4MedianOfTwoSortedArrays problem4MedianOfTwoSortedArrays = new Problem4MedianOfTwoSortedArrays();

    @Test
    public void testMedianOfTwoSortedArraysCase1() {
        startTest();
        int[] A = { 1, 3 };
        int[] B = { 2 };
        assertEquals(problem4MedianOfTwoSortedArrays.findMedianSortedArrays(A, B, A.length, B.length), 2, 1);
    }

    @Test
    public void testMedianOfTwoSortedArraysCase2() {
        startTest();
        int[] A = { 1, 2 };
        int[] B = { 3, 4 };
        assertEquals(problem4MedianOfTwoSortedArrays.findMedianSortedArrays(A, B, A.length, B.length), 2.5, 0.1);
    }

    @Test
    public void testMedianOfTwoSortedArraysCase3() {
        startTest();
        int[] A = { 1, 3, 8, 9, 15 };
        int[] B = { 7, 11, 18, 19, 22, 25 };
        assertEquals(problem4MedianOfTwoSortedArrays.findMedianSortedArrays(A, B, A.length, B.length), 11, 1);
    }

    @Test
    public void testMedianOfTwoSortedArraysCase4() {
        startTest();
        int[] A = { 1, 3, 8, 9, 13, 15 };
        int[] B = { 7, 11, 18, 19, 22, 25 };
        assertEquals(problem4MedianOfTwoSortedArrays.findMedianSortedArrays(A, B, A.length, B.length), 12, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMedianOfTwoSortedArraysCase5() {
        startTest();
        problem4MedianOfTwoSortedArrays.findMedianSortedArrays(new int[0], new int[0], -1, -1);
    }
}
