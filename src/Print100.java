
public class Print100 {

	public static void main(String[] args) {
	

		print100('d'/'d');

	}

	private static void print100(int i) {
		
		if(i<='d') {
			System.out.println(i);
			print100(++i);
		}
		
	}

}
