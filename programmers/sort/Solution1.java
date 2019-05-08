/**
* K번째수
* https://programmers.co.kr/learn/courses/30/lessons/42748
*/

import java.util.Arrays;

class Solution1 {
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
