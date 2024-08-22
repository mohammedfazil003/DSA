/**
 *  Count the number of words in a string
 */
package string;

import java.util.HashMap;
import java.util.Map;

public class CountWordsInString {

	public static void main(String[] args) {

		String words = "Hello marry Hello Fazil Hello Rahul marry";
		System.out.println(countWords(words));

	}

	static Map<String, Integer> countWords(String words) {
		Map<String, Integer> wordsCount = new HashMap<String, Integer>();

		String[] wordsArray = words.split(" ");

		for (String word : wordsArray) {
			wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
		}

		return wordsCount;

	}

}
