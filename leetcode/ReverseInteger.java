/*
https://leetcode.com/problems/reverse-integer
Runtime: 5ms, Memory: 38.4 MB
*/

public class ReverserInteger {

    public static void main(String args[]) {
        int x = -2147483648; //0; //123; //1534236469;
        System.out.println("reverse : " + reverse(x));
    }

    public static int reverse(int x) {
        boolean isNegative = x < 0;
        if (isNegative && (x * -1L > Integer.MAX_VALUE)) {
            return 0;
        }

        x = Math.abs(x);

        char[] charArr = String.valueOf(x).toCharArray();
        char[] reverseArr = new char[charArr.length];

        int len = charArr.length;
        for (int i=0; i<len; i++) {
            reverseArr[i] = charArr[len-i-1];
        }

        String reverseStr = String.valueOf(reverseArr);

        Long tempRes = isNegative ? Long.valueOf(reverseStr) * -1 : Long.valueOf(reverseStr);
        // Constraints : -231 <= x <= 231 - 1
        if ( tempRes < Integer.MIN_VALUE || tempRes > (Integer.MAX_VALUE -1) ) {
            return 0;
        }

        return isNegative ? Integer.valueOf(reverseStr) * -1 : Integer.valueOf(reverseStr);
    }

}
