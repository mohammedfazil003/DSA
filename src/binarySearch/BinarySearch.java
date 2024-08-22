/**
 *  Perform binary search in order to find an element
 */

package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { -18, -12, 0, 1, 3, 5, 7, 9, 14, 19, 20 };
		int target = 19;

		int index = binarySearch(arr, target);
		System.out.println(index);
	}

	static int binarySearch(int[] arr, int target) {

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
		return -1;
	}

}
