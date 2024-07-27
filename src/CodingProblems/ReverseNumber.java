package CodingProblems;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 1234;
		int rev = 0;

		while (num > 0) {
			rev = (rev * 10) + num % 10;
			num = num / 10;
		}

		System.out.println(rev);

		StringBuffer sb = new StringBuffer("9876");
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sb1= new StringBuilder("8765");
		System.out.println(sb1.reverse());

	}

}
