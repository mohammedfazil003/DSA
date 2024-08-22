/**
 *  Reverse a given string
 */
package string;

public class ReverseAString {

	public static void main(String[] args) {

		String str = "hello World";
		String result = reverse1(str);
		System.out.println(result);
	}

	static String reverse(String str) {

		StringBuilder strBuilder = new StringBuilder(str);
		return strBuilder.reverse().toString();
	}

// Write a Java Program to reverse a string without using String inbuilt function.

	static String reverse1(String str) {

		char[] ch = str.toCharArray();

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;

			left++;
			right--;
		}

		return new String(ch);

	}

}