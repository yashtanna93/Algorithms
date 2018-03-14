package leetcode.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Yash Tanna
 * @since 3/14/18
 */
public class TestProblem11ContainerWithMostWater {
    private Problem11ContainerWithMostWater problem11ContainerWithMostWater = new Problem11ContainerWithMostWater();

    @Test
    public void TestProblem11ContainerWithMostWaterCase1() {
        assertEquals(problem11ContainerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
    }

    @Test
    public void TestProblem11ContainerWithMostWaterCase2() {
        assertEquals(problem11ContainerWithMostWater.maxArea(new int[]{1, 5, 3, 4, 2, 7, 3, 4}), 24);
    }
}
