class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int right = 0;
	    int left = 0;
	    int sum = 0;
	    int min = 100001; //N is an integer within the range [2..100,000]
	    
	    for (int element : A)
	        right += element; //sum of array A
	        
	    for (int p=1; p < A.length; ++p) {
	        right -= A[p-1]; //10, 9, 7, 3
	        left += A[p-1];  //3, 4, 6, 10
	        sum = Math.abs(right - left); //7, 5, 1, 7
	        
	        if (min > sum) //Find the smallest number
	            min = sum;
	    }
	    
	    return min;
    }
}
