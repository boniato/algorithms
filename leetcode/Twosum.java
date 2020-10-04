import java.util.Arrays;
import java.util.HashMap;

public class Twosum {

    public static void main(String args[]) {
        int nums[] = {2,11,7,15};
        int target = 9;

        int res[] = twoSum(nums, target);
        System.out.println(Arrays.toString(res));

    }

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
    
}
