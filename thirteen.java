class Solution {
  public boolean solution(int x) {
      boolean answer = false;
      
      if (x>0 && x<=10000) {
          int divisor = Integer.parseInt((String.valueOf(x)).substring(0,1)) + Integer.parseInt((String.valueOf(x)).substring(1));

          for (int i=1; i<=x; i++) {
              if ((x%divisor) == 0)
                answer = true;  
          }
      }

      return answer;
  }
}
