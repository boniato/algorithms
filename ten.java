import java.lang.Math;

class Solution {
  public long solution(long n) {
      long answer = 0;
      
      if( n >= 1 ) {
          double sqrRoot = Math.sqrt(n);
          double numLeft = sqrRoot - (int)sqrRoot;
          answer = (long)sqrRoot+1;

          if( numLeft == 0.0 ) {
              answer *= answer;
          } else {
              answer = -1;
          }
      }
      return answer;
  }
}
