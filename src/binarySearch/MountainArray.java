/**
 * https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/lectures/10-binary%20search/code/src/com/kunal/Mountain.java
 */
package binarySearch;

public class MountainArray {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 5, 20, 3 };
		System.out.println(peakElement(arr));
	}

	static int peakElement(int[] arr) {
		// TODO Auto-generated method stub

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > arr[mid + 1]) {
				// this might be one of the possible solution

				end = mid;
			} else {
				start = mid + 1;
			}
		}

		return arr[start];
	}

}
