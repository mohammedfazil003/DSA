/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
 */
package binarySearch;

public class SmallestLetters {

	public static void main(String[] args) {

		char[] letters = { 'c', 'f', 'j' };
		char target = 'a';

		char result = nextGreaterChar(letters, target);
		System.out.println(result);
	}

	static char nextGreaterChar(char[] letters, char target) {

		int start = 0;
		int end = letters.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;
			if (target < letters[mid]) {

				end = mid - 1;

			} else {
				start = mid + 1;
			}

		}
		return letters[start % letters.length];
	}

}
