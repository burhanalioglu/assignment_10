package assignments.assignment_10;

public class Question_31_isPalindrome {

	public static void main(String[] args) {
//		Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.
//		So method isPalindrome checks that and returns true if check is palindrome and false if it is not.
//		- make your conditions case insensitive. ex: Civic and civic are both palindromes
//		- make your conditions space insensitive. Race car is a palindrome even though there is space in between.
		System.out.println(isPalindrome("Noon"));
		System.out.println(isPalindrome("I am not palindrome"));
		System.out.println(isPalindrome("wooden"));
		System.out.println(isPalindrome("Nurses Run"));
	}

	public static boolean isPalindrome(String str) {
		str = str.toLowerCase().replace(" ", "");
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += "" + str.charAt(i);
		}

		return str.equals(reversed);
	}
}
