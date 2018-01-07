package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.

 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 *
 * @author caijiapeng
 * @version created on 2018/1/7
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        int[] index = new int[2];
        for(int i=0; i<nums.length; i++){
            int x = nums[i];
            if(resultMap.containsKey(target-x)){
                index[0] = resultMap.get(target-x);
                index[1] = i;
                break;
            }
            resultMap.put(x, i);
        }
        return index;
    }
}
