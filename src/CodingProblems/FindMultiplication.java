package CodingProblems;

public class FindMultiplication {

	private static Object num1;

	public static void main(String[] args) {

		String num1 = "123";
		String num2 = "456";

		stringMultiplication(num1,num2);
//		int n1 = Integer.parseInt(num1);
//		int n2 = Integer.parseInt(num2);
//		System.out.println(String.valueOf(n1 * n2));
		
		
		// Input: num1 = "123", num2 = "456"
		// Output: "56088"
	}
	
//	123
//	456
	
	
	public static void stringMultiplication(String a, String b) {		
		int sum=0;	

		int m=0;
		int n=0;
		for(int j=0;j<a.length();j++) {
		m= m*10+a.charAt(j)-'0';
		n= n*10+b.charAt(j)-'0';
	

			}
		
		
		
		//System.out.println(p2);
		//System.out.println(p3);
		for(int i=1;i<=m;i++) {
			sum=(sum+n);							
		}		
	System.out.println(sum);
		
	}
	
	

}
