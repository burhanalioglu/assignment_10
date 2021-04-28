package assignments.assignment_10;

public class Question_18_repeatedWord {

	public static void main(String[] args) {
		// Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
		repeatWord("Word", "X", 3);
		repeatWord("This", "And", 2);
		repeatWord("This", "And", 1);
	}

	public static void repeatWord(String word, String separator, int times) {
		String result = "";

		for (int i = 0; i < times; i++) {
			result += word + separator;
		}
		System.out.println(result.substring(0, result.lastIndexOf(separator)));

	}
}
