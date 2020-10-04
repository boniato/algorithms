import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Twosum {

    public static void main(String args[]) {
        int nums[] = {2,11,7,15};
        int target = 9;

        int res[] = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    /* soultion1
     * time complexity : O(N)
     * Runtime: 1 ms
     * Memory Usage: 38.7 MB
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer res;

        for (int i=0; i<nums.length; i++) {
            res = map.get(nums[i]);

            if (res == null) {
                map.put(target - nums[i], i);
            } else {
                return new int[]{res, i};
            }
        }

        return new int[]{1,2};
    }
    
     /* soultion2
     * time complexity : O(N)
     * Runtime: 1 ms
     * Memory Usage: 38.9 MB
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            
            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), i} ;
            }
            
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
    
}
