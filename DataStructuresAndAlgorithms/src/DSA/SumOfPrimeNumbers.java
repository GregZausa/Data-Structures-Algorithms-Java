package DSA;

public class SumOfPrimeNumbers {
	public static boolean isPrime(int num) {
		if(num < 2) {
		return false;
		}
		for(int i = 2; i * i <= num; ++i) {
			if(num % i == 0)
				return false;
		}
		return true;
		
	}
	public static void primeNumber(int given) {
		int total = 0;
		for(int i = 2; i <= given; ++i) {
			if(isPrime(i)) {
				total += i;
				}
		}
		for(int j = total + 1; ; ++j) {
			if(isPrime(j)) {
				System.out.print(j);
				break;
			}
		}
	}
		
}
