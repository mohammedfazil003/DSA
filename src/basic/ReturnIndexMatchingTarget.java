/**
 * An array of integers nums and an integer target, return indices
of the two numbers such that they add up to target
 */
package basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReturnIndexMatchingTarget {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 13 };
		int target = 9;

		System.out.println(Arrays.toString(twoIndex(nums, target)));

	}

	static int[] twoIndex(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement)) {
				return new int[] { numMap.get(complement), i };
			}

			numMap.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
