package leetcode.problem1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static leetcode.TestPrinter.printResult;


/**
 * @author Yash Tanna
 * @since 12/13/2016
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite.class);
        printResult(result);
    }
}
