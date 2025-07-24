package DSA;
import java.util.*;

public class IsAnagram {
	public static boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> map = new HashMap<>();
		s = s.replaceAll("\\s", "").toLowerCase();
		t = t.replaceAll("\\s", "").toLowerCase();
		if(s.length() != t.length()) return false;
		for(int i = 0; i < s.length(); ++i){
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for(int j = 0; j < t.length(); ++j) {
			char c = t.charAt(j);
			if(!map.containsKey(c)) return false;
			map.put(c, map.get(c) - 1);
			if(map.get(c) == 0) {
				map.remove(c);
			}
		}
		return map.isEmpty();
	}
}
