/**
 * Ceiling of a number - find the index of an smallest number greater than the target element.
 * if target element is not present
 */
package binarySearch;

public class Ceiling {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 15;

		int index = ceiling(arr, target);
		System.out.println(index);
	}

	static int ceiling(int[] arr, int target) {

		// what would we do if the target element is outside the range

		if (target > arr[arr.length - 1]) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;

			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}

		}
		return start;
	}

}
