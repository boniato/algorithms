public static int TapeEquilibrium(int[] A) {
	    int right = 0;
	    int left = 0;
	    int sum = 0;
	    int min = 100001;
	    
	    for (int it : A)
	        right += it;
	    	//System.out.println(right);
	        
	    for (int p=1; p < A.length; ++p) {
	        right -= A[p - 1]; //10, 9, 7, 3
	        left += A[p - 1];  //3, 4, 6, 10
	        sum = Math.abs(right - left); //7, 5, 1, 7
	        
	        if (min > sum) // find the smallest number
	            min = sum;
	    }
	    
	    return min; 
	}
