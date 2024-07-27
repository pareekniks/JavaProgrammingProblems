import java.util.Scanner;

public class PrintAnInteger {

	public static void main(String[] args) {

	//	Scanner sc = new Scanner(System.in);
//		int a =sc.nextInt();
//		System.out.println(a);

		
		char c= 'a';
		System.out.println();
		
		int num=959;
		int num1=num;
		
		int reverseNum = 0;
		
		while(num>0) {
			reverseNum = reverseNum*10+num%10;
			num =num/10;
		}
		
		if(num1 ==reverseNum) {
			System.out.println(reverseNum+ "palindrome");
		}
		else {
			System.out.println(reverseNum+"not palindrome");
		}
	}

}
