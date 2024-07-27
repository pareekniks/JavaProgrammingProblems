package CodingProblems;

public class CountDigit {

	public static void main(String[] args) {
		
		int a=8979998;
		
		String str= String.valueOf(a);
		
		System.out.println(str.length());
		
		int b=888889899;
		int c=0;
		
		while(b!=0) {
			b=b/10;
			c++;
		}
		System.out.println(c);
		
		
		

	}

}
