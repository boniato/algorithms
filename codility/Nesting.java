/*
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1) (not counting the storage required for input arguments).
 */

import java.util.LinkedList;
import java.util.Queue;

class Nesting {
    
    public int solution1(String S) {
        //if (S.isEmpty()) return 1;  //The result of this algorithm is the same, whether there is this clause or not.
        
        int counter = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(')
                counter++;
            if (S.charAt(i) == ')')
                counter--;
            if (counter < 0)  //If String S has ")))", counter is -3.
                return 0;
        }

        return counter == 0 ? 1 : 0;
    }
    
    
    public int solution2(String S) {
	Queue<Character> que = new LinkedList<>();

	for (int i = 0; i < S.length(); i++) {
		if (S.charAt(i) == '(') {
			que.offer('(');
		} else { // character is ')', if que is empty, S has more ')' than '('
			if (que.isEmpty())
				return 0;
			
			que.poll();
		}
	}
		
        //if there are no "que.size() != 2", the solution returned a wrong answer (got 1 expected 0)
	return que.size() != 2 && que.size() % 2 == 0 ? 1 : 0;
    }
    
}
