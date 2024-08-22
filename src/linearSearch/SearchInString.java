/**
 * Search a character in the given string.
 */
package linearSearch;

public class SearchInString {

	public static void main(String[] args) {

		String name = "Animal";
		char ch = 'm';

		System.out.println(search(name, ch));

	}

	static boolean search(String name, char ch) {

		if (name.length() == 0) {
			return false;
		}

		for (int i = 0; i < name.length(); i++) {
			if (ch == name.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}
