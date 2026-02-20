package Array;

import java.util.Arrays;

/**
 * Move zero's to the end of the array.
 *  Input: [0, 1, 0, 3, 12 ] 
 *  Output: [1, 3, 12, 0 ,0 ] 
 *  Time complexity: O(n) 
 *  Space complexity: O(1)
 */
public class MoveZerosToEnd {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 3, 12 };
		moveZerosToEnd(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void moveZerosToEnd(int[] arr) {

		int pointer = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[pointer] = arr[i];
				pointer++;
			}
		}

		while (pointer < arr.length) {
			arr[pointer] = 0;
			pointer++;
		}

	}

}
