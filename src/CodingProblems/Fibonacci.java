package CodingProblems;
import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;

		ArrayList<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		int i = 0;
		while (i < 7) {

			a = a + b;
			list.add(a);
			int temp = a;
			a = b;
			b = temp;
			i++;

		}
		System.out.println(list);

	}

}
