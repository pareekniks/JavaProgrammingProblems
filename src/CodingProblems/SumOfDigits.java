package CodingProblems;

public class SumOfDigits {

	public static void main(String[] args) {

		int a = 10101;
		int sum = 0;

		while (a  > 0) {

			sum = sum + a % 10;
			a = a / 10;
		}
		
		System.out.println("Sum of digits are "+ sum);
		
		int d=0;
	String c=	String.valueOf(10101);
	for(int i=0;i<c.length();i++) {
		d=d+Integer.parseInt(String.valueOf(c.charAt(i)));
	}
	
	System.out.println(d);
	}

}
