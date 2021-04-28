package assignments.assignment_10;

public class Question_26_uniqueChars {

	public static void main(String[] args) {
//		uniqueChars is a method that you will code now, should be able to accept any string in the word and return unique characters from the parameter.
		System.out.println(uniqueChars("java"));
		System.out.println(uniqueChars("mama"));
		System.out.println(uniqueChars("spoon"));
	}

	public static String uniqueChars(String str) {
		String uniqueString = "";

		for (int i = 0; i < str.length(); i++) {
			if (!uniqueString.contains("" + str.charAt(i))) {
				uniqueString += "" + str.charAt(i);
			}
		}
		return uniqueString;
	}

}
