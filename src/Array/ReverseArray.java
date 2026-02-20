package Array;

import java.util.Arrays;

/**
 * Reverse an array using two pointers.
 *  Input : [1, 2, 3, 4, 5] 
 *  Output : [5, 4, 3, 2, 1] 
 *  Time Complexity : O(n) 
 *  Space Complexity : O(1)
 */
public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] output = reverseArray(arr);
		System.out.println("reversed array: " + Arrays.toString(output));

	}

	public static int[] reverseArray(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;

		}
		return arr;
	}

}
