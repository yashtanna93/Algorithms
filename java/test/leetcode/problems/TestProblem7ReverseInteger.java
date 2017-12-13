package leetcode.problems;

import org.junit.Test;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;

/**
 * @author Yash Tanna
 * @since 12/13/17
 */
public class TestProblem7ReverseInteger {
    Problem7ReverseInteger problem7ReverseInteger = new Problem7ReverseInteger();

    @Test
    public void testProblem7ReverseIntegerCase1() {
        startTest();
        assertEquals(problem7ReverseInteger.reverse(321), 123);
    }

    @Test
    public void testProblem7ReverseIntegerCase2() {
        startTest();
        assertEquals(problem7ReverseInteger.reverse(-123), -321);
    }

    @Test
    public void testProblem7ReverseIntegerCase3() {
        startTest();
        assertEquals(problem7ReverseInteger.reverse(120), 21);
    }

    @Test
    public void testProblem7ReverseIntegerCase4() {
        startTest();
        assertEquals(problem7ReverseInteger.reverse(1534236469), 0);
    }

    @Test
    public void testProblem7ReverseIntegerCase5() {
        startTest();
        assertEquals(problem7ReverseInteger.reverse(-2147483648), 0);
    }
}
