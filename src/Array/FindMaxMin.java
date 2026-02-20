package Array;

/**
 * Find the maximum and minimum element in an array 
 * Input : [3, 5, 1, 9, 2, 8]
 * Output : Max = 9, Min = 1 
 * Time complexity = 0(n) Space = 0(1)
 */
public class FindMaxMin {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 9, 2, 8 };
		int[] result = findMaxMin(arr);
		System.out.println("The Min value is: " + result[0] + ", Max value is: " + result[1]);

	}

	public static int[] findMaxMin(int[] arr) {

		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("ARRAY IS EMPTY");

		}

		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return new int[] { min, max };
	}

}
