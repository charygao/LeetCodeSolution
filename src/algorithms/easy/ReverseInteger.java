package algorithms.easy;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 * Input: 123
 * Output:  321
 *
 * Example 2:
 * Input: -123
 * Output: -321
 *
 * Example 3:
 * Input: 120
 * Output: 21
 *
 * @author caijiapeng
 * @version created on 2018/1/7
 */
public class ReverseInteger {

    public int reverse(int x) {
        long result = 0;
        while(x != 0){
            result = result*10+x%10;
            x = x/10;
        }
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        return (int) result;
    }
}
