package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1 Two Sum
 * 1 两数之和
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 示例：
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author jiapeng cai
 * @version created on 2018/1/7
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (resultMap.containsKey(target - x)) {
                index[0] = resultMap.get(target - x);
                index[1] = i;
                break;
            }
            resultMap.put(x, i);
        }
        return index;
    }
}
