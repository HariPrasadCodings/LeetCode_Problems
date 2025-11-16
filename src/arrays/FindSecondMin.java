package arrays;

public class FindSecondMin {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 7, 2, 9, 0, 12, -1 };
		int secondMin = findSecondMin(arr);
		System.out.println(secondMin);
	}

	private static int findSecondMin(int[] arr) {
		int min = arr[0];
		int secondMin = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num < min) {
				secondMin = min;
				min = num;
			} else if (num < secondMin) {
				secondMin = num;
			}
		}
		return secondMin;
	}

}
