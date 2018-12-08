class CountFactors {

    // 100% code
    public int solution1(int N) {
      int num = 0;
        
      for (int i = 1; i <= (int) Math.sqrt(N); i++) {
          if (N % i == 0) {
              if (i * i == N)
                num = num + 1;
              else 
                num = num + 2;
          }
      }

      return num;
    }
    
    // 91% code
    public int solution2(int N) {
      int cnt = 0;
      int i = 1;

      while ( i * i <= N ) {
            if (N % i == 0) {
                if (i * i == N)
                   cnt += 1;
                else
                   cnt += 2;
            } 
            i++;
      }
      return cnt;
    }
    
}
