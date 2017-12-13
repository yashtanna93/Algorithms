package leetcode.problems;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Yash Tanna
 * @since 12/12/17
 */
public class TestProblem6ZigZagConversion {

    private Problem6ZigZagConversion problem6ZigZagConversion = new Problem6ZigZagConversion();

    @Test
    public void testProblem6ZigZagConversionCase1() {
        startTest();
        assertEquals(problem6ZigZagConversion.convert("HELLOWORLD", 2), "HLOOLELWRD");
    }

    @Test
    public void testProblem6ZigZagConversionCase2() {
        startTest();
        assertEquals(problem6ZigZagConversion.convert("HELLOWORLD", 3), "HOLELWRDLO");
    }

    @Test
    public void testProblem6ZigZagConversionCase3() {
        startTest();
        assertEquals(problem6ZigZagConversion.convert("HELLOWORLD", 4), "HOEWRLOLLD");
    }
}
