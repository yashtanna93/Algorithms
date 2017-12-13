package leetcode.problems;

/**
 *
 * <h1>ZigZag Conversion</h1>
 *
 * The string "HELLOWORLD" is written in a zigzag pattern on a given number of rows like this: (you may want to
 * display this pattern in a fixed font for better legibility)
 *
 * H L O O L
 * E L W R D
 *
 * H   O   L
 * E L W R D
 * L   O
 *
 * H   O
 * E W R
 * L O L
 * L   D
 *
 * And then read line by line: "HLOOLELWRD"(2), "HOLELWRDLO"(3), "HOEWRLOLLD"(4)
 * Write the code that will take a string and make this conversion given a number of rows:
 * 
 * string convert(string text, int nRows);
 * convert("HELLOWORLD", 3) should return "HOLELWRDLO".
 *
 * @author Yash Tanna
 * @since 12/12/17
 */
public class Problem6ZigZagConversion {
    public String convert(String s, int numRows) {
        int k = 0;
        StringBuilder[] sbArray = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbArray[i] = new StringBuilder();
        }
        while (k < s.length()) {
            for (int i = 0; i < numRows && k < s.length(); i++) {
                sbArray[i].append(s.charAt(k++));
            }
            for (int i = numRows - 2; i > 0 && k < s.length(); i--) {
                sbArray[i].append(s.charAt(k++));
            }
        }
        for (int i = 1; i < numRows; i++) {
            sbArray[0].append(sbArray[i]);
        }
        return sbArray[0].toString();
    }
}