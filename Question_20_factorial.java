package assignments.assignment_10;

public class Question_20_factorial {

	public static void main(String[] args) {
		// In mathematics, the factorial of a positive integer n, denoted by n!, is the
		// product of all positive integers less than or equal to n.
//		Calculate factorial and output result to the console.

		System.out.println(factorial(0));
		System.out.println(factorial(5));

	}

	public static int factorial(int num) {
		if (num < 1) {
			System.out.println("The number you entered must be a positive whole number");
			return 0;
		}
		int result = 1;

		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}

}
