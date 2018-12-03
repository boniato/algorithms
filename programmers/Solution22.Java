class Solution22 {
  
  public boolean solution1(String s) {
    int length = s.length();
    if(length != 4 && length != 6) return false;
      
    for(int i=0; i<length; i++) {
        char c = s.charAt(i);
        if(c < '0' || c > '9') {
            return false;
        }
    }
    return true;
  }
  
  public boolean solution2(String s) {
      boolean answer = true;
	      
      if(s.length() != 4 && s.length() != 6) return false; //If there is this sentence, it will not pass!
      
      if( s.length() >= 1 && s.length() <= 8 ) {
          for( int i=0; i<s.length(); i++ ) {
              if( ! s.matches("-?\\d+(\\.\\d+)?") ) {  //find whether there are string in s or not
                  answer = false;
                  break;
              }
          }
      }

      return answer;
  }
  
}
