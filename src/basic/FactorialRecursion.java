/**
 * factorial using recursion
 */
package basic;

public class FactorialRecursion {

	public static void main(String[] args) {

		int number = 5;
		int result = factoNumber(number);
		System.out.println(result);
	}

	static int factoNumber(int number) {

		if (number == 1) {
			return 1;
		}

		return number * factoNumber(number - 1);
	}
}
