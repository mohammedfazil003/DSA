/**
 * Given no is a prime number or not
 */
package basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// let the user enter the number
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(isPrime(number));
	}

	static boolean isPrime(int number) {
		boolean isPrime = true;

		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

}
