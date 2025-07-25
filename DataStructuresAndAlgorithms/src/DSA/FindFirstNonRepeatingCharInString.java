package DSA;
import java.util.*;

public class FindFirstNonRepeatingCharInString {
	public static int findFirstNonRepeatingCharInString(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); ++i) {
			char  storedChar = s.charAt(i);
			map.put(storedChar, map.getOrDefault(storedChar, 0) + 1);
		}
		for(int j = 0; j < s.length(); ++j) {
			char checkIfRepeat = s.charAt(j);
			if (map.get(checkIfRepeat) == 1) {
			    return j;
			}
		}
		return -1;
	}
}
