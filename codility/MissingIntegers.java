import java.util.Set;
import java.util.HashSet;

class MissingIntegers {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
	    int max = 0;
	    int retVal = 1;
	    
	    for( int i=0; i<A.length; i++ ) {
	    	if( i>0 && A[i] >= A[i-1] ) {
		    	if( max < A[i] ) 
		    		max = A[i];
	    	}
	    	set.add(A[i]);
	    }
	    
	    if( max > -1 ) { 
		    for ( int j=1; j <= max; j++ ) {
		    	if ( !set.contains(j) ) {
		    		retVal = j;
		    		break;
		        } else {
		        	retVal = max+1;
		        }
		    }
	    }
	 
	    return retVal;
    }
}
