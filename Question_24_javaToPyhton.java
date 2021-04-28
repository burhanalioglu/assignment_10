package assignments.assignment_10;

public class Question_24_javaToPyhton {

	public static void main(String[] args) {
//		Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
		System.out.println(javaToPython("We study java not python"));
		System.out.println(javaToPython("What's the difference between java, javascript and python?"));
		System.out.println(javaToPython2("We study java not python"));
		System.out.println(javaToPython2("What's the difference between java, javascript and python?"));

	}

	public static boolean javaToPython(String str) {
		int javaCounter = 0;
		int pyhtonCounter = 0;

		while (str.contains("java")) {
			str = str.replaceFirst("java", "");
			javaCounter++;
		}
		while (str.contains("python")) {
			str = str.replaceFirst("python", "");
			pyhtonCounter++;
		}
		return javaCounter == pyhtonCounter;
	}

	public static boolean javaToPython2(String str) {
		int javaCounter = 0;
		int pyhtonCounter = 0;

		for (int i = 0; i < str.length() - 3; i++) {
			if (str.substring(i, i + 4).equals("java")) {
				javaCounter++;
			}
		}
		for (int i = 0; i < str.length() - 5; i++) {
			if (str.substring(i, i + 6).equals("python")) {
				pyhtonCounter++;
			}
		}
		return javaCounter == pyhtonCounter;
	}
}
