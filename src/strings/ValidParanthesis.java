package strings;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Objects;

public class ValidParanthesis {

	private static final Map<Character, Character> PAIRS = Map.of(')', '(', ']', '[', '}', '{');

	public static void main(String[] args) {
		String s = "[{()}]";
		boolean valid = isValid(s);
		System.out.println(valid ? s + " is Valid" : s + " is invalid");
	}

	/**
	 * Validates whether a given string containing only parentheses characters ('(',
	 * ')', '{', '}', '[', ']') is properly balanced.
	 * <p>
	 * A string is considered valid if:
	 * <ul>
	 * <li>Every opening bracket has a corresponding closing bracket of the same
	 * type.</li>
	 * <li>Brackets close in the correct order.</li>
	 * </ul>
	 *
	 * @param s the input string containing parentheses characters
	 * @return true if the string is valid and balanced; false otherwise
	 *
	 *         <p>
	 *         <b>Time Complexity:</b> O(n), where n is the length of the
	 *         string.<br>
	 *         <b>Space Complexity:</b> O(n), used by the stack in the worst case.
	 */
	private static boolean isValid(String s) {
		Deque<Character> stack = new ArrayDeque<>();

		for (char c : s.toCharArray()) {

			// Opening bracket
			if (PAIRS.containsValue(c)) {
				stack.push(c);
				continue;
			}

			// Closing bracket -> must match top of stack
			if (PAIRS.containsKey(c) && (stack.isEmpty() || !Objects.equals(stack.pop(), PAIRS.get(c)))) {
				return false;
			}
		}

		// All openings must be closed
		return stack.isEmpty();
	}
}
