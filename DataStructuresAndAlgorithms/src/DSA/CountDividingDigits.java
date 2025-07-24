package DSA;

public class CountDividingDigits {

	public static int countDividingDigits(int num) {
	    int original = num;
	    int count = 0;

	    while (num > 0) {
	        int digit = num % 10;
	        if (digit != 0 && original % digit == 0) {
	            count++;
	        }
	        num /= 10;
	    }

	    return count;
	}

}
