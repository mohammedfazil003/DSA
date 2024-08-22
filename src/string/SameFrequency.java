/**
 * Given a string s, return true if s is a "good" string, or false otherwise.
A string s is good if all characters that appear in s have the same number of
occurrences (i.e., the same frequency).
 */
package string;

public class SameFrequency {

	public static void main(String[] args) {
		String input = "aazzddss";
		System.out.println(areSameOccurance(input));
	}

	static boolean areSameOccurance(String input) {

		char[] ch = new char[26];
		for (char s : input.toCharArray()) {
			ch[s - 'a']++;
		}

		int frequency = 0;
		for (int i = 0; i < 26; i++) {
			if (ch[i] != 0) {
				if (frequency == 0) {
					frequency = ch[i]; // set the first non-zero frequency
				} else if (frequency != ch[i]) {
					return false;
				}
			}

		}

		return true;

	}

}
