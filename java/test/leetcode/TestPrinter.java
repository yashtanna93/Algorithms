package leetcode;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Yash Tanna
 * @since 12/13/2016
 */
public class TestPrinter {
    public static int TEST_NUMBER = 1;
    public static void printResult(Result result) {
        for (Failure failure : result.getFailures()) {
            System.out.println("Failed Test Case - " + failure.getTestHeader());
            System.out.println("Failure Description - " + failure.getMessage());
            System.out.println("Trace\n" + failure.getTrace());
        }

        System.out.println("Number of test failed - " + result.getFailureCount());
    }

    public static void startTest() {
        System.out.println("Starting test " + TEST_NUMBER++ + "...");
    }
}
