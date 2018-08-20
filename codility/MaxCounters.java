class MaxCounters {
    public int[] solution(int N, int[] A) {
	    int[] counters = new int[N];
	    int maxOfCntrs = 0; //max value of array counters
	    int maxOfA = 0;		//max value of array A
		
	    for (int i=0; i<A.length; ++i) {

    		if(A[i] >= 1 && A[i] <= N) { // A[i] = X, 1 ≤ X ≤ N
    			
    			if(counters[A[i]-1] < maxOfA ) {
    				counters[A[i]-1] = maxOfA+1;
    			} else {
    				++counters[A[i]-1];
    			}
    			
    			if(maxOfCntrs < counters[A[i]-1]) {
    				maxOfCntrs = counters[A[i]-1];
    			}
    			
    		} else if(A[i] == (N+1)) { // A[i] = N+1, A[i] is max value of array A
				maxOfA = maxOfCntrs;
		    }
	    }
	    
	    for(int j=0; j<N; j++) {
	    	if(counters[j] < maxOfA) {
	    		counters[j] = maxOfA;
	    	}
	    }
	 
	    return counters;
    }
}
