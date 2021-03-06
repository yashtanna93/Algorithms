package leetcode.problems;

import org.junit.Test;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;

/**
 * @author Yash Tanna
 * @since 12/17/17
 */
public class TestProblem10RegularExpressionMatching {
    Problem10RegularExpressionMatching problem10RegularExpressionMatching = new Problem10RegularExpressionMatching();

    @Test
    public void TestProblem10RegularExpressionMatchingCase1() {
        startTest();
        assertEquals(problem10RegularExpressionMatching.isMatch("aa", "a"), false);
    }

    @Test
    public void TestProblem10RegularExpressionMatchingCase2() {
        startTest();
        assertEquals(problem10RegularExpressionMatching.isMatch("aa", "aa"), true);
    }

    @Test
    public void TestProblem10RegularExpressionMatchingCase3() {
        startTest();
        assertEquals(problem10RegularExpressionMatching.isMatch("aaa", "aa"), false);
    }

    @Test
    public void TestProblem10RegularExpressionMatchingCase4() {
        startTest();
        assertEquals(problem10RegularExpressionMatching.isMatch("aa", "a*"), true);
    }

    @Test
    public void TestProblem10RegularExpressionMatchingCase5() {
        startTest();
        assertEquals(problem10RegularExpressionMatching.isMatch("aa", ".*"), true);
    }

    @Test
    public void TestProblem10RegularExpressionMatchingCase6() {
        startTest();
        assertEquals(problem10RegularExpressionMatching.isMatch("ab", ".*"), true);
    }

    @Test
    public void TestProblem10RegularExpressionMatchingCase7() {
        startTest();
        assertEquals(problem10RegularExpressionMatching.isMatch("aab", "c*a*b"), true);
    }

    @Test
    public void TestProblem10RegularExpressionMatchingCase8() {
        startTest();
        assertEquals(problem10RegularExpressionMatching.isMatch("abbbbccc", "a*ab*bbbbc*"), true);
    }

    @Test
    public void TestProblem10RegularExpressionMatchingCase9() {
        startTest();
        assertEquals(problem10RegularExpressionMatching.isMatch("abbbbccc", "aa*bbb*bbbc*"), false);
    }

    @Test
    public void TestProblem10RegularExpressionMatchingCase10() {
        startTest();
        assertEquals(problem10RegularExpressionMatching.isMatch("abbbbccc", ".*bcc"), false);
    }

    @Test
    public void TestProblem10RegularExpressionMatchingCase11() {
        startTest();
        assertEquals(problem10RegularExpressionMatching.isMatch("abbbbccc", ".*bcc*"), true);
    }

    @Test
    public void TestProblem10RegularExpressionMatchingCase12() {
        startTest();
        assertEquals(problem10RegularExpressionMatching.isMatch("abbbbccc", ".*bcc*"), true);
    }

    @Test
    public void TestProblem10RegularExpressionMatchingCase13() {
        startTest();
        assertEquals(problem10RegularExpressionMatching.isMatch("aaa", "ab*a*c*a"), true);
    }
}
