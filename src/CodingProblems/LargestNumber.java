package CodingProblems;

public class LargestNumber {

	public static void main(String[] args) {

		int a = 9099;
		int b = 90900;
		int c = 1099;

		if (a > b && a > c) {
			System.out.println("A is largest");
		} else if (b > a && b > c) {
			System.out.println("B is largest");
		} else {
			System.out.println("C is largest");
		}

	}

}
