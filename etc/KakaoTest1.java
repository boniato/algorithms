package codility;

public class KakaoTest1 {

	public static void main(String[] args) {

		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
//		int n = 6;
//		int[] arr1 = {46, 33, 33, 22, 31, 50};
//		int[] arr2 = {27, 56, 19, 14, 14, 10};
		
		String[] map = solution(n, arr1, arr2);
		
		//print
		for( int i=0; i<n; i++ ) {
			System.out.print("\"" + map[i] + "\"");
			if(i < n-1) System.out.print(", ");
		}
	}
	
	public static String[] solution(int n, int arr1[], int arr2[]) {
		
		int[] bitArr1 = null;
		int[] bitArr2 = null;
		String[] result = new String[n];
		StringBuilder temp = new StringBuilder();

		for(int i=0; i<n; i++) {
			
			bitArr1 = getBinary(n, arr1[i]); //convert arr1[i] to binary
			bitArr2 = getBinary(n, arr2[i]); //convert arr2[i] to binary
			
			//compare to each bit array
			temp.setLength(0);
			for( int j=0; j<n; j++ ) {
				if( (bitArr1[j] | bitArr2[j]) == 1 ) {
					temp.append("#"); 
				} else {
					temp.append(" "); 
				}
			}
			result[i] = temp.reverse().toString();
		}
		return result;
	}
	
	public static int[] getBinary(int n, int arrVal){
		
		int i = 0;
		int[] bitArr = new int[n];
		
		for( ; arrVal != 1; i++ ) {
			bitArr[i] = arrVal % 2;
			arrVal = arrVal/2;
		}
		bitArr[i] = arrVal;
		
		return bitArr;
	}
}
