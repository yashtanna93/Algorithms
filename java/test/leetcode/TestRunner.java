package leetcode;

import org.junit.Test;

import static leetcode.TestPrinter.run;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Yash Tanna
 * @since 12/11/17
 */
public class TestRunner {

    private static final File FOLDER = new File("/Users/yashtann/github/Algorithms/java/test/leetcode/problems");

    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the problem number: ");
        int n = scanner.nextInt();
        getResults(n);
    }

    private static void getResults(int n) throws ClassNotFoundException {
        Map<Integer, Class> map = listOfTestProblemNumberAndClasses();
        run(map.get(n));
    }

    private static Map<Integer, Class> listOfTestProblemNumberAndClasses() throws ClassNotFoundException {
        Map<Integer, Class> map = new HashMap<>();
        for (File fileEntry : FOLDER.listFiles()) {
            String filename = fileEntry.getName();
            int problemNumber = Integer.parseInt(filename.replaceAll("[\\D]", ""));
            Class className = Class.forName("leetcode.problems.".concat(filename.replace(".java", "")));
            map.put(problemNumber, className);
        }
        return map;
    }

}
