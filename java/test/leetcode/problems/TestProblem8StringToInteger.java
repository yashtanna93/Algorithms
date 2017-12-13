package leetcode.problems;

import org.junit.Test;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;

/**
 * @author Yash Tanna
 * @since 12/13/17
 */
public class TestProblem8StringToInteger {
    Problem8StringToInteger problem8StringToInteger = new Problem8StringToInteger();

    @Test
    public void testStringToIntegerCase1() {
        startTest();
        assertEquals(problem8StringToInteger.myAtoi("123"), 123);
    }

    @Test
    public void testStringToIntegerCase2() {
        startTest();
        assertEquals(problem8StringToInteger.myAtoi("+-2"), 0);
    }

    @Test
    public void testStringToIntegerCase3() {
        startTest();
        assertEquals(problem8StringToInteger.myAtoi("  -0012a42"), -12);
    }

    @Test
    public void testStringToIntegerCase4() {
        startTest();
        assertEquals(problem8StringToInteger.myAtoi("-+1"), 0);
    }

    @Test
    public void testStringToIntegerCase5() {
        startTest();
        assertEquals(problem8StringToInteger.myAtoi("2147483648"), 2147483647);
    }

    @Test
    public void testStringToIntegerCase6() {
        startTest();
        assertEquals(problem8StringToInteger.myAtoi("    +11191657170"), 2147483647);
    }

    @Test
    public void testStringToIntegerCase7() {
        startTest();
        assertEquals(problem8StringToInteger.myAtoi("-2147483649"), -2147483648);
    }

    @Test
    public void testStringToIntegerCase8() {
        startTest();
        assertEquals(problem8StringToInteger.myAtoi("abc"), 0);
    }

    @Test
    public void testStringToIntegerCase9() {
        startTest();
        assertEquals(problem8StringToInteger.myAtoi(""), 0);
    }
}
