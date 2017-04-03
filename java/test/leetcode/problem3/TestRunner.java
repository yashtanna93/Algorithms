package leetcode.problem3;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static leetcode.TestPrinter.printResult;

/**
 * @author Yash Tanna
 * @since 4/2/17
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite.class);
        printResult(result);
    }
}
