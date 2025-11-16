package arrays;

import java.util.Arrays;

public class LeftRotation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 }; // Expected: 4,5,6,7,1,2,3
		int d = 3;

		System.out.println("Before left rotation: " + Arrays.toString(arr));
		leftRotate(arr, d);
		System.out.println("After left rotation: " + Arrays.toString(arr));
	}

	/**
	 * Performs a left rotation on the given array by {@code d} positions.
	 * <p>
	 * This method uses the **Reversal Algorithm**, which works in three steps:
	 * <ol>
	 * <li>Reverse the first {@code d} elements</li>
	 * <li>Reverse the remaining {@code n - d} elements</li>
	 * <li>Reverse the entire array</li>
	 * </ol>
	 * The final result is the array rotated left by {@code d} positions.
	 *
	 * <h3>Dry Run (Example: arr = [1,2,3,4,5,6,7], d = 3)</h3>
	 * 
	 * <pre>
	 * Step 1: Reverse first d elements (0 to 2)
	 * [3, 2, 1, 4, 5, 6, 7]
	 *
	 * Step 2: Reverse remaining elements (3 to 6)
	 * [3, 2, 1, 7, 6, 5, 4]
	 *
	 * Step 3: Reverse whole array (0 to 6)
	 * [4, 5, 6, 7, 1, 2, 3]
	 * </pre>
	 *
	 * @param arr the input array to rotate
	 * @param d   the number of positions to rotate to the left
	 *
	 *            <p>
	 *            <b>Time Complexity:</b> O(n)<br>
	 *            Each reversal is linear, and we perform 3 reversals → O(n)
	 *            </p>
	 *
	 *            <p>
	 *            <b>Space Complexity:</b> O(1)<br>
	 *            Rotation is done in-place without additional memory.
	 *            </p>
	 */
	private static void leftRotate(int[] arr, int d) {
		int n = arr.length;

		// To handle cases where d > n
		d = d % n;

		// Reverse first d elements
		rotateSubArray(arr, 0, d - 1);

		// Reverse remaining elements
		rotateSubArray(arr, d, n - 1);

		// Reverse entire array
		rotateSubArray(arr, 0, n - 1);
	}

	/**
	 * Reverses the elements in the array between the provided left and right
	 * indices.
	 *
	 * @param arr   the array to modify
	 * @param left  starting index of the subarray
	 * @param right ending index of the subarray
	 */
	private static void rotateSubArray(int[] arr, int left, int right) {
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}
