package algorithms.easy;

/**
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 * @author caijiapeng
 * @version created on 2018/1/20
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0){
            return false;
        } else {
            long result = 0;
            int original = x;
            while(x != 0){
                result = result*10+x%10;
                x = x/10;
            }
            if(result == original){
                return true;
            } else {
                return false;
            }
        }
    }
}
