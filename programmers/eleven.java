class Solution {
  public boolean solution(String s) {
      boolean answer = true;
	      
      if( s.length() >= 1 && s.length() <= 8 ) {
          for( int i=0; i<s.length(); i++ ) {
              if( !s.matches("-?\\d+(\\.\\d+)?") ) {  //find whether there are string in s or not
                  answer = false;
                  break;
              }
          }
      }

      return answer;
  }
}
