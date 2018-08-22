class PassingCar {
   public int solution(int[] A) {
      int result = 0;
      int count = 0;

      for( int i=0; i<A.length; i++ ) {
        if( A[i] == 0 ) //0 represents a car traveling east
          count++;
        else 
          result += count; //1 represents a car traveling west
      }

      if( result > 1000000000 ) return -1; //return −1 if the number of pairs of passing cars exceeds 1,000,000,000

      return result;
   }
}
