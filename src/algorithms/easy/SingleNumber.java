package algorithms.easy;

/**
 *
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Your algorithm should have a linear runtime complexity.
 *
 * @author caijiapeng
 * @version created on 2018/1/18
 */
public class SingleNumber {


    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
