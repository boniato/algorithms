class InsertionSort {
	public static void main(String args[]) {
		int[] A = {31, 25, 12, 22, 11};
		getInsertionSort(A);
	}

	public static void getInsertionSort(int[] array) {
        int currVal, i ,j;
        
        for(i=1; i<array.length; i++) {
            currVal = array[i];
            
            for(j=i; j>0; j--) {
                if(array[j-1] > currVal) {
                    array[j] = array[j-1]; // insert biggest number
                }else{
                    break;
                }
            }
            array[j] = currVal; // insert smallest number
        }
        
        /*for(i=0; i<array.length; i++) {
        	System.out.println(array[i]);
        }*/
    }
}
