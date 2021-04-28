package assignments.assignment_10;

public class Question_27_coverString {

	public static void main(String[] args) {
//		coverString method will take 2 string parameters from the caller. Your job is to write an important code that will :
//		- to search and find each appearance of coverME within main
//		- then surround it with [coverMe] (square brackets)
//		- if you cannot find the coverME within main after tirelessly looping then just return whole main itself covered [main].
//		- keep in mind that coverME value can be of any length.
		System.out.println(coverString("java methods", "me"));
		System.out.println(coverString("Certified Wooden Spoon", "o"));
		System.out.println(coverString("hello hello", "ello"));
		System.out.println(coverString("apples", "pears"));
		System.out.println(coverString("", "pears"));

	}

	public static String coverString(String str1, String cover) {
		String coveredStr1 = "";

		if (str1.contains(cover)) {
			coveredStr1 = str1.replace(cover, "[" + cover + "]");
		} else {
			coveredStr1 = str1.replace(str1, "[" + str1 + "]");
		}

		return coveredStr1;
	}
}
