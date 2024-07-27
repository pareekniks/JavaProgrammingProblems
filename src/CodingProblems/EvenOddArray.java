package CodingProblems;

public class EvenOddArray {

	public static void main(String[] args) {

		int a[] = { 4, 8, 9, 5, 7, 19 };

		for (int b : a) {
			if (b % 2 == 0) {
				System.out.println("Its even" + b);
			} else {
				System.out.println("Its odd" + b);
			}
		}

	}

}
