package CodingProblems;

public class CountOccurence {

	public static void main(String[] args) {

		String s = "Java Programming Java oops";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='J') {
				count++;
			}
			
		}
		System.out.println(count);
		

	}

}
