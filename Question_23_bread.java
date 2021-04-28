package assignments.assignment_10;

public class Question_23_bread {

	public static void main(String[] args) {
//		A sandwich is two pieces of bread with something in between. 
//		Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

		System.out.println(breadToBread("breadjambread"));
		System.out.println(breadToBread("xxbreadjambreadyy"));
		System.out.println(breadToBread("xxbreadapple"));
		System.out.println(breadToBread("breadbutterbread"));
		System.out.println(breadToBread("johnDoe"));
		System.out.println(breadToBread(""));

	}

	public static String breadToBread(String str) {
		String result = "";

		int firstIndex = str.indexOf("bread");
		if (firstIndex == -1) {
			return "nothing";
		}

		result = str.substring(firstIndex + 5);

		int lastIndex = result.lastIndexOf("bread");
		if (lastIndex == -1) {
			return "nothing";
		}

		result = result.substring(0, lastIndex);

		return result;

	}

}
