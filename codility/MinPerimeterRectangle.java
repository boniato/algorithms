/**
 * An integer N is given, representing the area of some rectangle.
 *
 * The area of a rectangle whose sides are of length A and B is A * B, and the perimeter is 2 * (A + B).
 *
 * The goal is to find the minimal perimeter of any rectangle whose area equals N. The sides of this rectangle should be only integers.
 *
 * For example, given integer N = 30, rectangles of area 30 are:
 *
 * (1, 30), with a perimeter of 62,
 * (2, 15), with a perimeter of 34,
 * (3, 10), with a perimeter of 26,
 * (5, 6), with a perimeter of 22.
 **/

public class MinPerimeterRectangle {

  private static int solution(int N) {
      int min = Integer.MAX_VALUE;

      for (int i = 1; i <= (int) Math.sqrt(N); i++) {
          if (N % i == 0) {
            int n = 2 * (i + (N/i));

            if(n < min)
              min = n;
          }
      }

   return min;
  }
  
}
