// you can also use imports, for example:
// import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

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
                    tempLen = 0;
                } else
                    tempLen = 0;
            } else if(String.valueOf(s).equals("0")) {
                tempLen += 1;
            }
        }
        
        return maxLen;

    }
}
