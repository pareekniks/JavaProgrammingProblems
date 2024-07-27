
public class RverseInteger {

	public static void main(String[] args) {
	
		
		int a=54321;
		int reverse=0;
		
		while(a>0) {
			reverse=reverse*10+a%10;
			a=a/10;		
		}
		
		System.out.println(reverse);

	}

}
