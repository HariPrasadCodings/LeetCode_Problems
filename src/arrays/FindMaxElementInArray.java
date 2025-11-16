package arrays;

public class FindMaxElementInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 7, 2, 8, 9, 12, 10 };
		int maxElement = findMaximum(arr);
		System.out.println(maxElement);
	}

	private static int findMaximum(int[] arr) {
		int max = arr[0];

		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

}
