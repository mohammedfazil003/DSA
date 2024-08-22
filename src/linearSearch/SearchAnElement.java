package linearSearch;

public class SearchAnElement {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 8, 1, 4, -8, 12, 19, 20 };
		int target = 19;

		System.out.println(linearSearch(arr, target));
	}

	static int linearSearch(int[] arr, int target) {

		if (arr.length == 0) {
			return Integer.MIN_VALUE;
		}

		// search for an element in an array
		for (int element : arr) {
			if (element == target) {
				return element;
			}
		}

		// if no element is present return the minimum value
		return Integer.MIN_VALUE;
	}

}
