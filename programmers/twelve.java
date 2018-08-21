public class Solution {
	
  public int solution1(int n) {
	    int result;
	    int a = 0;
	    int b = 1;
	         
      if(n==0) return 0;
      else if(n==1) return 1;
      else {
        for(int i=1; i<n; i++) {
          result = a + b;
          a = b;
          b = result;
        }
      }
      
      return b;
  }
    
  public int solution2(int n) {
	int answer = 0;
	     
     	if(n<=1) {
	   return n;
     	}else{
	   answer = solution(n-2) + solution(n-1);
     	}
	     
	return answer;
  }
    
}
