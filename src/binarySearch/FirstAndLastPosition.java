/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */
package binarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {

	public static void main(String[] args) {

		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;

		int[] ans = searchInRange(nums, target);
		System.out.println(Arrays.toString(ans));
	}

	// search in the range and before binary search two times to find the start and
	// end index
	static int[] searchInRange(int[] nums, int target) {

		int[] result = { -1, -1 };

		result[0] = binarySearch(nums, target, true);
		if (result[0] != -1) {
			result[1] = binarySearch(nums, target, false);
		}

		return result;
	}

	static int binarySearch(int[] nums, int target, boolean startIndex) {
		int start = 0;
		int end = nums.length - 1;
		int ans = -1;

		while (start <= end) {

			int mid = start + (end - start) / 2;
			if (target > nums[mid]) {
				start = mid + 1;

			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				ans = mid;
				if (startIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}
		return ans;
	}

}
