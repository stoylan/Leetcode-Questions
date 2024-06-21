import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> valueMap = new HashMap<>();

        for (int i=0;i<nums.length;i++) {
            valueMap.put(nums[i],i);
        }

        for (int i=0;i<nums.length-1;i++) {
            int searchedValue = target - nums[i];
            if (valueMap.containsKey(searchedValue) && valueMap.get(searchedValue) != i) {
                return new int[]{i,valueMap.get(searchedValue)};
            }
        }
        return new int[]{};
    }
}
