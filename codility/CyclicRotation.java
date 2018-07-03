// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] answer = A;
		 
		if( K >= 0 && K <= 100 ) {
		
			for( int i=0; i<K; i++ ) {
				
				int tempArr[] = new int[A.length];
				tempArr[0] = answer[A.length-1]; //fill first element in array..
				
				for( int j=0; j<A.length-1; j++ ) {
					tempArr[j+1] = answer[j]; //fill the other elements in array..
				}
				 
				answer = tempArr;
				 
			 }
		}
		 
		 return answer;
    }
}
