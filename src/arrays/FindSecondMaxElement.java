package arrays;

public class FindSecondMaxElement {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 7, 2, 9, 0, 12 };
		int secondMax = findSecondMax(arr);
		System.out.println(secondMax);
	}

	private static int findSecondMax(int[] arr) {
		int max = arr[0];
		int secondMax = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > max) {
				secondMax = max;
				max = num;
			} else if (num > secondMax && num < max) {
				secondMax = num;
			}
		}
		return secondMax;
	}

}
