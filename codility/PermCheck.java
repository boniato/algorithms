import java.util.Set;
import java.util.HashSet;

class PermCheck {
    public int solution(int[] A) {
        int min = 1000000000;
        int max = 0;
        int res = 1;
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i : A){
        	if (set.contains(i)) {
        		 res = 0;
                 break;
        	}
        	
        	set.add(i);
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        
        if(min != 1) res = 0;
        if(max != A.length) res = 0;
        
        return res;
    }
}
