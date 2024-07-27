
public class Fibonacci {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13
		int t1 = 0;
		int t2 = 1;
		for (int i = 0; i < 10; i++) {
		
			if (i == 0) {
				System.out.println(t1);
				System.out.println(t2);
			}
			int num = t1 + t2;
			System.out.println(num);
			t1 = t2;
			t2 = num;
			

		}

	}

}
