import java.util.HashMap;

public class Dominator {

	public static void main(String[] args) {
		int[] A = new int[] { 3, 4, 3, 2, 3, -1, 3, 3 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		if (A.length == 1)
			return 0;

		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) {
				if (map.get(A[i]) >= A.length / 2) {
					return i;
				} else {
					map.put(A[i], map.get(A[i]) + 1); // input same element's count to value of map
				}
			} else {
				map.put(A[i], 1);
			}
		}

		return -1;
	}

}
