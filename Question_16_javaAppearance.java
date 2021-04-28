package assignments.assignment_10;

public class Question_16_javaAppearance {

	public static void main(String[] args) {
//	Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". 
//	The string should be 4 and more characters.
//		Sample Output:
//		     input: javapython	     output: true
//		     input: cjavac++	     output: true
//		     input: c#javaruby	     output: false

		System.out.println(javaAppearance("javapython"));
		System.out.println(javaAppearance("cj"));
		System.out.println(javaAppearance("c#javaruby"));

	}

	public static boolean javaAppearance(String str) {
		if (str.length() < 4) {
			System.out.println("too short to eveluate...");
			return false;
		} else {
			return str.indexOf("java") == 0 || str.indexOf("java") == 1;
		}

	}
}
