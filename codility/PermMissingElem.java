class PermMissingElem {

    public static void main (String args []) {
    	int[] A = {2, 3, 1, 5};
    	solution(A);
    }
    
    public satatic int solution(int[] A) {
        int N = A.length+1; //The first element of an array starts zero(0).
        boolean[] numPresent = new boolean[N + 1]; //each default value of elements is fault.
        
        for (int i = 1; i < N; i++) {
            if (A[i-1] >= N) {
                continue;
            }
            if (!numPresent[A[i-1]]) {
                numPresent[A[i-1]] = true; //finding rignt number 
            }
        }
        
        int missingNum = 1;
        for (int j = 1; j < numPresent.length; j++) {
            if (!numPresent[j]) {
                missingNum = j;
                break;
            }
            missingNum++;
        }
        return missingNum;
    }
}
