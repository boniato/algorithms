/* long type in Java is 4 byte, and signed long int. 
 * It indicates the range in from –2,147,483,648 to 2,147,483,647.
 * So, I use long type in this algorithm.
 *
 * A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
 * A[P] + A[Q] > A[R],
 * A[Q] + A[R] > A[P],
 * A[R] + A[P] > A[Q].
 *
 * Complexity is as below.
 * expected worst-case time complexity is O(N*log(N))
 * expected worst-case space complexity is O(N) (not counting the storage required for input arguments)
 *
 * https://app.codility.com/demo/results/trainingRZPNC7-38S/
*/


import java.util.Arrays;

class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);

        //if for-clause starts backwards, numbers to compare decrease..
        for( int i=A.length-1; i>=2; i-- ) {
            if( (long)A[i] < ((long)A[i-1] + (long)A[i-2]) ) { //A[P] + A[Q] > A[R]
                return 1;
            }
        }
        return 0;
    }
}
