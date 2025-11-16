package arrays;

public class FindMinimumElement {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 7, 2, 9, 0, 12 };
		int minElement = findMinimum(arr);
		System.out.println(minElement);
	}

	private static int findMinimum(int[] arr) {
		int min = arr[0];
		for (int num : arr) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}

}
