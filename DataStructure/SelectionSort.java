class SelectionSort {
	
	 public static void main(String args[]) {
		int[] A = {9,1,6,8,4,3,2,0};
		getSelectionSort(A);
	 }

   public static void getSelectionSort(int[] list) {
        int indexMin, temp;

        for (int i=0; i<list.length-1; i++) {
            indexMin = i;
            
            for (int j=i+1; j<list.length; j++) {
                if (list[j] < list[indexMin])
                    indexMin = j;
            }

            temp = list[indexMin];	//0, 1, 2, 3, 4, 6, 8 
            list[indexMin] = list[i];	//9, 1, 6, 8, 4, 8
            list[i] = temp;		//0, 1, 2, 3, 4, 6, 8
        }

        System.out.println(Arrays.toString(list));
   }
}
