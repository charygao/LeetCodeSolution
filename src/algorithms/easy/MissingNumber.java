package algorithms.easy;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * Example 1
 * Input: [3,0,1]
 * Output: 2
 * Example 2
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * @author caijiapeng
 * @version created on 2018/1/19 13:25
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int expectedSum = (1 + nums.length) * nums.length / 2;
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        return expectedSum - actualSum;
    }
}
