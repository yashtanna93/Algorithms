import java.util.stream.IntStream;

/**
 * <h1>1.7 Rotate Matrix</h1>
 * Given an image represented by an NxM matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 *
 * @author Yash Tanna
 **/

class RotateMatrix {
    public static void main(final String[] args) {
        System.out.println("Testing for RotateMatrix...");

        final int[][] inputTest1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};
        System.out.println("Test Case 1:");
        System.out.println("Input...");
        printMatrix(inputTest1);

        System.out.println("Output Anti ClockWise...");
        printMatrix(rotateAntiClockWiseMatrix(inputTest1));

        System.out.println("Output ClockWise...");
        printMatrix(rotateClockWiseMatrix(inputTest1));
    }

    private static void printMatrix(final int[][] matrix) {
        for (int outerIndex = 0; outerIndex < matrix.length; outerIndex++) {
            for (int innerIndex = 0; innerIndex < matrix[outerIndex].length; innerIndex++) {
                System.out.format("%4d", matrix[outerIndex][innerIndex]);
            }
            System.out.println();
        }
    }

    private static int[][] rotateAntiClockWiseMatrix(final int[][] input) {
        validate(input);


        final int rowLength = input.length;
        final int columnLength = input[0].length;

        final int[][] output = new int[columnLength][rowLength];

        for (int row = 0; row < rowLength; row++) {
            for (int column = 0; column < columnLength; column++) {
                output[columnLength - column - 1][row] = input[row][column];
            }
        }

        return output;
    }

    private static int[][] rotateClockWiseMatrix(final int[][] input) {
        validate(input);

        final int rowLength = input.length;
        final int columnLength = input[0].length;

        final int[][] output = new int[columnLength][rowLength];

        for (int row = 0; row < rowLength; row++) {
            for (int column = 0; column < columnLength; column++) {
                output[column][rowLength - row - 1] = input[row][column];
            }
        }

        return output;
    }

    private static void validate(final int[][] input) {
        if (input == null || input.length == 0) throw new IllegalArgumentException("Input canot be null or empty.");
    }
}