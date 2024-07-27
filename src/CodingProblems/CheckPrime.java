package CodingProblems;

public class CheckPrime {

	public static void main(String[] args) {
	
		int number=2;
		int count=0;
		for(int i=1;i<=number/2;i++) {
			if(number%i==0) {
				count++;
			}
			
			
		}
		if(count>1) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println(" Prime");
		}

	}

}
