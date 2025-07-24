package DSA;

import java.util.Arrays;

public class ReverseArray {

	public static void transferZero() {
		int arr[] = {};
		int left = 0;
		int right = arr.length - 1;
		while(left < right) {
			if(arr[left] == 0) {
				
			}
			left++;
			right--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
