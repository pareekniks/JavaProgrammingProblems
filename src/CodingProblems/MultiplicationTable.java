package CodingProblems;

public class MultiplicationTable {

	public static void main(String[] args) {

		int num = 5;

		for (int i = 1; i <= 10; i++) {
			int sum = 0;
			for (int j = 0; j < i; j++) {
				sum = sum + num;
			}
			System.out.println(sum);

		}

	}

}
