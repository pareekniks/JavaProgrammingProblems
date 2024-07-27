package CodingProblems;

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "!@#$%^&*niks)(*&^";

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		String s1="Java   Selenium   QTP";
		s1=s1.replaceAll("\\s", "");
		System.out.println(s1);
		

	}

}
