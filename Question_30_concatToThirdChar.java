package assignments.assignment_10;

public class Question_30_concatToThirdChar {

	public static void main(String[] args) {
//		This method gets a string and an int, it returns a string. What it does is to limit the inputted string to a creating number of characters.
		System.out.println(at3("longword", "foo"));
		System.out.println(at3("blabla", "a"));

	}

	public static String at3(String str1, String str2) {

		str1 = str1.substring(0, 3).concat(str2).concat(str1.substring(3));

		return str1;
	}
}
