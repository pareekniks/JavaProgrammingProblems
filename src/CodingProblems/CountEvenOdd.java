package CodingProblems;

public class CountEvenOdd {

	public static void main(String[] args) {

		int b = 9091;
		int e = 0;
		int o = 0;
		while (b != 0) {
			int a = b % 10;

			if (a % 2 == 0) {

				e++;
			} else {
				o++;
			}
			b = b / 10;

		}

		System.out.println("Odd number" + o);

		System.out.println("Odd number" + e);
	}

}
