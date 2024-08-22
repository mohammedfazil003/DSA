/**
 * largest element in the given array.
 */
package basic;

public class LargestElementInArray {

	public static void main(String[] args) {

		int[] arr = { 4, 99, 13, 66, 87 };
		int largest = LargestElement(arr);
		System.out.println(largest);
	}

	static int LargestElement(int[] arr) {
		int maxNumber = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxNumber) {
				maxNumber = arr[i];
			}
		}
		return maxNumber;
	}

}
