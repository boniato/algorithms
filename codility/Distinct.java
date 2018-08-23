import java.util.Arrays;

class Distinct {
    public static int solution(int[] A) {
          Arrays.sort(A);

          //If there are no follow if-clause, extreme_empty error occurs.
          if (A.length == 0) return 0;
          if (A.length == 1) return 1;

          int count = 1;
          for (int i = 0; i < A.length-1; i++) {
              if (A[i] != A[i + 1])
                  count++;
          }

          return count;
    }
}
