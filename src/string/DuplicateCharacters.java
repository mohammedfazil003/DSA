/**
 * find the duplicate characters in a string
 */
package string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String input = "Welllcome";
		findDuplicates(input);
	}

	static void findDuplicates(String input) {
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();

		for (char ch : input.toCharArray()) {
			charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
			}
		}

	}

}
