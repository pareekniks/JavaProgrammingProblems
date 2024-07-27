package CodingProblems;

public class FindMissing {

	public static void main(String[] args) {

		int a[] = { 3, 1, 2, 4, 6, 5, 8, 9 };
		int sum = 0;
		int sum1 = 0;
		
		System.out.println(a.length);

		for (int i = 1; i <= a.length+1; i++) {
			sum = sum + i;

		}

		for (int j = 0; j < a.length; j++) {
			sum1 = sum1 + a[j];

		}

		System.out.println(sum-sum1);

	}

}
