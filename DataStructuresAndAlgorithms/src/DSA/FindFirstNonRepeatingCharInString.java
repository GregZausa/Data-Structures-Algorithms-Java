package DSA;
import java.util.*;

public class FindFirstNonRepeatingCharInString {
	public static int findFirstNonRepeatingCharInString(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); ++i) {
			char repeat = s.charAt(i);
			map.put(repeat, map.getOrDefault(repeat, 0) + 1);
		}
		for(int j = 0; j < s.length(); ++j) {
			char repeat = s.charAt(j);
			if (map.get(repeat) == 1) {
			    return j;
			}
		}
		return -1;
	}
}
