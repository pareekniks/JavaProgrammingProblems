import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMatcher {

	public static void main(String[] args) {
		String input="JavaprogrammingPythonprogramming";
		Matcher m= Pattern.compile("programming").matcher(input);
		int count=0;
		   while(m.find())// finding pattern in regular expression  
		    {  
		    count =count+1;  
		    
	
		System.out.println(" Start : "+m.start()+", End : "+m.end()+" Pattern group : "+m.group());  
		    }  
		   
		   System.out.println(count);
	
	   
	}

}
