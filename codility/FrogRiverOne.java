public static int FrogRiverOne(int X, int[] A) {
	    Set<Integer> position = new HashSet<>(); //Set is no duplicate data and no order
	 
	    for (int i = 0; i < A.length; i++) {
	        if (A[i] <= X) { //A[K] represents the position where one leaf falls at time K..
	            position.add(A[i]);
	 
	            if (position.size() == X) {
	                return i;
	            }
	        }
	    }
	 
	    return -1;
}
