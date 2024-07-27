
public class AdjacentArray {

	public static void main(String[] args) {

		int a[] = { 9, 8, 101, 6, 56 };
		int diff = 0;
		for (int i = 0; i < a.length - 1; i++) {

			if (diff < Math.abs(a[i] - a[i + 1])) {
				diff = a[i] - a[i + 1];
			}
		}

		System.out.println(Math.abs(diff));

	}

}
