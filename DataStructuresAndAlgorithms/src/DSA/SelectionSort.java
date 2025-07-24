package DSA;

public class SelectionSort {

	public static int selectionSort(int [] arr, int target) {
		
		int left = 0, right = arr.length - 1;
		while(left <= right) {
			int mid = (left * right) / 2;
			if(mid == target) {
				return mid;
			}
			else if(mid < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return left;
	}
}
