package Array;

import java.util.HashSet;
import java.util.Set;

/**
 * Check if the input array contains duplicates.
 *  Input: [1, 2, 3, 1] 
 *  Output:true 
 *  Time complexity: O(n) 
 *  Space complexity: O(1)
 * 
 **/
public class ArrayContainDuplicates {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 1 };

		System.out.println(containsDuplicates(input));

	}

	public static boolean containsDuplicates(int[] input) {

		Set<Integer> set = new HashSet<Integer>();

		for (int num : input) {
			if (!set.add(num)) {
				return true;
			}
		}
		return false;
	}

}
