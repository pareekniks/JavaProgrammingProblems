
public class Prime {

	public static void main(String[] args) {
	
		int n=98;
		int count=0;
		if(n<1) {
			System.out.println("not prime");
		}
		else if(n==1) {
			System.out.println("prime");
		}
		else {
			int i=1;
			while(i<=n) {
				if(n%i==0) {		
					count++;
				}
				 if(i==n && count ==2) {
					System.out.println("prime");
				}
				else if(count>2) {
					System.out.println("not prime");
					break;
				}
			
				i++;
			
			}
		}

		
		
	}
	

}
