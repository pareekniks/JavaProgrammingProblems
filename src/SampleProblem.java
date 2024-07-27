import java.util.ArrayList;
import java.util.Arrays;

public class SampleProblem {

	public static void main(String[] args) {

		String input = "my name is nikhil pareek";
		
		char nm[]=new char[input.length()];

		String output="";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				nm[i]=input.charAt(i);
			}
		}

		
		String newString=input.replaceAll(" ","");
		System.out.println(newString);
		
		for(int k=newString.length()-1;k>=0;k--) {
			
			if(nm[k]==' ') {
			
			}
			else {
			nm[k]=newString.charAt(k);
			}
		}
		
		System.out.println(Arrays.toString(nm));

	}

}
