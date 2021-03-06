package leetcode.problems;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author Yash Tanna
 * @since 3/14/18
 */
public class TestProblem12IntegertoRoman {
    Problem12IntegertoRoman problem12IntegertoRoman = new Problem12IntegertoRoman();

    @Test
    public void TestProblem12IntegertoRomanCase1() {
        startTest();
        assertEquals(problem12IntegertoRoman.intToRoman(9), "IX");
    }

    @Test
    public void TestProblem12IntegertoRomanCase2() {
        startTest();
        assertEquals(problem12IntegertoRoman.intToRoman(40), "XL");
    }

    @Test
    public void TestProblem12IntegertoRomanCase3() {
        startTest();
        assertEquals(problem12IntegertoRoman.intToRoman(1904), "MCMIV");
    }
}
