import java.util.Arrays;
import java.util.Collections;

class Solution {
  public long solution(long n) {
      String strNum = String.valueOf(n);
      String[] arr = strNum.split("");
      
      Arrays.sort(arr);
      Collections.reverse(Arrays.asList(arr));
      String str =  String.join("", arr);
      long answer = Long.valueOf(str);
      
      return answer;
  }
}
