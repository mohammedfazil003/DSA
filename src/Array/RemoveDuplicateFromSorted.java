package Array;

/**
 * Remove duplicates from the sorted array.
 *  Input : [1 ,2, 2, 3, 4, 4, 5]
 *  Output: [1, 2, 3, 4, 5]
 *  Time Complexity: O(n)
 *  Space Complexity: O(1)
 */

public class RemoveDuplicateFromSorted {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
		int length = removeDuplicateFromSorted(arr);
		System.out.println("total length of sorted array without duplicates is " + length);

		// sorted array with duplicates removed
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int removeDuplicateFromSorted(int[] arr) {

		if (arr.length == 0) {
			return 0;
		}

		int pointer = 1;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] != arr[i - 1]) {
				arr[pointer] = arr[i];
				pointer++;
			}
		}

		return pointer;
	}

}
