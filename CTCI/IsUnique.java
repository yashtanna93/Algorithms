/**
1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
**/

import java.lang.String;

class IsUnique {

	// O(input) solution with constant space complexity of O(256) + string to store
	public static boolean isUnique(String input) {
		//Considering the support is for ASCII characters which is 256 characters.
		final boolean[] duplicateTracker = new boolean[256];
		for(char inputCharacter: input.toCharArray()) {
			int characterIndex = inputCharacter;
			if(duplicateTracker[characterIndex] == true) {
				return false;
			}
			duplicateTracker[characterIndex] = true;
		}
		return true;
	}

	// O(input * input) solution with not additional space
	public static boolean isUniqueNoAdditionalSpace(String input) {
		for(int slowPointer = 0; slowPointer < input.length() - 1; slowPointer++) {
			for(int fastPointer = slowPointer + 1; fastPointer < input.length(); fastPointer++) {
				if(input.charAt(slowPointer) == input.charAt(fastPointer)) return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Testing for isUnique...");
		assertEquals("Test 1 - ", isUnique("abcde"), true);
		assertEquals("Test 2 - ", isUnique("aabbc"), false);
		assertEquals("Test 3 - ", isUnique("abcda"), false);
		System.out.println("Testing for isUniqueNoAdditionalSpace...");
		assertEquals("Test 1 - ", isUniqueNoAdditionalSpace("abcde"), true);
		assertEquals("Test 2 - ", isUniqueNoAdditionalSpace("aabbc"), false);
		assertEquals("Test 3 - ", isUniqueNoAdditionalSpace("abcda"), false);
	}

	public static void assertEquals(String message, boolean actual, boolean expected) {
		String result = actual == expected ? "PASSED" : "FAILED";
		System.out.println(String.format("%s%s", message, result));
	}
}