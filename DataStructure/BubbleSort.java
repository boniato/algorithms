import java.util.Arrays;

class BubbleSort {
	
  public static void main(String args[]) {
      int[] A = {31, 25, 12, 22, 11};
      getBubbleSort(A);
  }

  public static void getBubbleSort(int[] arr) {
      int temp = 0;

      for(int i=0; i < arr.length; i++) {
         for(int j=1 ; j < arr.length-i; j++) {
              if(arr[j] < arr[j-1]) {
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
              }
          }
      }
     System.out.println(Arrays.toString(arr));
   }
}
