// you can also use imports, for example:
// import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

/**
* Given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
* For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
* Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
**/

import java.util.*;

class BinaryGap {
    public int solution(int N) {
        // write your code in Java SE 8
        // Integet to Binary
        String binaryStr = Integer.toBinaryString(N);

        // Binary to Character
        char[] chr = binaryStr.toCharArray();

        int tempLen = 0;
        int maxLen = 0;

        for( char s : chr ) {
            if( String.valueOf(s).equals("1") ) {
                if( tempLen >= maxLen ) {
                    maxLen = tempLen;
                }
                    tempLen = 0;
            } else if(String.valueOf(s).equals("0")) {
                tempLen += 1;
            }
        }
        
        return maxLen;

    }
}
