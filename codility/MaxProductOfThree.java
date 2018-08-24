import java.util.Arrays;

class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);
        int triplet = 3;
        int maxProduct = 1;

        for (int i=1; i<=triplet; i++) {
            maxProduct *= A[A.length-i];
        }
        
        return maxProduct;
    }
}
