import java.util.Set;
import java.util.HashSet;

class MissingInteger {
    public int solution(int[] A) {
       int smallestVal = 1;
        HashSet<Integer> set = new HashSet<>();
    
        for(int i=0; i<A.length; ++i){
            if(A[i]<1) continue;
            if(set.add(A[i])){
                while(set.contains(smallestVal)){
                    smallestVal++;
                }
            }
        }
    
        return smallestVal;
    }
}
