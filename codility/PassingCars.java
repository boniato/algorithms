class PassingCars {
    public int solution(int[] A) {
        final int PASSING_CAR_LIMIT = 1000000000;
        int passingCars = 0; // counter for number of passing cars
        int carsTravelingEast = 0;
 
        for (int i = 0; i < A.length; i++) {
        	if (A[i] == 0) {
        		carsTravelingEast++;
        	}
        	
        	if (A[i] == 1 && carsTravelingEast > 0) {
        		passingCars += carsTravelingEast;
        		
        		if (passingCars > PASSING_CAR_LIMIT)
              return -1;
        	}
        }
        
		return passingCars;
    }
}
