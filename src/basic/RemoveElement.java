/**
 * Remove an target element using two-pointer method.
 */
package basic;

public class RemoveElement {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 77, 8, 33, 22, 44, 22, 1 };
		int target = 22;

		System.out.println(removeElement(arr, target));

	}

	static int removeElement(int[] arr, int target) {

		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != target) {
				arr[i] = arr[j];
				i++;
			}
		}
		return i ;
	}
}
