/**
 * https://leetcode.com/problems/palindrome-number
 * Runtime: 7 ms, Memory: 38.1 MB
 * Time complexity : O(logn) or O(log10(n))
 * cf.) https://github.com/boniato/algorithms/blob/master/etc/Palindrome
**/

public class PalindromeNumber {
    public static void main(String args[]) {
        int x = 1000030001; // 0; // -123;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        // This can be omitted. (생략 가능함) 
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return false;
        }

        if (x < 0) {
            return false;
        }

        if (x % 10 == 0) {
            return false;
        }

        char[] str = String.valueOf(x).toCharArray();
        int len = str.length - 1;
        int mid = len / 2;

        for (int i=0; i<=mid; i++) {
            if (str[i] != str[len-i]) {
               return false;
            }
        }

            return true;
    }

}
