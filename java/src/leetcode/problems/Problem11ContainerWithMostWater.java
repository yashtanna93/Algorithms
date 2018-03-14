package leetcode.problems;

/**
 *
 * <h1>Container With Most Water</h1>
 *
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines
 * are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis
 * forms a container, such that the container contains the most water.
 * 
 * Note: You may not slant the container and n is at least 2.
 *
 * @author Yash Tanna
 * @since 3/14/18
 */
public class Problem11ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;

        while(left < right) {
            int tempHeight = Math.min(height[left], height[right]);
            int tempWidth = right - left;
            int tempArea = tempHeight * tempWidth;
            area = Math.max(area, tempArea);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return area;
    }
}
