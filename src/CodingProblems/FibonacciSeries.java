package CodingProblems;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;

		int n = 10;

		// 0 1 1 2 3 5 8

		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < n; i++) {

			int sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;

		}

	}

}
