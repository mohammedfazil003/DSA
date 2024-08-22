/**
 * ind whether a string is palindrome or not
 */
package string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (isPalindrome(input)) {
			System.out.println("the given string is Palindrome");
		} else {
			System.out.println("the given string is not a Palindrome");
		}
	}

	private static boolean isPalindrome(String input) {

		int left = 0;
		int right = input.length() - 1;

		while (left < right) {
			if (input.charAt(left) != input.charAt(right)) {
				return false;
			}
			left++;
			right--;

		}

		return true;
	}

}
