package linearSearch;

public class MinNumber {

	public static void main(String[] args) {

		int[] arr = { 5, 1, 4, 0, 9, 4, -5 };
		System.out.println(minNum(arr));
	}

	static int minNum(int[] arr) {
		// ASSUME ARRAY IS NOT EMPTY

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}

}
