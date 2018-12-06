// you can also use imports, for example:
// import java.util.*;

// Solution Result: https://app.codility.com/demo/results/trainingG8UY7Y-KNG/

class CyclicRotation2.java {

  public static void main (String[] args) {
		int[] A = {3, 8, 9, 7, 6};
		int K = 3;
		System.out.println(Arrays.toString(solution(A, K)));
		
	}

  public static int[] solution(int[] A, int K) {
	    int[] result = new int[A.length];
	 
	    for (int i=0; i<A.length; i++) {
	        int idx = (i + K) % A.length; //3, 4, 0, 1, 2
	        //ex) 3=(0+3)%5, 4=(1+3)%5, 0=(2+3)%5, 1=(3+3)%5, 2=(4+3)%5
	        result[idx] = A[i]; //3, 8, 9, 7, 6
	    }
	 
	    return result;
	}
}
