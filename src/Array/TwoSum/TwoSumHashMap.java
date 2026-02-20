package Array.TwoSum;

import java.util.HashMap;

/**
 * Find two numbers that adds to the target
 *  Input: [1,3,2,7, 11, 15] Target = 9
 * Output: [2,3] as num[2] + num [3] = 2 + 7 = 9 
 * Time complexity: O(n) 
 * Space complexity: O(1)
 */
public class TwoSumHashMap {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 7, 11, 15 };
		int target = 9;

		int[] result = twoSumArray(arr, target);
		System.out.println("The two index whose number matching the target " + result[0] + " " + result[1]);
		System.out.println("the sum of 2 numbers matching the target are, " + arr[result[0]] + " " + arr[result[1]]);
	}

	public static int[] twoSumArray(int[] arr, int target) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			int compliment = target - arr[i];
			if (map.containsKey(compliment)) {
				return new int[] { map.get(compliment), i };
			}
			map.put(arr[i], i);
		}

		return new int[] {};
	}

}
