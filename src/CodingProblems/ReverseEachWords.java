package CodingProblems;

public class ReverseEachWords {

	public static void main(String[] args) {

		String str = "Welcome To Java";
		
		String rev="";

		String a[] = str.split(" ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=a[i].length()-1;j>=0;j--) {
				rev=rev+a[i].charAt(j);				
			}
		
			rev=rev+" ";
		}
		System.out.println(rev);

	}

}
