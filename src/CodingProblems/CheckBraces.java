package CodingProblems;

import java.util.Stack;

public class CheckBraces {

	public static void main(String[] args) {
		String s = "({[]})";

		char[] a = s.toCharArray();

		Stack<Character> st = new Stack<>();
		
		for(Character c:a) {
			if(c == '{' || c == '[' || c == '('){
				st.push(c);
			}
			else {
				if((c==']') && st.pop()=='[') {
					continue;
				}
				else if(((c=='}') && st.pop()=='{')) {
					continue;
				}
				else if(((c==')') && st.pop()=='(')) {
					continue;
				}
				
				else {
					System.out.println("Not Valid");
				}
			}
		}

	}

}
