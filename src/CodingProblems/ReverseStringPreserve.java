package CodingProblems;

public class ReverseStringPreserve {

	public static void main(String[] args) {

		String s = "my name is nikhil";

		char a[] = s.toCharArray();
		char temp;

		for (int i = 0, j = s.length() - 1; i < j;) {

			if (!(Character.isSpaceChar(a[i])) && !(Character.isSpaceChar(a[j]))) {

				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;

			} else if (!Character.isAlphabetic(a[i])) {
				i++;
			} else if (!Character.isAlphabetic(a[j])) {
				j--;
			}
		}

	}

}
