package CodingProblems;

public class SumOfElement {

	public static void main(String[] args) {

		int a[] = { 2, 6, 7, 8, 9 };
		int sum = 0;

		for (Integer b : a) {
			sum = b + sum;
		}
		System.out.println(sum);
	}

}
