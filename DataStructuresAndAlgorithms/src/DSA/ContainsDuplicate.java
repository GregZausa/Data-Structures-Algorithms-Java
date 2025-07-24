package DSA;
import java.util.*;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
	    Set<Integer> seen = new HashSet<>();
	    for (int num : nums) {
	        if (seen.contains(num)) {
	            return true;
	        }
	        seen.add(num);
	    }
	    return false;
	}

}
