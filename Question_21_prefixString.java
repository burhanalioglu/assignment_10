package assignments.assignment_10;

public class Question_21_prefixString {

	public static void main(String[] args) {
//		Given a string, consider the prefix string made of the first n chars of the string. Does that prefix string appear somewhere else in the string?
//				Assume that the string is not empty and that n is in the range from 1 till str.length().
		isPrefixExist("abXYabc", 1);
		isPrefixExist("abXYabc", 2);
		isPrefixExist("abXYabc", 3);
	}

	public static boolean isPrefixExist(String str, int prefixCharSequence) {

		String subStringOfStr = str.substring(0, prefixCharSequence);
		int counter = 0;
		while (str.contains(subStringOfStr)) {
			str = str.replaceFirst(subStringOfStr, "");
			counter++;
		}
		if (counter == 1) {
			System.out.println(subStringOfStr + " appears once only");
			return false;
		} else if (counter == 2) {
			System.out.println(subStringOfStr + " appears twice");
			return true;
		} else {
			System.out.println(subStringOfStr + " appears more than twice...");
			return true;
		}

	}
}
