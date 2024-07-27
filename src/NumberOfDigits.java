
public class NumberOfDigits {

	public static void main(String[] args) {
		
		int a =87897879;
		int c=0;
		
		while(a>0) {
			a =a/10;
			c++;		
		}
		System.out.println(c);

		
		
		int n=123456;
		
		int reverse=0;
		
		while(n>0) {
			reverse =reverse*10+n%10;
			n=n/10;
		}
		
		System.out.println(reverse);
	}

}
