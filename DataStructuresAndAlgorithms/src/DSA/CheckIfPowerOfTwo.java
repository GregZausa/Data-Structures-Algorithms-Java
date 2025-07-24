package DSA;

public class CheckIfPowerOfTwo {

	public static boolean checkIfPowerOfTwo(int n) {
		if(n <= 0) return false;
		for(int i = 0; ; ++i) {
			int powerOfTwo =  (int)Math.pow(2, i);
			if(powerOfTwo == n) return true;			
			if(powerOfTwo > n) return false;
		}
	}
}
