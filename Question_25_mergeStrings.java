package assignments.assignment_10;

public class Question_25_mergeStrings {

	public static void main(String[] args) {
//		When gears merge and work together, one tooth from each one goes in order.
//		Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one. Please note one and two can be of different lengths. 

		System.out.println(mergeStrings("12345", "abcde"));
		System.out.println(mergeStrings("wooden", "spoon"));
		System.out.println(mergeStrings("java", "selenium"));
	}

	public static String mergeStrings(String str1, String str2) {

		String mergedString = "";

		int minLength = Math.min(str1.length(), str2.length());
		
		for (int i = 0; i < minLength; i++) {
			mergedString += "" + str1.charAt(i) + str2.charAt(i);
		}
		
		mergedString += str1.substring(minLength) + str2.substring(minLength);
		
		return mergedString;
	}
}
