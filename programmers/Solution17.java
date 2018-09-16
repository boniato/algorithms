class Solution {
  public int[] solution(long n) {
      int[] answer = {};
      String temp = String.valueOf(n);
      int len = temp.length();
      answer = new int[len];

      int cnt = len;
      for(int i=0; i<len; i++) {
          answer[i] = Integer.parseInt( String.valueOf(temp.charAt(--cnt)) );
      }

      return answer;
  }
}
