package algorithms.easy;

/**
 * Given an integer, write a function to determine if it is a power of two.
 *
 * @author caijiapeng
 * @version created on 2018/1/19 13:50
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo1(int n) {
        return ((n & (n - 1)) == 0 && n > 0);
    }

    public boolean isPowerOfTwo2(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }

    public boolean isPowerOfTwo3(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public boolean isPowerOfTwo4(int n) {
        return n > 0 && (1073741824 % n == 0);
    }
}
