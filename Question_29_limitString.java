package assignments.assignment_10;

public class Question_29_limitString {

	public static void main(String[] args) {
//		This method gets a string and an int, it returns a string. What it does is to limit the inputted string to a creating number of characters.
		System.out.println(limitString("abcd", 2));
		System.out.println(limitString("bla bla", 3));

	}

	public static String limitString(String str, int limit) {
		str = str.substring(0, limit);

		return str;
	}
}
