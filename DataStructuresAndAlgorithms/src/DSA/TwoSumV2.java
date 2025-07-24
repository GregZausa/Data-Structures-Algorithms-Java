package DSA;
import java.util.*;

public class TwoSumV2 {

	public static Set<List<Integer>> twoSumV2(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		Set<List<Integer>> set = new HashSet<>();
		for(int i = 0; i < nums.length; ++i) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				List<Integer> pair = Arrays.asList(complement, nums[i]);
				set.add(pair);
			}
			map.put(nums[i], i);
		}
		return set;
	}

}