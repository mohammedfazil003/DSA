/**
 * Remove duplicates from an array.
 */
package basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 2, 4, 5 };
		Set<Integer> set = new HashSet<Integer>();
		for (int num : nums) {
			set.add(num);
		}

		Integer[] arr = set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(arr));
	}

}
