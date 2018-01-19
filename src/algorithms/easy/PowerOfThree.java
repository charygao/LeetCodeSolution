package algorithms.easy;

/**
 * Given an integer, write a function to determine if it is a power of three.
 * Follow up:
 * Could you do it without using any loop / recursion?
 * @author caijiapeng
 * @version created on 2018/1/19 13:28
 */
public class PowerOfThree {

    public boolean isPowerOfThree1(int n) {
        // 1162261467 is 3^19, 3^20 is bigger than int
        return (n > 0 && 1162261467 % n == 0);
    }

    public boolean isPowerOfThree2(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }

    public boolean isPowerOfThree3(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
