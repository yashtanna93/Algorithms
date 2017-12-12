package leetcode.problems;

import java.util.HashMap;

/**
 * <h1>Two Sum</h1>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * Example:
 *  Given nums = [2, 7, 11, 15], target = 9,
 *  Because nums[0] + nums[1] = 2 + 7 = 9,
 *  return [0, 1].
 *
 * @author Yash Tanna
 * @since 12/12/2016
 */
public class Problem1TwoSum {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]), i};
            else
                map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}
