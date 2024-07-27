package CodingProblems;

public class X {

	public static void main(String[] args) {
		try {
			badMethod();
			System.out.println("A");
			
		} catch (Exception e) {
			System.out.println("B");
		}finally {
			System.out.println("C");
		}
		System.out.println("D");
		
		
		int randNumber=(int) (Math.random()*100);
		System.out.println(randNumber);

	}

	public static void badMethod() {
		
		
	}

}
