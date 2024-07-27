package CodingProblems;

public class GetFactorial {

	public static void main(String[] args) {

		int a = 12;
		int b=12;
		long fact = 1;
		long fact1 = 1;

		while (a > 1) {
			fact = a * fact;
			a--;

		}

		System.out.println(fact);

		
		for(int i=b;i>=1;i--) {		
			fact1=fact1*i;
		}
		
		System.out.println(fact1);
	}

}
