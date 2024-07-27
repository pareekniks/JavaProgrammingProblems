package CodingProblems;

public class SumOfArray {

	public static void main(String[] args) {

		int a[] = { 4, 8, 9, 5, 7, 19 };

		int sum = 0;

		int sum1 = 0;

		for (Integer b : a) {
			sum1 = sum1 + b;
		}

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		System.out.println(sum);
		System.out.println(sum1);

	}

}
