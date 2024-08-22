/**
 * Swap two numbers without using the third variable
 */
package basic;

public class SwapNumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("the swapped number a is " + a + " and b is " + b);
	}
}
