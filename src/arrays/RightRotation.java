package arrays;

import java.util.Arrays;

public class RightRotation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 3;

		System.out.println("Array before rotation: " + Arrays.toString(arr));

		rightRotate(arr, d);

		System.out.println("Array after rotation: " + Arrays.toString(arr));
	}

	/**
	 * Performs a right rotation on the given array by {@code d} positions.
	 * <p>
	 * This method uses the reversal algorithm, which rotates the array in-place
	 * using three steps:
	 *
	 * <ol>
	 * <li>Reverse the entire array</li>
	 * <li>Reverse the first {@code d} elements</li>
	 * <li>Reverse the remaining {@code n - d} elements</li>
	 * </ol>
	 *
	 * <h3>Dry Run (Example)</h3> Given: arr = [1, 2, 3, 4, 5, 6, 7], d = 3 <br>
	 * <br>
	 *
	 * Step 1: Reverse entire array → [7, 6, 5, 4, 3, 2, 1] <br>
	 * <br>
	 *
	 * Step 2: Reverse first d = 3 elements → reverse [7, 6, 5] → [5, 6, 7, 4, 3, 2,
	 * 1] <br>
	 * <br>
	 *
	 * Step 3: Reverse elements from index 3 to 6 → reverse [4, 3, 2, 1] → [5, 6, 7,
	 * 1, 2, 3, 4] <br>
	 * <br>
	 *
	 * Final rotated array → <b>[5, 6, 7, 1, 2, 3, 4]</b>
	 *
	 * <h3>Time Complexity:</h3> O(n) — Each element is swapped a constant number of
	 * times.
	 *
	 * <h3>Space Complexity:</h3> O(1) — In-place rotation with no extra space.
	 *
	 * @param arr the array to rotate
	 * @param d   number of positions to rotate to the right
	 */
	private static void rightRotate(int[] arr, int d) {
		int n = arr.length;
		d = d % n;

		// Step 1: Reverse whole array
		reverse(arr, 0, n - 1);

		// Step 2: Reverse first d elements
		reverse(arr, 0, d - 1);

		// Step 3: Reverse last n - d elements
		reverse(arr, d, n - 1);
	}

	/**
	 * Reverses the portion of the array from index {@code left} to {@code right}.
	 */
	private static void reverse(int[] arr, int left, int right) {
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}
