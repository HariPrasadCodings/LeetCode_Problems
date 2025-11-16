package strings;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		if (isValidPalindrome(s)) {
			System.out.println("String is Valid Palindrome");
		} else {
			System.out.println("String is Invalid palindrome");
		}
	}

	/**
	 * Checks whether a given string is a valid palindrome by considering only
	 * alphanumeric characters and ignoring cases.
	 * <p>
	 * The method uses a two-pointer approach:
	 * <ul>
	 * <li>Left pointer starts from the beginning of the string</li>
	 * <li>Right pointer starts from the end</li>
	 * <li>Both pointers skip non-alphanumeric characters</li>
	 * <li>Characters are compared in a case-insensitive manner</li>
	 * </ul>
	 * A string is considered a valid palindrome if all corresponding characters
	 * from both ends match after ignoring non-alphanumeric characters.
	 *
	 * @param s the input string to validate
	 * @return true if the string is a valid palindrome; false otherwise
	 *
	 *         <p>
	 *         <b>Time Complexity:</b> O(n), where n is the length of the
	 *         string.<br>
	 *         The two pointers move towards the center, scanning each character
	 *         only once.
	 *
	 *         <p>
	 *         <b>Space Complexity:</b> O(1).<br>
	 *         No additional data structures used, only constant extra space.
	 */
	private static boolean isValidPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}

			while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}

			if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			}

			left++;
			right--;
		}
		return true;
	}
}
