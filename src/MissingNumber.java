
public class MissingNumber {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
		int sum = 0;

		for (int n : a) {
			sum = sum + n;
		}
		System.out.println(sum);

		int sum1=0;
		
		for(int j=0;j<=9;j++) {
			sum1=sum1+j;
		}
		
		System.out.println(sum1-sum);
	}

}
