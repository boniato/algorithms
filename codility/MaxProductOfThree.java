import java.util.Arrays;

class MaxProductOfThree {
    
    /* good code (score:100%)
     * If A[0] and A[1] are negative numbers, the product of two numbers will be positive numbers,
     * and multiply it by A[N-1]. The below is the example.
     * {-7, -5, -3, -1, 2}; //6, 70
     * {-5, -3, -1, 2, 7};  //-14, 105
     */
    public static int solution1(int[] A) {
        int N = A.length;
        Arrays.sort(A);
         
        int product1 = A[N-3] * A[N-2] * A[N-1];
        int product2 = A[0] * A[1] * A[N-1];
     
        return product1 > product2 ? product1 : product2;
    }
    
    
    //not good code
    public int solution2(int[] A) {
        Arrays.sort(A);
        int triplet = 3;
        int maxProduct = 1;

        for (int i=1; i<=triplet; i++) {
            maxProduct *= A[A.length-i];
        }
        
        return maxProduct;
    }
}
