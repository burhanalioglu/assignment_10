package assignments.assignment_10;

public class Question_17_alphabet {

	public static void main(String[] args) {
		// Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.
		toAlphabet('B', 'O');
	}
public static void toAlphabet (char firstChar, char endChar) {
	
	while (firstChar<=endChar) {
		System.out.print(firstChar);
		firstChar++;
	}
	
}
}
