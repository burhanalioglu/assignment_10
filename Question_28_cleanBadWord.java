package assignments.assignment_10;

public class Question_28_cleanBadWord {

	public static void main(String[] args) {
//		This method gets two strings (text and badWord) and returns a string. Basicly what it does is take out all the occurrences of badWord in text.


		System.out.println(cleanBadWord("one two three", "two"));
		System.out.println(cleanBadWord("foo bar", "foo"));
		System.out.println(cleanBadWord("he said bla bla bla", "bla"));

	}

	public static String cleanBadWord(String str, String badWord) {
		str = str.replace(badWord, "");

		return str;
	}
}
