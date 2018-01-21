package algorithms.easy;

/**
 *
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 *
 * @author caijiapeng
 * @version created on 2018/1/21
 */
public class ReverseString {

    public String reverseString(String s) {
        char[] source = s.toCharArray();
        char temp;
        for (int i = 0; i < source.length / 2; i++) {
            temp = source[i];
            source[i] = source[source.length - 1 - i];
            source[source.length - 1 - i] = temp;
        }
        return String.valueOf(source);
    }

    public String reverseString1(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
