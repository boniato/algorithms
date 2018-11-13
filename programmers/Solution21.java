import java.util.Arrays;

public class Solution21 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 5, 2, 6, 3, 7, 4};
		int[][] val = {{2,5,3},{4,4,1},{1,7,3}};
		solution(arr, val);

	}
	
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++)
	    {
	        int start = commands[i][0];
	        int end = commands[i][1];
	        int k = commands[i][2];
	        int[] tmp = new int[end - start + 1];
	        int a = 0;
	        
	        for(int j = start-1; j<end; j++)
	            tmp[a++] = array[j];
	        
	        Arrays.sort(tmp);
	        
	        answer[i] = tmp[k-1];
	    }
		
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}
