/*
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1) (not counting the storage required for input arguments).
 *
 * my answer URL : https://app.codility.com/demo/results/trainingPWC93R-SRE/
 */

class Nesting {
    public int solution(String S) {
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
}
