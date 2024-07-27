
public class CheckAlpha {

	public static void main(String[] args) {
		char a = 'S';
		int b = a;

		if ((b >= 'a' && b <= 'z') || (b >= 'A' && b <= 'Z')) {

			System.out.println("Its char");

		} else {
			System.out.println("not char");
		}

		System.out.println(getFact(5));
	}

	private static int getFact(int i) {
		if(i==0){
	
			return 1;
		
		}
		else {
		return i*getFact(i-1);	
		}
		
		
	}

}
