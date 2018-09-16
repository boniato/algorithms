class Solution {
  
  //solution1
  public int[] solution1(long n) {
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
  
  //solution2
  public int[] solution2(long n) {
	  int length = Long.toString(n).length();
      int[] answer = new int[length];

      for (int i = 0; i < length; i++) {
          answer[i] = (int) (n % 10); //12345%10=5, 1234%10=4, ..
          n /= 10; // 12345/10=1234, 1234/10=123, ..
      }
      return answer;
  }
  
  //solution3
  public int[] solution3(long n) {
	  int[] answer = {};
      String strLong = Long.toString(n);

      answer = new int[strLong.length()];
      for (int i = 0; i < strLong.length(); i++) {
    	  String str = ""+strLong.charAt((strLong.length()-i) -1);
          answer[i] = Integer.parseInt(str);
      }
      return answer;
  }
  
}
