package algorithms.easy;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.
 * Example 1:
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 * Example 2:
 * Input: 3
 * Output: False
 *
 * @author caijiapeng
 * @version created on 2018/1/28
 */
public class SumOfSquareNumbers {

    /**
     *
     * make use of the inbuilt sqrt function to check if the square c-a^2 turns out to be an integer
     *
     */
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * using binary search to find out if b^b in the range of [0, c-a^2]
     *
     */
    public boolean judgeSquareSum2(int c) {
        for (long a = 0; a * a <= c; a++) {
            int range = c - (int) (a * a);
            if (binarySearch(0, range, range)) {
                return true;
            }
        }
        return false;
    }

    public boolean judgeSquareSum3(int c) {
        Set<Long> squareSet = new HashSet<>();
        for (long a = 0; a * a <= c; a++) {
            squareSet.add(a * a);
            if (squareSet.contains(c - a * a)) {
                return true;
            }
        }
        return false;
    }

    private boolean binarySearch(long left, long right, int n) {
        if (left > right) {
            return false;
        }
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == n) {
                return true;
            } else if (mid * mid < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

}
