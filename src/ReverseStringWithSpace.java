import java.util.Arrays;

public class ReverseStringWithSpace {

	public static void main(String[] args) {

		String s = "my name is mayank nikhil";

		char[] s1 = s.toCharArray();
		char[] e1 = new char[s1.length];

		for (int i = 0; i < s1.length; i++) {

			if (s1[i] == ' ') {
				e1[i] = ' ';
			}

		}

		int j = s1.length - 1;
		for (int i = 0; i < s1.length; i++) {

			if (s1[i] != ' ') {

				if (e1[j] == ' ') {
					j--;
				}

				e1[j] = s1[i];
				j--;

			}

		}

		System.out.println(String.valueOf(e1));
	}
}
//kn ayam si emanym