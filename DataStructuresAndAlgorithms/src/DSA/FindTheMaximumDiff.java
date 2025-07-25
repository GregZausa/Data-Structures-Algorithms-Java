package DSA;

public class FindTheMaximumDiff {

	public static int findTheMaximumDiff(int [] num) {
		int minSoFar = num[0];
		int currentMaxDiff = 0;
		for(int i = 0; i < num.length; ++i) {
			int maxDiff = num[i] - minSoFar;
			if(maxDiff > currentMaxDiff) {
				currentMaxDiff = maxDiff;
			}
			if(num[i] < minSoFar) {
				minSoFar = num[i];
			}
		}
		return currentMaxDiff;
	}
}
