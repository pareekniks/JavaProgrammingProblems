package CodingProblems;

public class Test {

	public static void main(String[] args) throws Exception {
		
		try {
			assert false;
			System.out.print("t ");
		} catch (Error e) {
		
			System.out.print("c ");
			throw new Exception();
		}
		finally {
			System.out.print("f");
		}

	}

}
