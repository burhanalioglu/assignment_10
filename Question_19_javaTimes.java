package assignments.assignment_10;

public class Question_19_javaTimes {

	public static void main(String[] args) {
		// Return the number of times that the string "java" appears anywhere in the
		// given string word.
		System.out.println(javaTimesOther("javaxjava"));
		System.out.println(javaTimesOther("javaxjavaapplepearjavaegg"));
		System.out.println(javaTimes("javaxjava"));
		System.out.println(javaTimes("javaxjavaapplepearjavaegg"));
	}

	public static int javaTimes(String str) {
		int counter = 0;
		while (str.contains("java")) {
			str = str.replaceFirst("java", "");
			counter++;
		}
		return counter;
	}

	public static int javaTimesOther(String str) {
		int counter = 0;

		for (int i = 0; i < str.length() - 3; i++) {
			if (str.substring(i, i + 4).equals("java")) {
				counter++;
			}

		}

		return counter;
	}
}
