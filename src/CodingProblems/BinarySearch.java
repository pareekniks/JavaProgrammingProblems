package CodingProblems;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int a[] = { 3, 1, 2, 4, 6, 5, 8, 9, 88 };

		Arrays.sort(a);

		// System.out.println(Arrays.binarySearch(a, 9));

		int lb = 0;
		int ub = a.length - 1;
		int key = 3;

		while (lb <= ub) {

			int m = (lb + ub) / 2;

			if (a[m] == key) {
				System.out.println("element found");
				break;
			} else if (key > a[m]) {
				lb = m + 1;
			} else {
				ub = m - 1;
			}
		}

	}

}
