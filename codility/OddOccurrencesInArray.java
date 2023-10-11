/**
 * Given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
 * For example, given array A such that:
 *   A[0] = 9  A[1] = 3  A[2] = 9
 *   A[3] = 3  A[4] = 9  A[5] = 7
 *   A[6] = 9
 * the function should return 7
**/

public int solution(int[] A) {
      Set valSet = new HashSet<>(); //Set: There is no sequences(order) and no duplicate values

      for (int val : A) {
        if (valSet.contains(val) == false) {
              valSet.add(val);
              continue;
          }

          valSet.remove(val);
      }

      Iterator iter = valSet.iterator();
      int res = (int)iter.next();
      return res;
}
