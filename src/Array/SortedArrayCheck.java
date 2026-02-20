package Array;

/**
 * Check if an array is sorted,
 *  Input: [1, 2, 3, 4]
 *  Output : true/false
 *  Time Complexity: 0(n)
 *   Space Complexity: 0(1)
 */
public class SortedArrayCheck {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		boolean result = isSorted(arr);
		System.out.println("the given array is = " + result);
	}

	static boolean isSorted(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}

		return true;
	}

}
