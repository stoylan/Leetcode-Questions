import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        // 1 1 1 2 3 4 4
        //1 2
        for (int i =0;i<nums.length;i++) {
            numsMap.put(nums[i],i);
        }

        for (int i=0;i<nums.length;i++) {
            if (numsMap.get(nums[i]) != i) {
                return true;
            }
        }
        return false;
    }
}
