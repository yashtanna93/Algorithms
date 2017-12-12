package leetcode.problems;

/**
 * <h1>Median of Two Sorted Arrays</h1>
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * 
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * 
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 *
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5
 * 
 * @author Yash Tanna
 * @since 12/10/17
 */
public class Problem4MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] A, int[] B, int lenA, int lenB) {
        if(lenA > lenB) {
            return findMedianSortedArrays(B, A, lenB, lenA);
        }

        int low = 0;
        int high = lenA;

        while(low <= high) {
            int partitionA = (low + high)/2;
            int partitionB = ((A.length + B.length + 1)/2) - partitionA;

            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : A[partitionA - 1];
            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : B[partitionB - 1];

            int minRightA = (partitionA == A.length) ? Integer.MAX_VALUE : A[partitionA];
            int minRightB = (partitionB == B.length) ? Integer.MAX_VALUE : B[partitionB];

            if(maxLeftA <= minRightB && maxLeftB <= minRightA) {
                if(((A.length + B.length) % 2) == 0) {
                    return (double) (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB))/2;
                } else {
                    return (double) Math.max(maxLeftA, maxLeftB);
                }
            } else if(maxLeftA > minRightB) {
                high = partitionA - 1;
            } else {
                low = partitionA + 1;
            }
        }

        throw new IllegalArgumentException();
    }
}
