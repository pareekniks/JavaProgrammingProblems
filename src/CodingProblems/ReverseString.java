package CodingProblems;

public class ReverseString {

	public static void main(String[] args) {

		String str = "qtp selenium";
		String rev = "";
		String rev1 = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);

		}

		System.out.println(rev);

		String str1 = "madam";
		char[] a = str1.toCharArray();

		for (int i = a.length - 1; i >= 0; i--) {
			rev1 = rev1 + a[i];

		}

		System.out.println(rev1);
		
		if(str1.equals(rev1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		
		
	}

}
