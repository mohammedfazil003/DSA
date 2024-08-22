/**
 * check if the given strings are anagram or not

 */
package string;

import java.util.Arrays;

public class StringsIsAnagram {

	public static void main(String[] args) {

		String s1 = "silent";
		String s2 = "listen";

		char[] cs1 = s1.toCharArray();
		char[] cs2 = s2.toCharArray();

		Arrays.sort(cs1);
		Arrays.sort(cs2);

		if (Arrays.equals(cs1, cs2)) {
			System.out.println("the given strings " + s1 + " and " + s2 + " are equal");
		} else {
			System.out.println("the given strings " + s1 + " and " + s2 + " are not equal");
		}

	}

}
