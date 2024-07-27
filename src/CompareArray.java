import java.util.ArrayList;
import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {

		int a[] = { 2, 5, 6, 9 };
		int b[] = { 1, 5, 8, 0 };
		ArrayList<Integer> ab = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {

			if (a[i] == b[i]) {
				ab.add(a[i]);
			}
		}

		Object[] c = ab.toArray();
		System.out.println(Arrays.toString(c));
	}

}
