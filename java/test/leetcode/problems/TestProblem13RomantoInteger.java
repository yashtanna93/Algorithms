package leetcode.problems;

import org.junit.Test;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;

/**
 * @author Yash Tanna
 * @since 3/17/18
 */
public class TestProblem13RomantoInteger {
    Problem13RomantoInteger problem13RomantoInteger = new Problem13RomantoInteger();

    @Test
    public void testProblem7ReverseIntegerCase1() {
        startTest();
        assertEquals(problem13RomantoInteger.romanToInt("DCXXI"), 621);
    }

    @Test
    public void testProblem7ReverseIntegerCase2() {
        startTest();
        assertEquals(problem13RomantoInteger.romanToInt("MCXIV"), 1114);
    }

    @Test
    public void testProblem7ReverseIntegerCase3() {
        startTest();
        assertEquals(problem13RomantoInteger.romanToInt("CMCMCM"), 2700);
    }

    @Test
    public void testProblem7ReverseIntegerCase4() {
        startTest();
        assertEquals(problem13RomantoInteger.romanToInt("XXXXX"), 50);
    }

    @Test
    public void testProblem7ReverseIntegerCase5() {
        startTest();
        assertEquals(problem13RomantoInteger.romanToInt("MMMMM"), 5000);
    }

}
