
public class MissingNumberArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5,6, 7, 8 };
		int sum = 0;

		for (Integer b : a) {
			sum = sum + b;
		}

		int sum1 = 0;

		System.out.println(sum);

		for (int i = 1; i <= a.length+1; i++) {
			sum1 = sum1 + i;
		}

		System.out.println(sum1);

		System.out.println(sum1 - sum);

	}

}
