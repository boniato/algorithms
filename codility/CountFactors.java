/**
* 약수의 갯수 구하기
* "만약 √(N)이 정수라면 √(N)은 N의 약수이며, 나머지 약수들은 √(N)를 기준으로 앞 뒤로 짝을 이루고 있다."
* 예)
* 100의 약수 : 1, 2, 4, 5, 10, 20, 25, 50, 100
* √(100)은 10으로 정수이다. 즉 100의 약수는 10을 기준으로 앞 뒤로 짝을 이루고 있다는 것이다. 
* (1, 100), (2, 50), (4, 25), (5, 20)으로 4개의 짝을 이루고 있으므로, 2 * 4 + 1 = 9개가 된다.
* √(N)을 넘어가지 않는 조건으로 (i = 1)부터 for문을 돌려 만약 N이 i로 나눠진다면 1개, 그리고 이 약수는 앞뒤로 짝을 이룰 것이므로, i^2이 N을 넘지 않는다면 1개 증가
**/

class CountFactors {

    // 100% code1
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

    // 100% code2
    public int solution2(int N) {
        int count = 0;
    	for (long long i = 1; i * i <= N ; ++i) { // int 범위로 [1 ~ 약 21억]까지이므로 i^2를 구하기 위해서는 더 큰 범위를 가지는 long long 자료형을 사용
        	if (N % i == 0) {
        		++count;
    			if (i * i < N)
    				++count;	
    		}
    	}	
    	return count; 
    }
    
    // 91% code
    public int solution3(int N) {
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
