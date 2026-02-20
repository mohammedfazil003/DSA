package Array;

import java.util.Arrays;

/**
 * Rotate array to left by k'th position
 *   Input: [1, 2, 3, 4, 5]
 *   Output: [3, 4,5, 1, 2 ] 
 *   Time complexity: O(n)
 *   Space complexity: O(1)
 */
public class LeftRotateArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		leftRotate(arr, k);
		System.out.println(" the left rotation of array " + Arrays.toString(arr));
	}

	public static void leftRotate(int[] arr, int k) {

		int n = arr.length;
		k = k % n;

		// reverse first kth element
		rotate(arr, 0, k - 1);

		// reverse entire element
		rotate(arr, k, n - 1);

		// reverse entire array elements
		rotate(arr, 0, n - 1);
	}

	public static void rotate(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
